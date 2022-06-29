package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AdresaDobavljacaEntityPK implements Serializable {
    @Column(name = "AdresaDobavljacaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adresaDobavljacaId;
    @Column(name = "DobavljacID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dobavljacId;

    public long getAdresaDobavljacaId() {
        return adresaDobavljacaId;
    }

    public void setAdresaDobavljacaId(long adresaDobavljacaId) {
        this.adresaDobavljacaId = adresaDobavljacaId;
    }

    public long getDobavljacId() {
        return dobavljacId;
    }

    public void setDobavljacId(long dobavljacId) {
        this.dobavljacId = dobavljacId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdresaDobavljacaEntityPK that = (AdresaDobavljacaEntityPK) o;
        return adresaDobavljacaId == that.adresaDobavljacaId && dobavljacId == that.dobavljacId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adresaDobavljacaId, dobavljacId);
    }
}
