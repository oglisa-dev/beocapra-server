package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.TipProizvodaEntity;

import java.io.Serializable;

public class TipProizvodaDTO implements Serializable, DTO<TipProizvodaEntity> {

    private Long tipProizvodaId;
    private String nazivTipaProizvoda;

    public TipProizvodaDTO(Long tipProizvodaId, String nazivTipaProizvoda) {
        this.tipProizvodaId = tipProizvodaId;
        this.nazivTipaProizvoda = nazivTipaProizvoda;
    }

    public TipProizvodaDTO() {
    }

    public TipProizvodaDTO(TipProizvodaEntity tipProizvoda) {
        this.tipProizvodaId = tipProizvoda.getTipProizvodaId();
        this.nazivTipaProizvoda = tipProizvoda.getNazivTipaProizvoda();
    }

    public Long getTipProizvodaId() {
        return tipProizvodaId;
    }

    public void setTipProizvodaId(Long tipProizvodaId) {
        this.tipProizvodaId = tipProizvodaId;
    }

    public String getNazivTipaProizvoda() {
        return nazivTipaProizvoda;
    }

    public void setNazivTipaProizvoda(String nazivTipaProizvoda) {
        this.nazivTipaProizvoda = nazivTipaProizvoda;
    }

    @Override
    public TipProizvodaEntity fromDTO() {
        TipProizvodaEntity tipProizvoda = new TipProizvodaEntity();
        tipProizvoda.setTipProizvodaId(this.tipProizvodaId);
        tipProizvoda.setNazivTipaProizvoda(this.nazivTipaProizvoda);
        return tipProizvoda;
    }
}
