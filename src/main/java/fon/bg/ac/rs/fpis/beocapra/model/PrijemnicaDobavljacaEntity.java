package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PrijemnicaDobavljaca", schema = "public", catalog = "beocapra-db")
public class PrijemnicaDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PrijemnicaDobavljacaID")
    private long prijemnicaDobavljacaId;
    @Basic
    @Column(name = "DatumPrijema")
    private Date datumPrijema;
    @Basic
    @Column(name = "Napomena")
    private String napomena;
    @Basic
    @Column(name = "DobavljacID")
    private long dobavljacId;
    @Basic
    @Column(name = "RadnikID")
    private long radnikId;
    @Basic
    @Column(name = "TovarniListID")
    private long tovarniListId;

    public long getPrijemnicaDobavljacaId() {
        return prijemnicaDobavljacaId;
    }

    public void setPrijemnicaDobavljacaId(long prijemnicaDobavljacaId) {
        this.prijemnicaDobavljacaId = prijemnicaDobavljacaId;
    }

    public Date getDatumPrijema() {
        return datumPrijema;
    }

    public void setDatumPrijema(Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public long getDobavljacId() {
        return dobavljacId;
    }

    public void setDobavljacId(long dobavljacId) {
        this.dobavljacId = dobavljacId;
    }

    public long getRadnikId() {
        return radnikId;
    }

    public void setRadnikId(long radnikId) {
        this.radnikId = radnikId;
    }

    public long getTovarniListId() {
        return tovarniListId;
    }

    public void setTovarniListId(long tovarniListId) {
        this.tovarniListId = tovarniListId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrijemnicaDobavljacaEntity that = (PrijemnicaDobavljacaEntity) o;
        return prijemnicaDobavljacaId == that.prijemnicaDobavljacaId && dobavljacId == that.dobavljacId && radnikId == that.radnikId && tovarniListId == that.tovarniListId && Objects.equals(datumPrijema, that.datumPrijema) && Objects.equals(napomena, that.napomena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prijemnicaDobavljacaId, datumPrijema, napomena, dobavljacId, radnikId, tovarniListId);
    }
}
