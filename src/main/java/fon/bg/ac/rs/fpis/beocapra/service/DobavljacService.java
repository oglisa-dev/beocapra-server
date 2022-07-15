package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.DobavljacDTO;

import java.util.Collection;

public interface DobavljacService {

    Collection<DobavljacDTO> findAll();

}
