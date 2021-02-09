package com.portal.otodom.Configuration;

import com.portal.otodom.Models.User;
import com.portal.otodom.Services.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserDataConfig {

    private UserService userService;

    public UserDataConfig(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;

        User user1 = new User();
        user1.setUsername("miszu98");
        user1.setPassword(passwordEncoder.encode("123"));
        user1.setPhoneNumber("513739350");
        user1.setEmail("michal.malek98@wp.pl");
        user1.setRole("ROLE_ADMIN");
        userService.addUser(user1);

        User user2 = new User();
        user2.setUsername("user");
        user2.setPassword(passwordEncoder.encode("123"));
        user2.setPhoneNumber("567678987");
        user2.setEmail("user@wp.pl");
        user2.setRole("ROLE_USER");
        userService.addUser(user2);


    }
}
