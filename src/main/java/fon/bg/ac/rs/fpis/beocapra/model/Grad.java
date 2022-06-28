package fon.bg.ac.rs.fpis.beocapra.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Grad {

    @Id
    @Column(name = "GradID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradID;

    @NonNull
    @Column(name = "NazivGrada")
    private String nazivGrada;

    public Grad(Long gradID, @NonNull String nazivGrada) {
        this.gradID = gradID;
        this.nazivGrada = nazivGrada;
    }

    public Grad() {}

    public Long getGradID() {
        return gradID;
    }

    public void setGradID(Long gradID) {
        this.gradID = gradID;
    }

    @NonNull
    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(@NonNull String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

}
