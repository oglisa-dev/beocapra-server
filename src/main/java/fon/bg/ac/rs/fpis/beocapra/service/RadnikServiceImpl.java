package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.RadnikDTO;
import fon.bg.ac.rs.fpis.beocapra.model.RadnikEntity;
import fon.bg.ac.rs.fpis.beocapra.repository.RadnikRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service @Transactional @Slf4j @RequiredArgsConstructor
public class RadnikServiceImpl implements RadnikService, UserDetailsService {

    @Autowired
    private RadnikRepository radnikRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RadnikEntity radnik = this.radnikRepository.findByUsername(username);
        if (radnik == null) {
            log.error("User/Radnik not found: {}", username);
            throw new UsernameNotFoundException("User/Radnik not found");
        } else {
            log.info("User/Radnik found: {}", username);
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        return new User(radnik.getUsername(), radnik.getPassword(), authorities);
    }

    public RadnikEntity saveRadnik(RadnikEntity radnik) {
        log.info("Saving new radnik to database: {}", radnik.getUsername());
        radnik.setPassword(this.passwordEncoder.encode(radnik.getPassword()));
        return this.radnikRepository.save(radnik);
    }

    @Override
    public Collection<RadnikDTO> getAll() {
        Collection<RadnikEntity> radnici = this.radnikRepository.findAll();
        System.out.println("Radnici getAll():");
        System.out.println(radnici);
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

}
