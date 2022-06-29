package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;

@Entity
@Table(name = "Pakovanje")
public class Pakovanje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PakovanjeID", updatable = false)
    private Long pakovanjeID;

    @Column(name = "NazivPakovanja",nullable = false)
    private String naziv;

    public Pakovanje(String naziv) {
        this.naziv = naziv;
    }

    public Pakovanje() {

    }

    public Long getPakovanjeID() {
        return pakovanjeID;
    }

    public void setPakovanjeID(Long pakovanjeID) {
        this.pakovanjeID = pakovanjeID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
