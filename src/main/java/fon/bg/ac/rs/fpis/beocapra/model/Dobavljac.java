package fon.bg.ac.rs.fpis.beocapra.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "Dobavljac")
@Table(
        name = "Dobavljac",
        uniqueConstraints = {
                @UniqueConstraint(name = "PIB_unique", columnNames = "PIB"),
                @UniqueConstraint(name = "maticni_broj_unique", columnNames = "MaticniBroj")
        }
)
public class Dobavljac implements Serializable {

    @Id
    @SequenceGenerator(
            name = "dobavljac_generator",
            sequenceName = "dobavljac_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "dobavljac_generator"
    )
    @Column(
            name = "DobavljacID",
            updatable = false
    )
    private Long dobavljacID;

    @Column(name = "NazivDobavljaca")
    private String nazivDobavljaca;

    @Column(
            name = "PIB",
            nullable = false
    )
    private String PIB;

    @Column(name = "ZiroRacun")
    private String ziroRacun;

    @Column(
            name = "MaticniBroj",
            nullable = false
    )
    private String maticniBroj;

    @Column(name = "Email")
    private String email;

    @Column(name = "Website")
    private String website;

    @OneToMany(mappedBy = "dobavljac",fetch = FetchType.EAGER)
    private final Set<AdresaDobavljaca> adrese = new HashSet<>();

    public Dobavljac(@NonNull Long dobavljacID, String nazivDobavljaca, @NonNull String PIB, @NonNull String ziroRacun, @NonNull String maticniBroj, String email, String website) {
        this.dobavljacID = dobavljacID;
        this.nazivDobavljaca = nazivDobavljaca;
        this.PIB = PIB;
        this.ziroRacun = ziroRacun;
        this.maticniBroj = maticniBroj;
        this.email = email;
        this.website = website;
    }

    public Dobavljac(String nazivDobavljaca, @NonNull String PIB, @NonNull String ziroRacun, @NonNull String maticniBroj, String email, String website) {
        this.nazivDobavljaca = nazivDobavljaca;
        this.PIB = PIB;
        this.ziroRacun = ziroRacun;
        this.maticniBroj = maticniBroj;
        this.email = email;
        this.website = website;
    }

    public Dobavljac() {}

    @NonNull
    public Long getDobavljacID() {
        return dobavljacID;
    }

    public void setDobavljacID(@NonNull Long dobavljacID) {
        this.dobavljacID = dobavljacID;
    }

    public String getNazivDobavljaca() {
        return nazivDobavljaca;
    }

    public void setNazivDobavljaca(String nazivDobavljaca) {
        this.nazivDobavljaca = nazivDobavljaca;
    }

    @NonNull
    public String getPIB() {
        return PIB;
    }

    public void setPIB(@NonNull String PIB) {
        this.PIB = PIB;
    }

    @NonNull
    public String getZiroRacun() {
        return ziroRacun;
    }

    public void setZiroRacun(@NonNull String ziroRacun) {
        this.ziroRacun = ziroRacun;
    }

    @NonNull
    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(@NonNull String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Set<AdresaDobavljaca> getAdrese() {
        return adrese;
    }

    @Override
    public String toString() {
        return "Dobavljac{id=" + dobavljacID + ", naziv=" + nazivDobavljaca + ", PIB=" + PIB +
                ", maticniBroj=" + maticniBroj + ", email=" + email + ", website=" + website;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Dobavljac)) return false;
        Dobavljac dobavljac = (Dobavljac) obj;
        return Objects.equals(dobavljac.dobavljacID,dobavljacID) && Objects.equals(dobavljac.nazivDobavljaca,nazivDobavljaca) &&
            Objects.equals(dobavljac.PIB,PIB) && Objects.equals(dobavljac.maticniBroj,maticniBroj) &&
                    Objects.equals(dobavljac.ziroRacun,ziroRacun) && Objects.equals(dobavljac.email,email) &&
                    Objects.equals(dobavljac.website,website);
    }
}
