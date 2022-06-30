package fon.bg.ac.rs.fpis.beocapra.repository;

import fon.bg.ac.rs.fpis.beocapra.model.RadnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadnikRepository extends JpaRepository<RadnikEntity,Long> {

    RadnikEntity findByUsernameAndPassword(String username, String password);
    RadnikEntity findByUsername(String username);

}
