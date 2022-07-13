package fon.bg.ac.rs.fpis.beocapra.seeders;


import fon.bg.ac.rs.fpis.beocapra.repository.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProizvodSeeder implements CommandLineRunner {

    @Autowired
    private ProizvodRepository repository;

    @Override
    public void run(String... args) throws Exception {
        long count = repository.count();
        if (count == 0) {

        } else System.out.println("Proizvod dbt already seeded: " + count);
    }

}
