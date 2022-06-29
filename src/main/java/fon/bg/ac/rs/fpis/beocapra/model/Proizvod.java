package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Proizvod")
public class Proizvod {

    @Id
    @Column(name = "ProizvodID", updatable = false)
    private Long proizvodID;

    @Column(name = "NazivProizvoda",nullable = false)
    private String nazivProizvoda;

    @Column(name = "DatumProizvodnje",nullable = false)
    private Date datumProizvodnje;

    @Column(name = "Cena")
    private double cena;

    @Column(name = "VrstaProizvoda",nullable = false)
    private String vrstaProizvoda;

    @Column(name = "TrenutnoStanjeZaliha",nullable = true)
    private double stanjeZaliha;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = TipProizvoda.class)
    @Column(name = "TipProizvodaID")
    private TipProizvoda tipProizvoda;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = JedinicaMere.class)
    @Column(name = "TipProizvodaID")
    private JedinicaMere jedinicaMere;

    @Embedded
    private List<HemijskaOsobina> hemijskeOsobine;

    public Proizvod(String nazivProizvoda, Date datumProizvodnje, double cena, String vrstaProizvoda, double stanjeZaliha, TipProizvoda tipProizvoda, JedinicaMere jedinicaMere) {
        this.nazivProizvoda = nazivProizvoda;
        this.datumProizvodnje = datumProizvodnje;
        this.cena = cena;
        this.vrstaProizvoda = vrstaProizvoda;
        this.stanjeZaliha = stanjeZaliha;
        this.tipProizvoda = tipProizvoda;
        this.jedinicaMere = jedinicaMere;
    }

    public Proizvod() {

    }

    public Long getProizvodID() {
        return proizvodID;
    }

    public void setProizvodID(Long proizvodID) {
        this.proizvodID = proizvodID;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public Date getDatumProizvodnje() {
        return datumProizvodnje;
    }

    public void setDatumProizvodnje(Date datumProizvodnje) {
        this.datumProizvodnje = datumProizvodnje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getVrstaProizvoda() {
        return vrstaProizvoda;
    }

    public void setVrstaProizvoda(String vrstaProizvoda) {
        this.vrstaProizvoda = vrstaProizvoda;
    }

    public double getStanjeZaliha() {
        return stanjeZaliha;
    }

    public void setStanjeZaliha(double stanjeZaliha) {
        this.stanjeZaliha = stanjeZaliha;
    }

    public TipProizvoda getTipProizvoda() {
        return tipProizvoda;
    }

    public void setTipProizvoda(TipProizvoda tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }
}
