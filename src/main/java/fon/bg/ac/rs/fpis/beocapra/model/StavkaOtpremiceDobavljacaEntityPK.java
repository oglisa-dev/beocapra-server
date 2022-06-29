package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StavkaOtpremiceDobavljacaEntityPK implements Serializable {
    @Column(name = "StavkaOtpremniceDobavljacaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stavkaOtpremniceDobavljacaId;
    @Column(name = "OtpremnicaDobavljacaID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long otpremnicaDobavljacaId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StavkaOtpremiceDobavljacaEntityPK that = (StavkaOtpremiceDobavljacaEntityPK) o;
        return stavkaOtpremniceDobavljacaId == that.stavkaOtpremniceDobavljacaId && otpremnicaDobavljacaId == that.otpremnicaDobavljacaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stavkaOtpremniceDobavljacaId, otpremnicaDobavljacaId);
    }
}
