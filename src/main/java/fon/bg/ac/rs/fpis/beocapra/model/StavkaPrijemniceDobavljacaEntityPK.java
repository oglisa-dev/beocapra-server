package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StavkaPrijemniceDobavljacaEntityPK implements Serializable {
    @Column(name = "PrijemnicaDobavljacaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prijemnicaDobavljacaId;
    @Column(name = "StavkaPrijemniceDobavljacaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stavkaPrijemniceDobavljacaId;

    public long getPrijemnicaDobavljacaId() {
        return prijemnicaDobavljacaId;
    }

    public void setPrijemnicaDobavljacaId(long prijemnicaDobavljacaId) {
        this.prijemnicaDobavljacaId = prijemnicaDobavljacaId;
    }

    public long getStavkaPrijemniceDobavljacaId() {
        return stavkaPrijemniceDobavljacaId;
    }

    public void setStavkaPrijemniceDobavljacaId(long stavkaPrijemniceDobavljacaId) {
        this.stavkaPrijemniceDobavljacaId = stavkaPrijemniceDobavljacaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StavkaPrijemniceDobavljacaEntityPK that = (StavkaPrijemniceDobavljacaEntityPK) o;
        return prijemnicaDobavljacaId == that.prijemnicaDobavljacaId && stavkaPrijemniceDobavljacaId == that.stavkaPrijemniceDobavljacaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prijemnicaDobavljacaId, stavkaPrijemniceDobavljacaId);
    }
}
