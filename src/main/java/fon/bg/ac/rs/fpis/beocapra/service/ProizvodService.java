package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.ProizvodDTO;
import fon.bg.ac.rs.fpis.beocapra.model.ProizvodEntity;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProizvodService {

    Optional<ProizvodDTO> getById(Long id);
    Collection<ProizvodDTO> getAll();
    Optional<List<ProizvodDTO>> getByNameAndIdParts(String namePart, String idPart);

    List<ProizvodDTO> getProductsWithSorting(String field);

    Page<ProizvodEntity> getProductsWithPagination(int offset, int pageSize);

}
