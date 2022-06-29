package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AdresaDobavljaca", schema = "public", catalog = "beocapra-db")
@IdClass(AdresaDobavljacaEntityPK.class)
public class AdresaDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AdresaDobavljacaID")
    private long adresaDobavljacaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DobavljacID")
    private long dobavljacId;
    @Basic
    @Column(name = "Ulica")
    private String ulica;
    @Basic
    @Column(name = "Broj")
    private Integer broj;
    @Basic
    @Column(name = "Fax")
    private String fax;
    @Basic
    @Column(name = "BrojTelefona")
    private String brojTelefona;
    @Basic
    @Column(name = "TipObjektaID")
    private long tipObjektaId;
    @Basic
    @Column(name = "GradID")
    private long gradId;

    public long getAdresaDobavljacaId() {
        return adresaDobavljacaId;
    }

    public void setAdresaDobavljacaId(long adresaDobavljacaId) {
        this.adresaDobavljacaId = adresaDobavljacaId;
    }

    public long getDobavljacId() {
        return dobavljacId;
    }

    public void setDobavljacId(long dobavljacId) {
        this.dobavljacId = dobavljacId;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public long getTipObjektaId() {
        return tipObjektaId;
    }

    public void setTipObjektaId(long tipObjektaId) {
        this.tipObjektaId = tipObjektaId;
    }

    public long getGradId() {
        return gradId;
    }

    public void setGradId(long gradId) {
        this.gradId = gradId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdresaDobavljacaEntity that = (AdresaDobavljacaEntity) o;
        return adresaDobavljacaId == that.adresaDobavljacaId && dobavljacId == that.dobavljacId && tipObjektaId == that.tipObjektaId && gradId == that.gradId && Objects.equals(ulica, that.ulica) && Objects.equals(broj, that.broj) && Objects.equals(fax, that.fax) && Objects.equals(brojTelefona, that.brojTelefona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adresaDobavljacaId, dobavljacId, ulica, broj, fax, brojTelefona, tipObjektaId, gradId);
    }
}
