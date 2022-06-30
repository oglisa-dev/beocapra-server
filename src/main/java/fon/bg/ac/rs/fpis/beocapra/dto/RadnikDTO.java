package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.RadnikEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor @AllArgsConstructor @Data
public class RadnikDTO implements Serializable,DTO<RadnikEntity> {

    private Long radnikId;
    private String brojRadneKnjizice;
    private String jmbg;
    private String imePrezime;
    private Long radnoMestoId;
    private String username;
    private String password;

    public RadnikDTO(RadnikEntity radnik) {
        this.radnikId = radnik.getRadnikId();
        this.brojRadneKnjizice = radnik.getBrojRadneKnjizice();
        this.imePrezime = radnik.getImePrezime();
        this.jmbg = radnik.getJmbg();
        this.password = radnik.getPassword();
        this.radnoMestoId = radnik.getRadnoMestoId();
        this.username = radnik.getUsername();
    }

    @Override
    public RadnikEntity fromDTO() {
        RadnikEntity radnikEntity = new RadnikEntity();
        radnikEntity.setRadnikId(this.radnikId);
        radnikEntity.setBrojRadneKnjizice(this.brojRadneKnjizice);
        radnikEntity.setImePrezime(this.imePrezime);
        radnikEntity.setJmbg(this.jmbg);
        radnikEntity.setRadnoMestoId(this.radnoMestoId);
        radnikEntity.setPassword(this.password);
        radnikEntity.setUsername(this.username);
        return radnikEntity;
    }
}
