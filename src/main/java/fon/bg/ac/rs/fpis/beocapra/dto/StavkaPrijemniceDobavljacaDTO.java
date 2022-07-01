package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.StavkaPrijemniceDobavljacaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StavkaPrijemniceDobavljacaDTO implements DTO<StavkaPrijemniceDobavljacaEntity>, Serializable {

    private Long prijemnicaDobavljacaId;
    private Long stavkaPrijemniceDobavljacaId;
    private BigInteger kolicina;
    private BigInteger vrednost;
    private Long proizvodId;

    public StavkaPrijemniceDobavljacaDTO(StavkaPrijemniceDobavljacaEntity stavkaPrijemniceDobavljacaEntity) {
        this.prijemnicaDobavljacaId = stavkaPrijemniceDobavljacaEntity.getPrijemnicaDobavljacaId();
        this.stavkaPrijemniceDobavljacaId = stavkaPrijemniceDobavljacaEntity.getStavkaPrijemniceDobavljacaId();
        this.kolicina = stavkaPrijemniceDobavljacaEntity.getKolicina();
        this.vrednost = stavkaPrijemniceDobavljacaEntity.getVrednost();
        this.proizvodId = stavkaPrijemniceDobavljacaEntity.getProizvodId();
    }

    @Override
    public StavkaPrijemniceDobavljacaEntity fromDTO() {
        StavkaPrijemniceDobavljacaEntity stavka = new StavkaPrijemniceDobavljacaEntity();
        stavka.setStavkaPrijemniceDobavljacaId(this.stavkaPrijemniceDobavljacaId);
        stavka.setPrijemnicaDobavljacaId(this.prijemnicaDobavljacaId);
        stavka.setProizvodId(this.proizvodId);
        stavka.setKolicina(this.kolicina);
        stavka.setVrednost(this.vrednost);
        return stavka;
    }

}
