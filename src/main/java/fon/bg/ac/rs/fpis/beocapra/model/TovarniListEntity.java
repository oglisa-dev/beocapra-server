package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TovarniList", schema = "public", catalog = "beocapra-db")
public class TovarniListEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TovarniListID")
    private long tovarniListId;
    @Basic
    @Column(name = "Napomena")
    private String napomena;
    @Basic
    @Column(name = "DatumSlanja")
    private Date datumSlanja;

    public long getTovarniListId() {
        return tovarniListId;
    }

    public void setTovarniListId(long tovarniListId) {
        this.tovarniListId = tovarniListId;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Date getDatumSlanja() {
        return datumSlanja;
    }

    public void setDatumSlanja(Date datumSlanja) {
        this.datumSlanja = datumSlanja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TovarniListEntity that = (TovarniListEntity) o;
        return tovarniListId == that.tovarniListId && Objects.equals(napomena, that.napomena) && Objects.equals(datumSlanja, that.datumSlanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tovarniListId, napomena, datumSlanja);
    }
}
