package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TipProizvoda", schema = "public", catalog = "beocapra-db")
public class TipProizvodaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TipProizvodaID")
    private long tipProizvodaId;
    @Basic
    @Column(name = "NazivTipaProizvoda")
    private String nazivTipaProizvoda;

    public long getTipProizvodaId() {
        return tipProizvodaId;
    }

    public void setTipProizvodaId(long tipProizvodaId) {
        this.tipProizvodaId = tipProizvodaId;
    }

    public String getNazivTipaProizvoda() {
        return nazivTipaProizvoda;
    }

    public void setNazivTipaProizvoda(String nazivTipaProizvoda) {
        this.nazivTipaProizvoda = nazivTipaProizvoda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipProizvodaEntity that = (TipProizvodaEntity) o;
        return tipProizvodaId == that.tipProizvodaId && Objects.equals(nazivTipaProizvoda, that.nazivTipaProizvoda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipProizvodaId, nazivTipaProizvoda);
    }
}
