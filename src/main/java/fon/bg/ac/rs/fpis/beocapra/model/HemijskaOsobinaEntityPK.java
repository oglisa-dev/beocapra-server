package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class HemijskaOsobinaEntityPK implements Serializable {
    @Column(name = "HemijskaOsobinaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hemijskaOsobinaId;
    @Column(name = "ProizvodID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long proizvodId;

    public long getHemijskaOsobinaId() {
        return hemijskaOsobinaId;
    }

    public void setHemijskaOsobinaId(long hemijskaOsobinaId) {
        this.hemijskaOsobinaId = hemijskaOsobinaId;
    }

    public long getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(long proizvodId) {
        this.proizvodId = proizvodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HemijskaOsobinaEntityPK that = (HemijskaOsobinaEntityPK) o;
        return hemijskaOsobinaId == that.hemijskaOsobinaId && proizvodId == that.proizvodId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hemijskaOsobinaId, proizvodId);
    }
}
