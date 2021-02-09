package com.portal.otodom.Controller;

import com.portal.otodom.Models.Offer;
import com.portal.otodom.Models.User;
import com.portal.otodom.Models.UserDTO;
import com.portal.otodom.Services.CacheOfferService;
import com.portal.otodom.Services.EmailService;
import com.portal.otodom.Services.OfferService;
import com.portal.otodom.Services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class WebController {

    private OfferService offerService;
    private CacheOfferService cacheOfferService;
    private UserService userService;
    private PasswordEncoder passwordEncoder;
    private EmailService emailService;

    public WebController(OfferService offerService, CacheOfferService cacheOfferService, UserService userService, PasswordEncoder passwordEncoder, EmailService emailService) {
        this.offerService = offerService;
        this.cacheOfferService = cacheOfferService;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.emailService = emailService;
    }

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/home";
    }

    @GetMapping("/db")
    public String redirectToDb() {
        return "redirect:/h2-console";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("offers", offerService.getAllOffers());
        return "home";
    }

    @PostMapping("/selected-offer")
    public String getSelected(@RequestParam("id") Long id) {
        cacheOfferService.clearCache();
        for (Offer offer : offerService.getAllOffers()) {
            if (offer.getId().equals(id)) {
                cacheOfferService.addToCache(offer);
                break;
            }
        }
        return "redirect:/offer-detail";
    }

    @GetMapping("/offer-detail")
    public String getOfferDetail(Model model) {
        model.addAttribute("cache", cacheOfferService.getCache());
        return "offer-detail";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(@ModelAttribute("newuser") UserDTO userDTO) {
        return "register";
    }

    @GetMapping("/search")
    public String search(Model model) {
        model.addAttribute("searchparam", new Offer());
        return "search";
    }

    @PostMapping("/search-offer")
    public String searchOfferByTitle(@RequestParam String title) {
        cacheOfferService.clearCache();
        for (Offer x : offerService.getAllOffers()) {
            if (title.split(" ").length > 2) {
                if (x.getTitle().equals(title)) {
                    cacheOfferService.addToCache(x);
                }
            } else if (title.split(" ").length <= 2) {
                if (x.getCity().equals(title)) {
                    cacheOfferService.addToCache(x);
                }
            }

        }
        return "redirect:/offer-detail";

    }

    @GetMapping("/filtered-off")
    public String filteredSite(Model model) {
        model.addAttribute("filtered", cacheOfferService.getCache());
        return "filtered-offers";
    }


    @PostMapping("/search-by-region")
    public String searchByRegion(@RequestParam("region") String region) {
        cacheOfferService.clearCache();
        for (Offer offer : offerService.getAllOffers()) {
            if (offer.getRegion().equals(region)) {
                cacheOfferService.addToCache(offer);
            }
        }
        return "redirect:/filtered-off";
    }

    @GetMapping("/my-acc")
    public String myAcc(Principal principal, Model model) {
        String user = "Witaj " + principal.getName() + "!";
        model.addAttribute("luser", user);

        List<Offer> listOfOffers = new ArrayList<>();
        for (User x : userService.getAllUsers()) {
            if (x.getUsername().equals(principal.getName())) {
                for (Offer z : offerService.getAllOffers()) {
                    if (z.getAuthorId().equals(x.getId())) {
                        listOfOffers.add(z);
                    }
                }
                break;
            }
        }
        model.addAttribute("youroffers", listOfOffers);
        return "my-acc";
    }

    @PostMapping("/delete-offer")
    public String deleteYourOffer(@RequestParam Long id) {
        for (Offer x : offerService.getAllOffers()) {
            if (x.getId().equals(id)) {
                offerService.deleteOffer(x);
                break;
            }
        }
        return "redirect:/my-acc";
    }

    @GetMapping("/forgot")
    public String forgotPassword() {
        return "forgot-password";
    }

    @PostMapping("/set-new-password")
    public String setNew(@RequestParam String email, @RequestParam String password) {
        for (User user : userService.getAllUsers()) {
            if (user.getEmail().equals(email)) {
                System.out.println("Stare haslo: " + user.getPassword());
                System.out.println("Nowe hasło: " + password);
                user.setPassword(passwordEncoder.encode(password));
                userService.addUser(user);
                break;
            }
        }
        return "redirect:/login";
    }

    @PostMapping("/reg")
    public String reg(@Valid @ModelAttribute("newuser") UserDTO userDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register";
        }
        User user = new User(userDTO.getUsername(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getPhoneNumber(), "ROLE_USER");
        emailService.sendEmail(user);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.addUser(user);
        return "redirect:/home";
    }

    @GetMapping("/new-offer")
    public String newOffer(Model model, Principal principal) {
        model.addAttribute("createoffer", new Offer());
        model.addAttribute("princ", principal.getName());
        return "new-offer";
    }

    @PostMapping("/create-new-offer")
    public String createOffer(Offer offer, Principal principal) {
        for (User user : userService.getAllUsers()) {
            if (user.getUsername().equals(principal.getName())) {
                offer.setAuthorId(user.getId());
            }
        }
        offerService.addOffer(offer);
        return "redirect:/home";
    }

}
