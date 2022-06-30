package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.FizickaOsobinaEntity;
import fon.bg.ac.rs.fpis.beocapra.model.HemijskaOsobinaEntity;
import fon.bg.ac.rs.fpis.beocapra.model.ProizvodEntity;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Collection;

public class ProizvodDTO implements Serializable, DTO<ProizvodEntity> {

    private Long proizvodID;
    private String nazivProizvoda;
    private Date datumProizvodnje;
    private BigInteger cena;
    private String vrstaProizvoda;
    private BigInteger trenutnoStanjeZaliha;
    private JedinicaMereDTO jedinicaMere;
    private TipProizvodaDTO tipProizvoda;
    private Collection<HemijskaOsobinaEntity> hemijskeOsobine;
    private Collection<FizickaOsobinaEntity> fizickeOsobine;

    public ProizvodDTO(Long proizvodID, String nazivProizvoda, Date datumProizvodnje, BigInteger cena, String vrstaProizvoda, BigInteger trenutnoStanjeZaliha, JedinicaMereDTO jedinicaMere, TipProizvodaDTO tipProizvoda) {
        this.proizvodID = proizvodID;
        this.nazivProizvoda = nazivProizvoda;
        this.datumProizvodnje = datumProizvodnje;
        this.cena = cena;
        this.vrstaProizvoda = vrstaProizvoda;
        this.trenutnoStanjeZaliha = trenutnoStanjeZaliha;
        this.jedinicaMere = jedinicaMere;
        this.tipProizvoda = tipProizvoda;
    }

    public ProizvodDTO(Long proizvodID, String nazivProizvoda, Date datumProizvodnje, BigInteger cena, String vrstaProizvoda, BigInteger trenutnoStanjeZaliha, JedinicaMereDTO jedinicaMere, TipProizvodaDTO tipProizvoda, Collection<HemijskaOsobinaEntity> hemijskeOsobine, Collection<FizickaOsobinaEntity> fizickeOsobine) {
        this.proizvodID = proizvodID;
        this.nazivProizvoda = nazivProizvoda;
        this.datumProizvodnje = datumProizvodnje;
        this.cena = cena;
        this.vrstaProizvoda = vrstaProizvoda;
        this.trenutnoStanjeZaliha = trenutnoStanjeZaliha;
        this.jedinicaMere = jedinicaMere;
        this.tipProizvoda = tipProizvoda;
        this.hemijskeOsobine = hemijskeOsobine;
        this.fizickeOsobine = fizickeOsobine;
    }

    public ProizvodDTO() {
    }

    public ProizvodDTO(ProizvodEntity proizvod) {
        this.cena = proizvod.getCena();
        this.fizickeOsobine = proizvod.getFizickeOsobine();
        this.hemijskeOsobine = proizvod.getHemijskeOsobine();
        this.proizvodID = proizvod.getProizvodId();
        this.datumProizvodnje = proizvod.getDatumProizvodnje();
        this.jedinicaMere = new JedinicaMereDTO(proizvod.getJedinicaMere());
        this.tipProizvoda = new TipProizvodaDTO(proizvod.getTipProizvoda());
        this.trenutnoStanjeZaliha = proizvod.getTrenutnoStanjeZaliha();
        this.vrstaProizvoda = proizvod.getVrstaProizvoda();
        this.nazivProizvoda = proizvod.getNazivProizvoda();
    }

    public ProizvodEntity fromDTO() {
        ProizvodEntity proizvod = new ProizvodEntity();
        proizvod.setProizvodId(this.proizvodID);
        proizvod.setCena(this.cena);
        proizvod.setDatumProizvodnje(this.datumProizvodnje);
        proizvod.setNazivProizvoda(this.nazivProizvoda);
        proizvod.setVrstaProizvoda(this.vrstaProizvoda);
        proizvod.setJedinicaMere(this.jedinicaMere.fromDTO());
        proizvod.setTipProizvoda(this.tipProizvoda.fromDTO());
        proizvod.setTrenutnoStanjeZaliha(this.trenutnoStanjeZaliha);
        proizvod.setFizickeOsobine(this.fizickeOsobine);
        proizvod.setHemijskeOsobine(this.hemijskeOsobine);
        return proizvod;
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

    public BigInteger getCena() {
        return cena;
    }

    public void setCena(BigInteger cena) {
        this.cena = cena;
    }

    public String getVrstaProizvoda() {
        return vrstaProizvoda;
    }

    public void setVrstaProizvoda(String vrstaProizvoda) {
        this.vrstaProizvoda = vrstaProizvoda;
    }

    public BigInteger getTrenutnoStanjeZaliha() {
        return trenutnoStanjeZaliha;
    }

    public void setTrenutnoStanjeZaliha(BigInteger trenutnoStanjeZaliha) {
        this.trenutnoStanjeZaliha = trenutnoStanjeZaliha;
    }

    public JedinicaMereDTO getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMereDTO jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public TipProizvodaDTO getTipProizvoda() {
        return tipProizvoda;
    }

    public void setTipProizvoda(TipProizvodaDTO tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }
}
