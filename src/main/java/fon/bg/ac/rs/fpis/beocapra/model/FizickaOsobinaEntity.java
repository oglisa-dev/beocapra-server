package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "FizickaOsobina", schema = "public", catalog = "beocapra-db")
@IdClass(FizickaOsobinaEntityPK.class)
public class FizickaOsobinaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FizickaOsobinaID")
    private long fizickaOsobinaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProizvodID")
    private long proizvodId;
    @Basic
    @Column(name = "NazivFizickeOsobine")
    private String nazivFizickeOsobine;
    @Basic
    @Column(name = "VrednostFizickeOsobine")
    private BigInteger vrednostFizickeOsobine;
    @Basic
    @Column(name = "MetodIspitivanjaFizickeOsobine")
    private String metodIspitivanjaFizickeOsobine;

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

    public String getNazivFizickeOsobine() {
        return nazivFizickeOsobine;
    }

    public void setNazivFizickeOsobine(String nazivFizickeOsobine) {
        this.nazivFizickeOsobine = nazivFizickeOsobine;
    }

    public BigInteger getVrednostFizickeOsobine() {
        return vrednostFizickeOsobine;
    }

    public void setVrednostFizickeOsobine(BigInteger vrednostFizickeOsobine) {
        this.vrednostFizickeOsobine = vrednostFizickeOsobine;
    }

    public String getMetodIspitivanjaFizickeOsobine() {
        return metodIspitivanjaFizickeOsobine;
    }

    public void setMetodIspitivanjaFizickeOsobine(String metodIspitivanjaFizickeOsobine) {
        this.metodIspitivanjaFizickeOsobine = metodIspitivanjaFizickeOsobine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FizickaOsobinaEntity that = (FizickaOsobinaEntity) o;
        return fizickaOsobinaId == that.fizickaOsobinaId && proizvodId == that.proizvodId && Objects.equals(nazivFizickeOsobine, that.nazivFizickeOsobine) && Objects.equals(vrednostFizickeOsobine, that.vrednostFizickeOsobine) && Objects.equals(metodIspitivanjaFizickeOsobine, that.metodIspitivanjaFizickeOsobine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fizickaOsobinaId, proizvodId, nazivFizickeOsobine, vrednostFizickeOsobine, metodIspitivanjaFizickeOsobine);
    }
}
