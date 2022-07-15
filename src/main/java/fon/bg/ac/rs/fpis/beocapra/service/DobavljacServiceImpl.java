package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.DobavljacDTO;
import fon.bg.ac.rs.fpis.beocapra.model.DobavljacEntity;
import fon.bg.ac.rs.fpis.beocapra.repository.DobavljacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class DobavljacServiceImpl implements DobavljacService {

    @Autowired
    private DobavljacRepository repository;

    @Override
    public Collection<DobavljacDTO> findAll() {
        Collection<DobavljacEntity> dobavljaci = repository.findAll();
        return dobavljaci
                .stream()
                .map(dobavljac -> new DobavljacDTO(dobavljac))
                .collect(Collectors.toList());
    }

}
