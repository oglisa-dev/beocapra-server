package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.PrijemnicaDobavljacaDTO;
import fon.bg.ac.rs.fpis.beocapra.model.PrijemnicaDobavljacaEntity;
import fon.bg.ac.rs.fpis.beocapra.repository.PrijemnicaDobavljacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrijemnicaDobavljacaServiceImpl implements PrijemnicaDobavljacaService {

    @Autowired
    private PrijemnicaDobavljacaRepository repository;

    @Override
    public PrijemnicaDobavljacaDTO savePrijemnica(PrijemnicaDobavljacaEntity prijemnicaDobavljaca) {
        PrijemnicaDobavljacaEntity prijemnica = this.repository.save(prijemnicaDobavljaca);
        
    }
}
