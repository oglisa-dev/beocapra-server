package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JedinicaMere ", schema = "public", catalog = "beocapra-db")
public class JedinicaMereEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JedinicaMereID")
    private long jedinicaMereId;
    @Basic
    @Column(name = "NazivJediniceMere")
    private String nazivJediniceMere;

    public long getJedinicaMereId() {
        return jedinicaMereId;
    }

    public void setJedinicaMereId(long jedinicaMereId) {
        this.jedinicaMereId = jedinicaMereId;
    }

    public String getNazivJediniceMere() {
        return nazivJediniceMere;
    }

    public void setNazivJediniceMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JedinicaMereEntity that = (JedinicaMereEntity) o;
        return jedinicaMereId == that.jedinicaMereId && Objects.equals(nazivJediniceMere, that.nazivJediniceMere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jedinicaMereId, nazivJediniceMere);
    }
}
