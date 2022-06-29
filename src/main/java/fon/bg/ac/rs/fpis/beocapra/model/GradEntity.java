package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Grad", schema = "public", catalog = "beocapra-db")
public class GradEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GradID")
    private long gradId;
    @Basic
    @Column(name = "NazivGrada")
    private String nazivGrada;

    public long getGradId() {
        return gradId;
    }

    public void setGradId(long gradId) {
        this.gradId = gradId;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradEntity that = (GradEntity) o;
        return gradId == that.gradId && Objects.equals(nazivGrada, that.nazivGrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradId, nazivGrada);
    }
}
