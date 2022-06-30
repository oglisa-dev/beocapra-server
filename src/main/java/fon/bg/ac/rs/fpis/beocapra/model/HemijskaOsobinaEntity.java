package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "HemijskaOsobina", schema = "public", catalog = "beocapra-db")
@IdClass(HemijskaOsobinaEntityPK.class)
public class HemijskaOsobinaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "HemijskaOsobinaID")
    private long hemijskaOsobinaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProizvodID")
    private long proizvodId;
    @Basic
    @Column(name = "MernaJedinica")
    private String mernaJedinica;
    @Basic
    @Column(name = "Količina")
    private BigInteger količina;
    @Basic
    @Column(name = "Sastojci")
    private String sastojci;

    @ManyToOne(
            targetEntity = ProizvodEntity.class,
            fetch = FetchType.LAZY,
            optional = false
    )
    private ProizvodEntity proizvod;

    public ProizvodEntity getProizvod() {
        return proizvod;
    }

    public void setProizvod(ProizvodEntity proizvod) {
        this.proizvod = proizvod;
    }

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

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public BigInteger getKoličina() {
        return količina;
    }

    public void setKoličina(BigInteger količina) {
        this.količina = količina;
    }

    public String getSastojci() {
        return sastojci;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HemijskaOsobinaEntity that = (HemijskaOsobinaEntity) o;
        return hemijskaOsobinaId == that.hemijskaOsobinaId && proizvodId == that.proizvodId && Objects.equals(mernaJedinica, that.mernaJedinica) && Objects.equals(količina, that.količina) && Objects.equals(sastojci, that.sastojci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hemijskaOsobinaId, proizvodId, mernaJedinica, količina, sastojci);
    }
}
