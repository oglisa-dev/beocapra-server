package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HemijskaOsobina")
@IdClass(HemijskaOsobinaID.class)
public class HemijskaOsobina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HemijskaOsobinaID")
    private Long hemijskaOsobinaID;

    @Id
    @Column(name = "ProizvodID")
    private Long proizvodID;

    @Column(name = "MernaJedinica")
    private String mernaJedinica;

    @Column(name = "Kolicina")
    private double kolicina;

    @Column(name = "Sastojci")
    private String sastojci;

    public HemijskaOsobina() {
    }

    public HemijskaOsobina(Long proizvodID, String mernaJedinica, double kolicina, String sastojci) {
        this.proizvodID = proizvodID;
        this.mernaJedinica = mernaJedinica;
        this.kolicina = kolicina;
        this.sastojci = sastojci;
    }

    public Long getHemijskaOsobinaID() {
        return hemijskaOsobinaID;
    }

    public void setHemijskaOsobinaID(Long hemijskaOsobinaID) {
        this.hemijskaOsobinaID = hemijskaOsobinaID;
    }

    public Long getProizvodID() {
        return proizvodID;
    }

    public void setProizvodID(Long proizvodID) {
        this.proizvodID = proizvodID;
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public String getSastojci() {
        return sastojci;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }
}
