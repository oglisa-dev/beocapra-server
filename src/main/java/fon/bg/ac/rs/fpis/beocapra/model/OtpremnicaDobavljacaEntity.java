package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "OtpremnicaDobavljaca", schema = "public", catalog = "beocapra-db")
public class OtpremnicaDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OtpremnicaDobavljacaID")
    private long otpremnicaDobavljacaId;
    @Basic
    @Column(name = "DatumOtpremanja")
    private Date datumOtpremanja;
    @Basic
    @Column(name = "Izdao")
    private String izdao;
    @Basic
    @Column(name = "ImePrezimeVozaca")
    private String imePrezimeVozaca;
    @Basic
    @Column(name = "BrojLicneKarte")
    private String brojLicneKarte;
    @Basic
    @Column(name = "RegistarskiBrojVozila")
    private String registarskiBrojVozila;
    @Basic
    @Column(name = "RadnikID")
    private long radnikId;
    @Basic
    @Column(name = "DobavljacID")
    private long dobavljacId;

    public long getOtpremnicaDobavljacaId() {
        return otpremnicaDobavljacaId;
    }

    public void setOtpremnicaDobavljacaId(long otpremnicaDobavljacaId) {
        this.otpremnicaDobavljacaId = otpremnicaDobavljacaId;
    }

    public Date getDatumOtpremanja() {
        return datumOtpremanja;
    }

    public void setDatumOtpremanja(Date datumOtpremanja) {
        this.datumOtpremanja = datumOtpremanja;
    }

    public String getIzdao() {
        return izdao;
    }

    public void setIzdao(String izdao) {
        this.izdao = izdao;
    }

    public String getImePrezimeVozaca() {
        return imePrezimeVozaca;
    }

    public void setImePrezimeVozaca(String imePrezimeVozaca) {
        this.imePrezimeVozaca = imePrezimeVozaca;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getRegistarskiBrojVozila() {
        return registarskiBrojVozila;
    }

    public void setRegistarskiBrojVozila(String registarskiBrojVozila) {
        this.registarskiBrojVozila = registarskiBrojVozila;
    }

    public long getRadnikId() {
        return radnikId;
    }

    public void setRadnikId(long radnikId) {
        this.radnikId = radnikId;
    }

    public long getDobavljacId() {
        return dobavljacId;
    }

    public void setDobavljacId(long dobavljacId) {
        this.dobavljacId = dobavljacId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtpremnicaDobavljacaEntity that = (OtpremnicaDobavljacaEntity) o;
        return otpremnicaDobavljacaId == that.otpremnicaDobavljacaId && radnikId == that.radnikId && dobavljacId == that.dobavljacId && Objects.equals(datumOtpremanja, that.datumOtpremanja) && Objects.equals(izdao, that.izdao) && Objects.equals(imePrezimeVozaca, that.imePrezimeVozaca) && Objects.equals(brojLicneKarte, that.brojLicneKarte) && Objects.equals(registarskiBrojVozila, that.registarskiBrojVozila);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otpremnicaDobavljacaId, datumOtpremanja, izdao, imePrezimeVozaca, brojLicneKarte, registarskiBrojVozila, radnikId, dobavljacId);
    }
}
