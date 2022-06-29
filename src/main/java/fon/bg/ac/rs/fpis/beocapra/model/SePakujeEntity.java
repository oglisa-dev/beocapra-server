package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "SePakuje", schema = "public", catalog = "beocapra-db")
@IdClass(SePakujeEntityPK.class)
public class SePakujeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProizvodID")
    private long proizvodId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PakovanjeID")
    private long pakovanjeId;
    @Basic
    @Column(name = "Kolicina")
    private BigInteger kolicina;

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

    public BigInteger getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigInteger kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SePakujeEntity that = (SePakujeEntity) o;
        return proizvodId == that.proizvodId && pakovanjeId == that.pakovanjeId && Objects.equals(kolicina, that.kolicina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proizvodId, pakovanjeId, kolicina);
    }
}
