package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Proizvod", schema = "public", catalog = "beocapra-db")
public class ProizvodEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProizvodID", updatable = false)
    private long proizvodId;
    @Basic(optional = false)
    @Column(name = "NazivProizvoda")
    private String nazivProizvoda;
    @Basic(optional = false)
    @Column(name = "DatumProizvodnje")
    private Date datumProizvodnje;
    @Basic(optional = false)
    @Column(name = "Cena")
    private BigInteger cena;
    @Basic(optional = false)
    @Column(name = "VrstaProizvoda")
    private String vrstaProizvoda;
    @Basic(optional = false)
    @Column(name = "TrenutnoStanjeZaliha")
    private BigInteger trenutnoStanjeZaliha;
    @Basic(optional = false)
    @Column(name = "JedinicaMereID")
    private long jedinicaMereId;
    @Basic(optional = false)
    @Column(name = "TipProizvodaID")
    private long tipProizvodaId;

    @OneToMany(
            mappedBy = "proizvod",
            fetch = FetchType.LAZY,
            targetEntity = HemijskaOsobinaEntity.class,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Collection<HemijskaOsobinaEntity> hemijskeOsobine;

    @OneToMany(
            mappedBy = "proizvod",
            fetch = FetchType.LAZY,
            targetEntity = FizickaOsobinaEntity.class,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Collection<FizickaOsobinaEntity> fizickeOsobine;

    public Collection<HemijskaOsobinaEntity> getHemijskeOsobine() {
        return hemijskeOsobine;
    }

    public void setHemijskeOsobine(Collection<HemijskaOsobinaEntity> hemijskeOsobine) {
        this.hemijskeOsobine = hemijskeOsobine;
    }

    public Collection<FizickaOsobinaEntity> getFizickeOsobine() {
        return fizickeOsobine;
    }

    public void setFizickeOsobine(Collection<FizickaOsobinaEntity> fizickeOsobine) {
        this.fizickeOsobine = fizickeOsobine;
    }

    public long getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(long proizvodId) {
        this.proizvodId = proizvodId;
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

    public long getJedinicaMereId() {
        return jedinicaMereId;
    }

    public void setJedinicaMereId(long jedinicaMereId) {
        this.jedinicaMereId = jedinicaMereId;
    }

    public long getTipProizvodaId() {
        return tipProizvodaId;
    }

    public void setTipProizvodaId(long tipProizvodaId) {
        this.tipProizvodaId = tipProizvodaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProizvodEntity that = (ProizvodEntity) o;
        return proizvodId == that.proizvodId && jedinicaMereId == that.jedinicaMereId && tipProizvodaId == that.tipProizvodaId && Objects.equals(nazivProizvoda, that.nazivProizvoda) && Objects.equals(datumProizvodnje, that.datumProizvodnje) && Objects.equals(cena, that.cena) && Objects.equals(vrstaProizvoda, that.vrstaProizvoda) && Objects.equals(trenutnoStanjeZaliha, that.trenutnoStanjeZaliha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proizvodId, nazivProizvoda, datumProizvodnje, cena, vrstaProizvoda, trenutnoStanjeZaliha, jedinicaMereId, tipProizvodaId);
    }

    public ProizvodEntity addHemijskaOsobina(HemijskaOsobinaEntity hemijskaOsobinaEntity) {
        this.hemijskeOsobine.add(hemijskaOsobinaEntity);
        hemijskaOsobinaEntity.setProizvod(this);
        return this;
    }

    public ProizvodEntity removeHemijskaOsobina(HemijskaOsobinaEntity hemijskaOsobinaEntity) {
        // because of orphanRemoval = true -> will be deleted
        this.hemijskeOsobine.remove(hemijskaOsobinaEntity);
        return this;
    }

    public ProizvodEntity addFizickaOsobina(FizickaOsobinaEntity fizickaOsobinaEntity) {
        this.fizickeOsobine.add(fizickaOsobinaEntity);
        fizickaOsobinaEntity.setProizvod(this);
        return this;
    }

    public ProizvodEntity removeFizickaOsobina(FizickaOsobinaEntity fizickaOsobinaEntity) {
        // because of orphanRemoval = true -> will be deleted
        this.fizickeOsobine.remove(fizickaOsobinaEntity);
        return this;
    }

}
