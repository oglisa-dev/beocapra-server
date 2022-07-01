package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.RadnikDTO;
import fon.bg.ac.rs.fpis.beocapra.model.RadnikEntity;

import java.util.Collection;
import java.util.Optional;

public interface RadnikService {

    Collection<RadnikDTO> getAll();
    RadnikEntity saveRadnik(RadnikEntity radnik);
    Optional<RadnikDTO> getByUsername(String username);

}
