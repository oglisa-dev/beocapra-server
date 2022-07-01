package fon.bg.ac.rs.fpis.beocapra.config;

import fon.bg.ac.rs.fpis.beocapra.model.*;
import fon.bg.ac.rs.fpis.beocapra.repository.*;
import fon.bg.ac.rs.fpis.beocapra.service.RadnikService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RadnikService radnikService, TovarniListRepository tovarniListRepository
            , DobavljacRepository dobavljacRepository, TipProizvodaRepository tipProizvodaRepository
            , JedinicaMereRepository jedinicaMereRepository, ProizvodRepository proizvodRepository) {
        return args -> {
            RadnikEntity radnik1 = new RadnikEntity();
            radnik1.setUsername("oglisa");
            radnik1.setPassword("oglisa99");
            radnik1.setJmbg("2011989774598");
            radnik1.setBrojRadneKnjizice("1234567");
            radnik1.setImePrezime("Ognjen Simic");
            radnik1.setRadnoMestoId(1L);
            log.info("Preloading " + radnikService.saveRadnik(radnik1));

            TovarniListEntity tovarniList1 = new TovarniListEntity();
            tovarniList1.setDatumSlanja(new java.sql.Date(new java.util.Date().getTime()));
            tovarniList1.setNapomena("Napomena tovarnog lista 1");
            tovarniListRepository.save(tovarniList1);
            TovarniListEntity tovarniList2 = new TovarniListEntity();
            tovarniList2.setDatumSlanja(new java.sql.Date(new java.util.Date().getTime()));
            tovarniList2.setNapomena("Napomena tovarnog lista 2");
            tovarniListRepository.save(tovarniList2);

            DobavljacEntity dobavljac1 = new DobavljacEntity();
            dobavljac1.setEmail("dobavljac1@gmail.com");
            dobavljac1.setWebsite("www.dobavljac1.example.com");
            dobavljac1.setMaticniBroj("111111111");
            dobavljac1.setNazivDobavljaca("Dobavljac1");
            dobavljac1.setPib("123456789");
            dobavljac1.setZiroRacun("123-000123123-123");
            dobavljacRepository.save(dobavljac1);
            DobavljacEntity dobavljac2 = new DobavljacEntity();
            dobavljac2.setEmail("dobavljac2@gmail.com");
            dobavljac2.setWebsite("www.dobavljac2.example.com");
            dobavljac2.setMaticniBroj("22222222");
            dobavljac2.setNazivDobavljaca("Dobavljac2");
            dobavljac2.setPib("123456789");
            dobavljac2.setZiroRacun("123-000123123-123");
            dobavljacRepository.save(dobavljac2);

            TipProizvodaEntity tipProizvoda1 = new TipProizvodaEntity();
            tipProizvoda1.setNazivTipaProizvoda("TIP_PROIZVODA_1");
            tipProizvodaRepository.save(tipProizvoda1);
            TipProizvodaEntity tipProizvoda2 = new TipProizvodaEntity();
            tipProizvoda2.setNazivTipaProizvoda("TIP_PROIZVODA_2");
            tipProizvodaRepository.save(tipProizvoda2);

            JedinicaMereEntity jedinicaMere1 = new JedinicaMereEntity();
            jedinicaMere1.setNazivJediniceMere("JEDINICA_MERE_1");
            jedinicaMereRepository.save(jedinicaMere1);
            JedinicaMereEntity jedinicaMere2 = new JedinicaMereEntity();
            jedinicaMere2.setNazivJediniceMere("JEDINICA_MERE_2");
            jedinicaMereRepository.save(jedinicaMere2);

            ProizvodEntity proizvod1 = new ProizvodEntity();
            proizvod1.setTipProizvoda(tipProizvoda1);
            proizvod1.setCena(BigInteger.valueOf(1200L));
            proizvod1.setHemijskeOsobine(new ArrayList<>());
            proizvod1.setFizickeOsobine(new ArrayList<>());
            proizvod1.setNazivProizvoda("Proizvod1");
            proizvod1.setDatumProizvodnje(new Date(new java.util.Date().getTime() - 60 * 60 * 1000));
            proizvod1.setVrstaProizvoda("VRSTA_PROIZVODA_1");
            proizvod1.setTrenutnoStanjeZaliha(BigInteger.valueOf(46L));
            proizvod1.setJedinicaMere(jedinicaMere1);
            proizvodRepository.save(proizvod1);
            ProizvodEntity proizvod2 = new ProizvodEntity();
            proizvod2.setTipProizvoda(tipProizvoda2);
            proizvod2.setCena(BigInteger.valueOf(450L));
            proizvod2.setHemijskeOsobine(new ArrayList<>());
            proizvod2.setFizickeOsobine(new ArrayList<>());
            proizvod2.setNazivProizvoda("Proizvod2");
            proizvod2.setDatumProizvodnje(new Date(new java.util.Date().getTime() - 120 * 60 * 1000));
            proizvod2.setVrstaProizvoda("VRSTA_PROIZVODA_2");
            proizvod2.setTrenutnoStanjeZaliha(BigInteger.valueOf(12L));
            proizvod2.setJedinicaMere(jedinicaMere2);
            proizvodRepository.save(proizvod2);
            ProizvodEntity proizvod3 = new ProizvodEntity();
            proizvod3.setTipProizvoda(tipProizvoda1);
            proizvod3.setCena(BigInteger.valueOf(25000L));
            proizvod3.setHemijskeOsobine(new ArrayList<>());
            proizvod3.setFizickeOsobine(new ArrayList<>());
            proizvod3.setNazivProizvoda("Proizvod3");
            proizvod3.setDatumProizvodnje(new Date(new java.util.Date().getTime() - 1120 * 60 * 1000));
            proizvod3.setVrstaProizvoda("VRSTA_PROIZVODA_1");
            proizvod3.setTrenutnoStanjeZaliha(BigInteger.valueOf(4L));
            proizvod3.setJedinicaMere(jedinicaMere2);
            proizvodRepository.save(proizvod3);
            ProizvodEntity proizvod4 = new ProizvodEntity();
            proizvod4.setTipProizvoda(tipProizvoda1);
            proizvod4.setCena(BigInteger.valueOf(1255L));
            proizvod4.setHemijskeOsobine(new ArrayList<>());
            proizvod4.setFizickeOsobine(new ArrayList<>());
            proizvod4.setNazivProizvoda("Proizvod4");
            proizvod4.setDatumProizvodnje(new Date(new java.util.Date().getTime() - 2100 * 60 * 1000));
            proizvod4.setVrstaProizvoda("VRSTA_PROIZVODA_2");
            proizvod4.setTrenutnoStanjeZaliha(BigInteger.valueOf(121));
            proizvod4.setJedinicaMere(jedinicaMere1);
            proizvodRepository.save(proizvod4);
        };
    }

}
