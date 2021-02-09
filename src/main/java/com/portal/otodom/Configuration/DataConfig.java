package com.portal.otodom.Configuration;

import com.portal.otodom.Models.Offer;
import com.portal.otodom.Services.OfferService;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    private OfferService offerService;

    public DataConfig(OfferService offerService) {
        this.offerService = offerService;
        Offer offer1 = new Offer();
        offer1.setTitle("Nowe mieszkanie w inwestycji Malownik");
        offer1.setImg("https://ireland.apollo.olxcdn.com/v1/files/eyJmbiI6InVtemVtOWV3aThodzItQVBMIiwidyI6W3siZm4iOiJqMWozbzEzbTZiZ24xLUFQTCIsInMiOiIxNCIsInAiOiIxMCwtMTAiLCJhIjoiMCJ9XX0.dNVnFagLQGX10m_P2ViKZ5QlMt2IDfOKkivOr8yxoQE/image;s=1280x1024;q=80");
        offer1.setDescription("Osiedle Malownik swoją nazwę wzięło od płynącego nieopodal strumyka, który jest naturalnym, rozpoznawalnym elementem dzielnicy Podlesie, kojarzonej z zielenią i wypoczynkiem. Dzielnica ma charakter typowo podmiejski, nie znajdziemy tutaj zabudowy charakterystycznej dla dużych ośrodków miejskich, przeważa zabudowa jednorodzinna. Atutem lokalizacji jest oczywiście bliskość dużych kompleksów leśnych, ciągnących się pomiędzy Katowicami i Tychami, w których znajdziemy dużą liczbę ścieżek rowerowych i pieszych.\n" +
                "\n" +
                "Zabudowa osiedla Malownik tworzona jest z myślą o osobach pragnących odnaleźć spokojną, kameralną i cichą okolicę do zamieszkania, jednocześnie w bardzo dobrze skomunikowanym miejscu. W bezpośrednim sąsiedztwie osiedla znajduje się Dom Kultury i boisko sportowe. ");
        offer1.setNumberOfRooms(2);
        offer1.setFloor(1);
        offer1.setKindOfBuilding("blok");
        offer1.setAddress("Piotrowice - Ochojec, Sołtysia 40");
        offer1.setRent(1000);
        offer1.setSurface(45.17F);
        offer1.setCity("Katowice");
        offer1.setRegion("Śląskie");
        offer1.setPrice(305000);
        offer1.setEmail("janusz.kwiatkowski@wp.pl");
        offer1.setPhoneNumber(678413908);
        offer1.setAuthorId(0L);
        offerService.addOffer(offer1);

        Offer offer2 = new Offer();
        offer2.setTitle("Przestronne mieszkanie z tarasem i ogrodem");
        offer2.setImg("https://ireland.apollo.olxcdn.com/v1/files/eyJmbiI6Imp0djF3ZDVwdTBoczEtQVBMIiwidyI6W3siZm4iOiJqMWozbzEzbTZiZ24xLUFQTCIsInMiOiIxNCIsInAiOiIxMCwtMTAiLCJhIjoiMCJ9XX0.TjGE20Z7NbQz533XV7S4W6nu18czQbiqcHRxpH8dnFU/image;s=1280x1024;q=80");
        offer2.setDescription("Bardzo ładne mieszkanie trzypokojowe z aneksem kuchennym oraz łazienką znajdujące się na parterze kameralnego budynku dwupiętrowego. Dodatkową zaleta apartamentu jest bardzo korzystna poludniowo- zachodnia ekspozycja okien. Do mieszkania przynależy ogród z tarasem.\n" +
                "\n" +
                "\n" +
                "\"Osiedle Malownik\"\n" +
                "\n" +
                "Apartamenty gotowe do zamieszkania!!!\n" +
                "\n" +
                "PIERWSZY ETAP BUDOWY ZAKOŃCZONY\n" +
                "\n" +
                " \n" +
                "\n" +
                "Zapraszamy do bezpośredniego kontaktu – umów się na spotkanie i zobacz mieszkanie na żywo.\n" +
                "\n" +
                "2-pokojowe o powierzchni od 45 m2 (48 mieszkań)\n" +
                "3-pokojowe o powierzchni od 54 do 59 m2 (32 mieszkania)\n" +
                "4-pokojowe o powierzchni od 65 do 88 m2 (28 mieszkań)\n" +
                "Wykończenie budynków:\n" +
                "\n" +
                "-Energooszczędna i bardzo dobrze docieplona konstrukcja ścian (20 cm), pustaki ceramiczne o grubości 25 cm \n" +
                "\n" +
                "-Elewacja pokryta tynkiem silikonowym i dekorodeską\n" +
                "\n" +
                "-Szklane balustrady\n" +
                "\n" +
                "-Wysokiej klasy energooszczędne okna PCV z wkładami pięciokomorowymi (trzy szyby) \n" +
                "\n" +
                "-Drzwi antywłamaniowe\n" +
                "\n" +
                "-Nowoczesne centralne ogrzewanie z kotłowni gazowej \n" +
                "\n" +
                "-filtry antysmogowe\n" +
                "\n" +
                "-W opcji możliwość zamówienia smart home, rolet zewnętrznych oraz klimatyzacji.\n" +
                "\n" +
                "- W każdym budynku cichobieżne windy przystosowane dla osób niepełnosprawnych\n" +
                "\n" +
                "-komórki lokatorskie \n" +
                "\n" +
                "Osiedle:\n" +
                "\n" +
                "-Na terenie osiedla znajdują się tereny zielone z miejscami przeznaczonymi do wypoczynku oraz patio i plac zabaw\n" +
                "\n" +
                "-garaże podziemne oraz parking naziemny\n" +
                "\n" +
                "-Osiedle ogrodzone, posiada kontrole dostępu\n" +
                "\n" +
                "-Ochrona na miejscu\n" +
                "\n" +
                "-Teren ogrodzony \n" +
                "\n" +
                "-wideo domofony");
        offer2.setNumberOfRooms(3);
        offer2.setFloor(0);
        offer2.setKindOfBuilding("blok");
        offer2.setCity("Katowice");
        offer2.setAddress("Piotrowice - Ochojec, Sołtysia 40");
        offer2.setRegion("Śląskie");
        offer2.setAuthorId(0L);
        offer2.setSurface(58.96F);
        offer2.setRent(500);
        offer2.setPrice(350000);
        offer2.setEmail("kacper.mikiciuk@onet.pl");
        offer2.setPhoneNumber(560913456);
        offerService.addOffer(offer2);

        Offer offer3 = new Offer();
        offer3.setTitle("Stylowe 4-pokojowe mieszkanie w kamienicy z 1900 r");
        offer3.setImg("https://ireland.apollo.olxcdn.com/v1/files/eyJmbiI6InZ2M3o2YjhwenR0czItQVBMIiwidyI6W3siZm4iOiJqMWozbzEzbTZiZ24xLUFQTCIsInMiOiIxNCIsInAiOiIxMCwtMTAiLCJhIjoiMCJ9XX0.uu_081VNnznoV_B2FwNpIURSDoZEmJA2PYfWGXme4jY/image;s=1280x1024;q=80");
        offer3.setDescription("Czy poszukujesz apartamentu w przedwojennej kamienicy, wysokiego, z klimatycznymi drzwiami, skrzynkowymi oknami i pod najlepszym warszawskim adresem? Czy docenisz ciszę w centrum miasta? Czy nie chcesz przeprowadzać drogich i czasochłonnych remontów i szukasz mieszkania po generalnym remoncie, do wejścia od zaraz? Czytaj dalej: pojawiło się właśnie mieszkanie idealne!\n" +
                "\n" +
                "W SKRÓCIE:\n" +
                "Optymalna powierzchnia ponad 80 mkw, na której znajduje się salon z kuchnią, dwie sypialnie oraz gabinet, łazienka i oddzielne dodatkowe WC. Mieszkanie położone na piątym, ostatnim piętrze przedwojennej kamienicy z windą, właśnie przeszło gruntowny remont. Wysoki standard wykończenia, czyli m.in.: drewno, gładzie, strefowe ogrzewanie podłogowe.\n" +
                "\n" +
                "CO WYRÓŻNIA TO MIESZKANIE?\n" +
                "Mieszkanie w klimatycznej kamienicy wg projektu Wacława Heppena, z windą, na piątym, ostatnim piętrze. Wysokość prawie 350 cm. Stan świeżo po generalnym remoncie. Cisza w centrum tętniącego życiem miasta. Balkon, duże okna.\n" +
                "\n" +
                "LOKALIZACJA:\n" +
                "Mieszkanie położone w oficynie ponad 100-letniej kamienicy przy ul. Wilczej, ciche, widne, latem chłodne, zimą przyjemnie ciepłe. W pobliżu pełna infrastruktura: sklepy, puby, restauracje, galerie, centra handlowe, metro i tramwaje.\n" +
                "\n" +
                "STAN MIESZKANIA:\n" +
                "Lokal po generalnym remoncie, świeżo wykończony: nowe tynki, wszystkie instalacje, podłogi, meble, sprzęty. W gabinecie zabytkowy piec kaflowy z porcelanowymi płytkami. W salonie możliwość podłączenia kominka. Przygotowane do założenia klimatyzacji- instalacja gotowa. Przemyślane rozwiązania: duże szafy, zakamarki- powiększające przestrzeń i niezaburzające porządku w mieszkaniu. Ładne, stonowane kolory, nowe sprzęty AGD. Drewniane drzwi i okna w idealnym stanie.\n" +
                "\n" +
                "ZAPROSZENIE:\n" +
                "Jeśli poszukujesz takiego mieszkania, koniecznie zadzwoń- pojawiają się bardzo rzadko i szybko znikają z rynku. Zapraszam!");
        offer3.setNumberOfRooms(4);
        offer3.setFloor(5);
        offer3.setKindOfBuilding("kamienica");
        offer3.setCity("Warszawa");
        offer3.setRegion("Mazowieckie");
        offer3.setAuthorId(0L);
        offer3.setSurface(84);
        offer3.setPrice(1699000);
        offer3.setRent(1200);
        offer3.setAddress("Wilcza");
        offer3.setPhoneNumber(641967876);
        offer3.setEmail("adam91@interia.eu");
        offerService.addOffer(offer3);

        Offer offer4 = new Offer();
        offer4.setTitle("2 pokoje Krowodrza - Łobzów sprzeda własciciel");
        offer4.setImg("https://ireland.apollo.olxcdn.com/v1/files/eyJmbiI6InFyejloaDFvZm1vcDItQVBMIiwidyI6W3siZm4iOiJqMWozbzEzbTZiZ24xLUFQTCIsInMiOiIxNCIsInAiOiIxMCwtMTAiLCJhIjoiMCJ9XX0.WgF2icSdOgSVzcFLL9Zgliay-o493b_ZfoZTOhiXbho/image;s=1280x1024;q=80");
        offer4.setDescription("Mieszkanie po generalnym remoncie.Wymienione instalacje (wod-kan,prąd gaz).Nowe wylewki, gładzie gipsowe. Nowa stolarka wewnętrzna.Okna plastikowe.Kuchnia,łazienka,przedpokój- flizy.Pokoje -panele.Nowa zabudowa kuchni i sprzęt AGD.Nowy biały montaż w łazience.Ekspozycja wschód-zachód.\n" +
                "\n" +
                "Ogrzewanie i ciepła woda MPC.Mieszkanie ciche,słoneczne. Nie zamieszkałe po remoncie.");
        offer4.setNumberOfRooms(2);
        offer4.setFloor(3);
        offer4.setKindOfBuilding("blok");
        offer4.setCity("Kraków");
        offer4.setRegion("Małopolskie");
        offer4.setAddress("ul. Mariana Smoluchowskiego");
        offer4.setPrice(620000);
        offer4.setSurface(51.50F);
        offer4.setRent(360);
        offer4.setEmail("anna.krabkiewicz@onet.pl");
        offer4.setPhoneNumber(610644980);
        offer4.setAuthorId(0L);
        offerService.addOffer(offer4);

        Offer offer5 = new Offer();
        offer5.setTitle("Dwupoziomowy apartament 87m2, gotowy do odbioru");
        offer5.setImg("https://ireland.apollo.olxcdn.com/v1/files/eyJmbiI6InZubHUxZG1rMHdvMzItQVBMIiwidyI6W3siZm4iOiJqMWozbzEzbTZiZ24xLUFQTCIsInMiOiIxNCIsInAiOiIxMCwtMTAiLCJhIjoiMCJ9XX0.Oxm_SDf7cFUq2zgvRhdGBDm689hDfBuXffMv9TSdMOY/image;s=1280x1024;q=80");
        offer5.setDescription("Nowe mieszkania w atrakcyjnych cenach, dostępne bez prowizji oraz podatku PCC 2%\n" +
                "\n" +
                "Gotowe do odbioru\n" +
                "\n" +
                "APARTAMENT\n" +
                "Nowoczesny i funkcjonalny niemal 87 metrowy dwupoziomowy apartament zlokalizowany w wyjątkowej inwestycji. Na pierwszym poziomie znajduje się salon z aneksem kuchennym, sypialnia, łazienka, schowek oraz pokaźnych rozmiarów balkon. Drugi poziom oferuję 3 sypialnię, łazienkę oraz balkon.\n" +
                "\n" +
                "LOKALIZACJA\n" +
                "Inwestycja skierowana do osób, których nie zadowalają banalne i przeciętne rozwiązania. Jeśli interesuje Cię maksymalny komfort mieszkania w wysokim standardzie, połączony z atrakcyjną, cichą, zieloną i modną lokalizacją, to osiedle jest idealnym miejscem do życia. W pobliżu inwestycji powstanie również Naturalny Park Tetmajera, który zrealizowany zostanie w ramach budżetu obywatelskiego miasta Krakowa. Projekt zakłada szereg atrakcji dla okolicznych mieszkańców m.in. pomosty wzdłuż strugi, plac zabaw, ogród sensoryczny, miejsce do piknikowania czy strefę rekreacyjną nad stawem. Dobrze rozwinięta infrastruktura komunikacyjna z centrum miasta, sprawia, że jest to miejsce idealne dla osób pragnących odskoczni od zgiełku miasta, przy jednoczesnym zachowaniu z nim ścisłego kontaktu. W kilka minut mieszkańcy mogą dotrzeć do centrum handlowego Galeria Bronowice oraz do obwodnicy Krakowa.\n" +
                "\n" +
                "Na zdjęciach jest pokazana przykładowa aranżacja. Mieszkanie w stanie DEWELOPERSKIM.\n" +
                "\n" +
                "Nasi doradcy z POWER FINANCES pomogą w uzyskaniu najlepszego finansowania w rozumieniu Państwa potrzeb.\n" +
                "\n" +
                "Opiekun oferty:\n" +
                "Wojciech Łysak\n" +
                "tel. 730 658 181\n" +
                "\n" +
                "Treść niniejszego ogłoszenia nie stanowi oferty handlowej w rozumieniu Kodeksu Cywilnego.");
        offer5.setNumberOfRooms(5);
        offer5.setFloor(1);
        offer5.setKindOfBuilding("apartamentwiec");
        offer5.setCity("Kraków");
        offer5.setRegion("Małopolskie");
        offer5.setAddress("Bronowice, ks. Stanisława Truszkowskiego");
        offer5.setRent(1500);
        offer5.setPrice(660000);
        offer5.setEmail("pawel.pawelczyk@wp.pl");
        offer5.setPhoneNumber(567987234);
        offer5.setSurface(86.22F);
        offer5.setAuthorId(0L);
        offerService.addOffer(offer5);

        Offer offer6 = new Offer();
        offer6.setTitle("Przystań Królewiecka II tu znajdziesz swoje miejsc");
        offer6.setImg("https://ireland.apollo.olxcdn.com/v1/files/eyJmbiI6ImlrdmpmeXA0eHFjei1BUEwiLCJ3IjpbeyJmbiI6ImoxajNvMTNtNmJnbjEtQVBMIiwicyI6IjE0IiwicCI6IjEwLC0xMCIsImEiOiIwIn1dfQ.qF3JPEhLxlyC8EH7jwoAyqg7gWavGy3byY-JWWnP8qg/image;s=1280x1024;q=80");
        offer6.setDescription("Przystań Królewiecka II to kontynuacja dobrze znanego naszym klientów pierwszego etapu.  W drugim etapie znajdziemy 83 lokale mieszkalne oraz miejsca postojowe w garażu podziemny. Znajdziemy tu komfortowe mieszkania o zróżnicowanych metrażach. Każdy lokal ma do dyspozycji balkon, taras lub przestronny ogródek. W ciepłe dni to dodatkowe miejsce które możemy zaaranżować do naszych potrzeb. Pod budynkiem znajduje się garaż podziemny oraz komórki lokatorskie.\n" +
                "\n" +
                "Zielone Maślice\n" +
                "\n" +
                "Inwestycja położona jest w sercu Maślic, przy ul. Królewieckiej. To jedna z najbardziej zielonych części Wrocławia. Bliskość terenów zielonych, oraz sąsiedztwo rzeki sprzyjają wypoczynkowi. Trasy biegowe, ciągnące się kilometrami ścieżki rowerowe oraz malowniczo usytuowana stadnina koni to idealna propozycja dla lubiących spędzać czas w ruchu. Nieopodal osiedla znajduje się również kąpielisko oraz miejsce do grillowania z przyjaciółmi i aktywnego wypoczynku dla całej rodziny.\n" +
                "\n" +
                "Przystań Królewiecka II to idealne miejsce zarówno dla osób młodych na start jak i dla rodzin z dziećmi, gdyż jest to połączenie życia w otoczeniu przyrody z jednoczesnym dostępem do całej infrastruktury miasta.");
        offer6.setNumberOfRooms(3);
        offer6.setFloor(2);
        offer6.setKindOfBuilding("blok");
        offer6.setCity("Wrocław");
        offer6.setRegion("Dolnośląskie");
        offer6.setAddress("Maślice, ul. Królewiecka");
        offer6.setSurface(46.15F);
        offer6.setPhoneNumber(545630241);
        offer6.setEmail("agnieszka98@gmail.com");
        offer6.setAuthorId(0L);
        offer6.setPrice(500000);
        offer6.setRent(500);
        offerService.addOffer(offer6);
    }
}
