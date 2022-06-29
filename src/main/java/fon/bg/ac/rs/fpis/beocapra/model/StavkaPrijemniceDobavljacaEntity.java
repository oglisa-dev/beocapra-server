package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "StavkaPrijemniceDobavljaca", schema = "public", catalog = "beocapra-db")
@IdClass(StavkaPrijemniceDobavljacaEntityPK.class)
public class StavkaPrijemniceDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PrijemnicaDobavljacaID")
    private long prijemnicaDobavljacaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StavkaPrijemniceDobavljacaID")
    private long stavkaPrijemniceDobavljacaId;
    @Basic
    @Column(name = "Kolicina")
    private BigInteger kolicina;
    @Basic
    @Column(name = "Vrednost")
    private BigInteger vrednost;
    @Basic
    @Column(name = "ProizvodID")
    private long proizvodId;

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

    public BigInteger getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigInteger kolicina) {
        this.kolicina = kolicina;
    }

    public BigInteger getVrednost() {
        return vrednost;
    }

    public void setVrednost(BigInteger vrednost) {
        this.vrednost = vrednost;
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
        StavkaPrijemniceDobavljacaEntity that = (StavkaPrijemniceDobavljacaEntity) o;
        return prijemnicaDobavljacaId == that.prijemnicaDobavljacaId && stavkaPrijemniceDobavljacaId == that.stavkaPrijemniceDobavljacaId && proizvodId == that.proizvodId && Objects.equals(kolicina, that.kolicina) && Objects.equals(vrednost, that.vrednost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prijemnicaDobavljacaId, stavkaPrijemniceDobavljacaId, kolicina, vrednost, proizvodId);
    }
}
