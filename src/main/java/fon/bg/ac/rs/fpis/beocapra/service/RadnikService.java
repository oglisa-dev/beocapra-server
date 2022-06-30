package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.RadnikDTO;

import java.util.Collection;
import java.util.Optional;

public interface RadnikService {

    Collection<RadnikDTO> getAll();
    Optional<RadnikDTO> getByUsername(String username);
    Optional<RadnikDTO> login(String username, String password);

}
