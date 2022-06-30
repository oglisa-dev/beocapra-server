package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.ProizvodDTO;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProizvodService {

    Optional<ProizvodDTO> getById(Long id);
    Collection<ProizvodDTO> getAll();
    Optional<List<ProizvodDTO>> getByNameAndIdParts(String namePart, String idPart);

}
