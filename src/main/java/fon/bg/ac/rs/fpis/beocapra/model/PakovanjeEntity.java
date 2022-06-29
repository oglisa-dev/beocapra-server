package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Pakovanje", schema = "public", catalog = "beocapra-db")
public class PakovanjeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PakovanjeID")
    private long pakovanjeId;
    @Basic
    @Column(name = "NazivPakovanja")
    private String nazivPakovanja;

    public long getPakovanjeId() {
        return pakovanjeId;
    }

    public void setPakovanjeId(long pakovanjeId) {
        this.pakovanjeId = pakovanjeId;
    }

    public String getNazivPakovanja() {
        return nazivPakovanja;
    }

    public void setNazivPakovanja(String nazivPakovanja) {
        this.nazivPakovanja = nazivPakovanja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PakovanjeEntity that = (PakovanjeEntity) o;
        return pakovanjeId == that.pakovanjeId && Objects.equals(nazivPakovanja, that.nazivPakovanja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pakovanjeId, nazivPakovanja);
    }
}
