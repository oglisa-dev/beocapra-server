package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Odeljenje", schema = "public", catalog = "beocapra-db")
public class OdeljenjeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OdeljenjeID")
    private long odeljenjeId;
    @Basic
    @Column(name = "NazivOdeljenja")
    private String nazivOdeljenja;

    public long getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(long odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public String getNazivOdeljenja() {
        return nazivOdeljenja;
    }

    public void setNazivOdeljenja(String nazivOdeljenja) {
        this.nazivOdeljenja = nazivOdeljenja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OdeljenjeEntity that = (OdeljenjeEntity) o;
        return odeljenjeId == that.odeljenjeId && Objects.equals(nazivOdeljenja, that.nazivOdeljenja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odeljenjeId, nazivOdeljenja);
    }
}
