package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Radnik", schema = "public", catalog = "beocapra-db")
public class RadnikEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RadnikID")
    private long radnikId;
    @Basic
    @Column(name = "BrojRadneKnjizice")
    private String brojRadneKnjizice;
    @Basic
    @Column(name = "JMBG")
    private String jmbg;
    @Basic
    @Column(name = "ImePrezime")
    private String imePrezime;
    @Basic
    @Column(name = "RadnoMestoID")
    private long radnoMestoId;

    public long getRadnikId() {
        return radnikId;
    }

    public void setRadnikId(long radnikId) {
        this.radnikId = radnikId;
    }

    public String getBrojRadneKnjizice() {
        return brojRadneKnjizice;
    }

    public void setBrojRadneKnjizice(String brojRadneKnjizice) {
        this.brojRadneKnjizice = brojRadneKnjizice;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public long getRadnoMestoId() {
        return radnoMestoId;
    }

    public void setRadnoMestoId(long radnoMestoId) {
        this.radnoMestoId = radnoMestoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadnikEntity that = (RadnikEntity) o;
        return radnikId == that.radnikId && radnoMestoId == that.radnoMestoId && Objects.equals(brojRadneKnjizice, that.brojRadneKnjizice) && Objects.equals(jmbg, that.jmbg) && Objects.equals(imePrezime, that.imePrezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radnikId, brojRadneKnjizice, jmbg, imePrezime, radnoMestoId);
    }
}
