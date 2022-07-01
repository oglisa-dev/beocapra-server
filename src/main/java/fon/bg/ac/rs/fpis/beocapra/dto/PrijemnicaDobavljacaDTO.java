package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.PrijemnicaDobavljacaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrijemnicaDobavljacaDTO implements DTO<PrijemnicaDobavljacaEntity>, Serializable {

    private Long prijemnicaDobavljacaId;
    private Date datumPrijema;
    private String napomena;
    private TovarniListDTO tovarniList;
    private RadnikDTO radnik;
    private DobavljacDTO dobavljac;
    private Collection<StavkaPrijemniceDobavljacaDTO> stavke;

    @Override
    public PrijemnicaDobavljacaEntity fromDTO() {
        PrijemnicaDobavljacaEntity prijemnicaDobavljaca = new PrijemnicaDobavljacaEntity();
        prijemnicaDobavljaca.setPrijemnicaDobavljacaId(this.prijemnicaDobavljacaId);
        prijemnicaDobavljaca.setDatumPrijema(this.datumPrijema);
        prijemnicaDobavljaca.setNapomena(this.napomena);
        prijemnicaDobavljaca.setTovarniList(this.tovarniList.fromDTO());
        prijemnicaDobavljaca.setRadnik(this.radnik.fromDTO());
        prijemnicaDobavljaca.setDobavljac(this.dobavljac.fromDTO());
        prijemnicaDobavljaca.setStavke(
                stavke.stream().map(stavkaDTO -> stavkaDTO.fromDTO()).collect(Collectors.toList())
        );
        return prijemnicaDobavljaca;
    }
}
