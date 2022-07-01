package fon.bg.ac.rs.fpis.beocapra.service;

import fon.bg.ac.rs.fpis.beocapra.dto.PrijemnicaDobavljacaDTO;
import fon.bg.ac.rs.fpis.beocapra.model.PrijemnicaDobavljacaEntity;

public interface PrijemnicaDobavljacaService {

    PrijemnicaDobavljacaDTO savePrijemnica(PrijemnicaDobavljacaEntity prijemnicaDobavljaca);

}
