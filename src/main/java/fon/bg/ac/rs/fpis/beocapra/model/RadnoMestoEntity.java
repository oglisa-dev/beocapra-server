package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "RadnoMesto", schema = "public", catalog = "beocapra-db")
public class RadnoMestoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RadnoMestoID")
    private long radnoMestoId;
    @Basic
    @Column(name = "NazivRadnogMesta")
    private String nazivRadnogMesta;
    @Basic
    @Column(name = "OpisRadnogMesta")
    private String opisRadnogMesta;
    @Basic
    @Column(name = "OdeljenjeID")
    private long odeljenjeId;

    public long getRadnoMestoId() {
        return radnoMestoId;
    }

    public void setRadnoMestoId(long radnoMestoId) {
        this.radnoMestoId = radnoMestoId;
    }

    public String getNazivRadnogMesta() {
        return nazivRadnogMesta;
    }

    public void setNazivRadnogMesta(String nazivRadnogMesta) {
        this.nazivRadnogMesta = nazivRadnogMesta;
    }

    public String getOpisRadnogMesta() {
        return opisRadnogMesta;
    }

    public void setOpisRadnogMesta(String opisRadnogMesta) {
        this.opisRadnogMesta = opisRadnogMesta;
    }

    public long getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(long odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadnoMestoEntity that = (RadnoMestoEntity) o;
        return radnoMestoId == that.radnoMestoId && odeljenjeId == that.odeljenjeId && Objects.equals(nazivRadnogMesta, that.nazivRadnogMesta) && Objects.equals(opisRadnogMesta, that.opisRadnogMesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radnoMestoId, nazivRadnogMesta, opisRadnogMesta, odeljenjeId);
    }
}
