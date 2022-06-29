package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FizickaOsobinaEntityPK implements Serializable {
    @Column(name = "FizickaOsobinaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fizickaOsobinaId;
    @Column(name = "ProizvodID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long proizvodId;

    public long getFizickaOsobinaId() {
        return fizickaOsobinaId;
    }

    public void setFizickaOsobinaId(long fizickaOsobinaId) {
        this.fizickaOsobinaId = fizickaOsobinaId;
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
        FizickaOsobinaEntityPK that = (FizickaOsobinaEntityPK) o;
        return fizickaOsobinaId == that.fizickaOsobinaId && proizvodId == that.proizvodId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fizickaOsobinaId, proizvodId);
    }
}
