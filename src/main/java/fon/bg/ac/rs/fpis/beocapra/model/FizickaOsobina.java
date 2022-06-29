package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;

@Entity
@Table(name = "FizickaOsobina")
@IdClass(HemijskaOsobinaID.class)
public class FizickaOsobina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FizickaOsobinaID")
    private Long fizickaOsobinaID;
    @Id
    @Column(name = "ProizvodID")
    private Long proizvodID;

    @Column(name = "NazivFizickeOsobine")
    private String nazivFizickeOsobine;

    @Column(name = "VrednostFizickeOsobine")
    private double vrednostFizickeOsobine;

    @Column(name = "MetodIspitivanjaFizickeOsobine")
    private String metodIspitivanjaFizickeOsobine;

    public FizickaOsobina() {
    }

    public FizickaOsobina(Long proizvodID, String nazivFizickeOsobine, double vrednostFizickeOsobine, String metodIspitivanjaFizickeOsobine) {
        this.proizvodID = proizvodID;
        this.nazivFizickeOsobine = nazivFizickeOsobine;
        this.vrednostFizickeOsobine = vrednostFizickeOsobine;
        this.metodIspitivanjaFizickeOsobine = metodIspitivanjaFizickeOsobine;
    }

    public Long getFizickaOsobinaID() {
        return fizickaOsobinaID;
    }

    public void setFizickaOsobinaID(Long fizickaOsobinaID) {
        this.fizickaOsobinaID = fizickaOsobinaID;
    }

    public Long getProizvodID() {
        return proizvodID;
    }

    public void setProizvodID(Long proizvodID) {
        this.proizvodID = proizvodID;
    }

    public String getNazivFizickeOsobine() {
        return nazivFizickeOsobine;
    }

    public void setNazivFizickeOsobine(String nazivFizickeOsobine) {
        this.nazivFizickeOsobine = nazivFizickeOsobine;
    }

    public double getVrednostFizickeOsobine() {
        return vrednostFizickeOsobine;
    }

    public void setVrednostFizickeOsobine(double vrednostFizickeOsobine) {
        this.vrednostFizickeOsobine = vrednostFizickeOsobine;
    }

    public String getMetodIspitivanjaFizickeOsobine() {
        return metodIspitivanjaFizickeOsobine;
    }

    public void setMetodIspitivanjaFizickeOsobine(String metodIspitivanjaFizickeOsobine) {
        this.metodIspitivanjaFizickeOsobine = metodIspitivanjaFizickeOsobine;
    }
}
