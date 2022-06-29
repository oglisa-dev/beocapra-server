package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Dobavljac", schema = "public", catalog = "beocapra-db")
public class DobavljacEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DobavljacID")
    private long dobavljacId;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "MaticniBroj")
    private String maticniBroj;
    @Basic
    @Column(name = "NazivDobavljaca")
    private String nazivDobavljaca;
    @Basic
    @Column(name = "PIB")
    private String pib;
    @Basic
    @Column(name = "ZiroRacun")
    private String ziroRacun;
    @Basic
    @Column(name = "Website")
    private String website;

    public long getDobavljacId() {
        return dobavljacId;
    }

    public void setDobavljacId(long dobavljacId) {
        this.dobavljacId = dobavljacId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getNazivDobavljaca() {
        return nazivDobavljaca;
    }

    public void setNazivDobavljaca(String nazivDobavljaca) {
        this.nazivDobavljaca = nazivDobavljaca;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getZiroRacun() {
        return ziroRacun;
    }

    public void setZiroRacun(String ziroRacun) {
        this.ziroRacun = ziroRacun;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DobavljacEntity that = (DobavljacEntity) o;
        return dobavljacId == that.dobavljacId && Objects.equals(email, that.email) && Objects.equals(maticniBroj, that.maticniBroj) && Objects.equals(nazivDobavljaca, that.nazivDobavljaca) && Objects.equals(pib, that.pib) && Objects.equals(ziroRacun, that.ziroRacun) && Objects.equals(website, that.website);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dobavljacId, email, maticniBroj, nazivDobavljaca, pib, ziroRacun, website);
    }
}
