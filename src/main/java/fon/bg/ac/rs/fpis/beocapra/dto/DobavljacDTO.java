package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.DobavljacEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DobavljacDTO implements DTO<DobavljacEntity>, Serializable {

    private Long dobavljacId;
    private String email;
    private String maticniBroj;
    private String nazivDobavljaca;
    private String pib;
    private String ziroRacun;
    private String website;

    public DobavljacDTO(DobavljacEntity dobavljac) {
        this.dobavljacId = dobavljac.getDobavljacId();
        this.email = dobavljac.getEmail();
        this.maticniBroj = dobavljac.getMaticniBroj();
        this.nazivDobavljaca = dobavljac.getNazivDobavljaca();
        this.pib = dobavljac.getPib();
        this.ziroRacun = dobavljac.getZiroRacun();
        this.website = dobavljac.getWebsite();
    }

    @Override
    public DobavljacEntity fromDTO() {
        DobavljacEntity dobavljac = new DobavljacEntity();
        dobavljac.setDobavljacId(this.dobavljacId);
        dobavljac.setEmail(this.email);
        dobavljac.setMaticniBroj(this.maticniBroj);
        dobavljac.setPib(this.pib);
        dobavljac.setWebsite(this.website);
        dobavljac.setNazivDobavljaca(this.nazivDobavljaca);
        dobavljac.setZiroRacun(this.ziroRacun);
        return dobavljac;
    }
}
