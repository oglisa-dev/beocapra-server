package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.PrijemnicaDobavljacaDTO;
import fon.bg.ac.rs.fpis.beocapra.model.PrijemnicaDobavljacaEntity;
import fon.bg.ac.rs.fpis.beocapra.model.StavkaPrijemniceDobavljacaEntity;
import fon.bg.ac.rs.fpis.beocapra.repository.PrijemnicaDobavljacaRepository;
import fon.bg.ac.rs.fpis.beocapra.repository.StavkaPrijemniceDobavljacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;

@Service
public class PrijemnicaDobavljacaServiceImpl implements PrijemnicaDobavljacaService {

    @Autowired
    private PrijemnicaDobavljacaRepository repository;
    @Autowired
    private StavkaPrijemniceDobavljacaRepository repositoryStavka;

    @Override
    @Transactional(
            value = Transactional.TxType.REQUIRES_NEW,
            rollbackOn = Exception.class
    )
    public PrijemnicaDobavljacaDTO savePrijemnica(PrijemnicaDobavljacaEntity prijemnicaDobavljaca) {
        Collection<StavkaPrijemniceDobavljacaEntity> stavke = prijemnicaDobavljaca.getStavke();
        prijemnicaDobavljaca.setStavke(new ArrayList<>());
        PrijemnicaDobavljacaEntity prijemnica = this.repository.save(prijemnicaDobavljaca);
        stavke.stream().forEach(stavka -> {
            System.out.println("ID: " + prijemnicaDobavljaca.getPrijemnicaDobavljacaId());
            stavka.setPrijemnicaDobavljacaId(prijemnicaDobavljaca.getPrijemnicaDobavljacaId());
            stavka.setPrijemnicaDobavljaca(prijemnica);
        });
        stavke.stream().forEach(stavka -> System.out.println(stavka));
        prijemnica.setStavke(stavke);
        this.repository.save(prijemnica);
        return new PrijemnicaDobavljacaDTO(prijemnica);
    }
}
