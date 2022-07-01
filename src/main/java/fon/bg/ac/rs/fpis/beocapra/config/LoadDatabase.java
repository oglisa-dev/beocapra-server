package fon.bg.ac.rs.fpis.beocapra.config;

import fon.bg.ac.rs.fpis.beocapra.model.RadnikEntity;
import fon.bg.ac.rs.fpis.beocapra.service.RadnikService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RadnikService radnikService) {
        return args -> {
            RadnikEntity radnik1 = new RadnikEntity();
            radnik1.setUsername("oglisa");
            radnik1.setPassword("oglisa99");
            radnik1.setJmbg("2011989774598");
            radnik1.setBrojRadneKnjizice("1234567");
            radnik1.setImePrezime("Ognjen Simic");
            radnik1.setRadnoMestoId(1L);
            log.info("Preloading " + radnikService.saveRadnik(radnik1));
        };
    }

}
