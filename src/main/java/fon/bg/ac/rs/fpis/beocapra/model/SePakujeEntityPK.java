package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SePakujeEntityPK implements Serializable {
    @Column(name = "ProizvodID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long proizvodId;
    @Column(name = "PakovanjeID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pakovanjeId;

    public long getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(long proizvodId) {
        this.proizvodId = proizvodId;
    }

    public long getPakovanjeId() {
        return pakovanjeId;
    }

    public void setPakovanjeId(long pakovanjeId) {
        this.pakovanjeId = pakovanjeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SePakujeEntityPK that = (SePakujeEntityPK) o;
        return proizvodId == that.proizvodId && pakovanjeId == that.pakovanjeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proizvodId, pakovanjeId);
    }
}
