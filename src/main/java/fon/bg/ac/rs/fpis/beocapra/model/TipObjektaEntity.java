package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TipObjekta", schema = "public", catalog = "beocapra-db")
public class TipObjektaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TipObjektaID")
    private long tipObjektaId;
    @Basic
    @Column(name = "NazivTipaObjekta")
    private String nazivTipaObjekta;
    @Basic
    @Column(name = "OpisTipaObjekta")
    private String opisTipaObjekta;

    public long getTipObjektaId() {
        return tipObjektaId;
    }

    public void setTipObjektaId(long tipObjektaId) {
        this.tipObjektaId = tipObjektaId;
    }

    public String getNazivTipaObjekta() {
        return nazivTipaObjekta;
    }

    public void setNazivTipaObjekta(String nazivTipaObjekta) {
        this.nazivTipaObjekta = nazivTipaObjekta;
    }

    public String getOpisTipaObjekta() {
        return opisTipaObjekta;
    }

    public void setOpisTipaObjekta(String opisTipaObjekta) {
        this.opisTipaObjekta = opisTipaObjekta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipObjektaEntity that = (TipObjektaEntity) o;
        return tipObjektaId == that.tipObjektaId && Objects.equals(nazivTipaObjekta, that.nazivTipaObjekta) && Objects.equals(opisTipaObjekta, that.opisTipaObjekta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipObjektaId, nazivTipaObjekta, opisTipaObjekta);
    }
}
