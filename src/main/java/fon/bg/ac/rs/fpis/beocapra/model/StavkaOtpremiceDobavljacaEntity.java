package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "StavkaOtpremiceDobavljaca", schema = "public", catalog = "beocapra-db")
@IdClass(StavkaOtpremiceDobavljacaEntityPK.class)
public class StavkaOtpremiceDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StavkaOtpremniceDobavljacaID")
    private long stavkaOtpremniceDobavljacaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OtpremnicaDobavljacaID")
    private long otpremnicaDobavljacaId;
    @Basic
    @Column(name = "Količina")
    private BigInteger količina;
    @Basic
    @Column(name = "ProizvodID")
    private long proizvodId;

    public long getStavkaOtpremniceDobavljacaId() {
        return stavkaOtpremniceDobavljacaId;
    }

    public void setStavkaOtpremniceDobavljacaId(long stavkaOtpremniceDobavljacaId) {
        this.stavkaOtpremniceDobavljacaId = stavkaOtpremniceDobavljacaId;
    }

    public long getOtpremnicaDobavljacaId() {
        return otpremnicaDobavljacaId;
    }

    public void setOtpremnicaDobavljacaId(long otpremnicaDobavljacaId) {
        this.otpremnicaDobavljacaId = otpremnicaDobavljacaId;
    }

    public BigInteger getKoličina() {
        return količina;
    }

    public void setKoličina(BigInteger količina) {
        this.količina = količina;
    }

    public long getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(long proizvodId) {
        this.proizvodId = proizvodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StavkaOtpremiceDobavljacaEntity that = (StavkaOtpremiceDobavljacaEntity) o;
        return stavkaOtpremniceDobavljacaId == that.stavkaOtpremniceDobavljacaId && otpremnicaDobavljacaId == that.otpremnicaDobavljacaId && proizvodId == that.proizvodId && Objects.equals(količina, that.količina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stavkaOtpremniceDobavljacaId, otpremnicaDobavljacaId, količina, proizvodId);
    }
}
