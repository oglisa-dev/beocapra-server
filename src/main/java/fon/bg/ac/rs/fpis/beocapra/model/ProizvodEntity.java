package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Proizvod", schema = "public", catalog = "beocapra-db")
public class ProizvodEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProizvodID")
    private long proizvodId;
    @Basic
    @Column(name = "NazivProizvoda")
    private String nazivProizvoda;
    @Basic
    @Column(name = "DatumProizvodnje")
    private Date datumProizvodnje;
    @Basic
    @Column(name = "Cena")
    private BigInteger cena;
    @Basic
    @Column(name = "VrstaProizvoda")
    private String vrstaProizvoda;
    @Basic
    @Column(name = "TrenutnoStanjeZaliha")
    private BigInteger trenutnoStanjeZaliha;
    @Basic
    @Column(name = "JedinicaMereID")
    private long jedinicaMereId;
    @Basic
    @Column(name = "TipProizvodaID")
    private long tipProizvodaId;

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
}
