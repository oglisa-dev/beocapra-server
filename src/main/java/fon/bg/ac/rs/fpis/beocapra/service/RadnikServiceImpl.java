package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.RadnikDTO;
import fon.bg.ac.rs.fpis.beocapra.model.RadnikEntity;
import fon.bg.ac.rs.fpis.beocapra.repository.RadnikRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service @Transactional @Slf4j
public class RadnikServiceImpl implements RadnikService {

    @Autowired
    private RadnikRepository radnikRepository;

    @Override
    public Collection<RadnikDTO> getAll() {
        Collection<RadnikEntity> radnici = this.radnikRepository.findAll();
        return radnici
                .stream()
                .map(radnikEntity -> new RadnikDTO(radnikEntity))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<RadnikDTO> getByUsername(String username) {
        RadnikEntity radnik = this.radnikRepository.findByUsername(username);
        if (radnik == null) return Optional.empty();
        return Optional.of(new RadnikDTO(radnik));
    }

    public Optional<RadnikDTO> login(String username, String password) {

        return Optional.empty();
    }

}
