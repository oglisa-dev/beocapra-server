package fon.bg.ac.rs.fpis.beocapra.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class TipObjekta {

    @Id
    @Column(name = "TipObjektaID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tipObjektaID;

    @NonNull
    @Column(name = "NazivTipaObjekta")
    private String nazivTipaObjekta;

    @Column(name = "OpisTipaObjekta")
    private String opisTipaObjekta;

    public TipObjekta(Long tipObjektaID, @NonNull String nazivTipaObjekta, String opisTipaObjekta) {
        this.tipObjektaID = tipObjektaID;
        this.nazivTipaObjekta = nazivTipaObjekta;
        this.opisTipaObjekta = opisTipaObjekta;
    }

    public TipObjekta() {}

    public Long getTipObjektaID() {
        return tipObjektaID;
    }

    public void setTipObjektaID(Long tipObjektaID) {
        this.tipObjektaID = tipObjektaID;
    }

    @NonNull
    public String getNazivTipaObjekta() {
        return nazivTipaObjekta;
    }

    public void setNazivTipaObjekta(@NonNull String nazivTipaObjekta) {
        this.nazivTipaObjekta = nazivTipaObjekta;
    }

    public String getOpisTipaObjekta() {
        return opisTipaObjekta;
    }

    public void setOpisTipaObjekta(String opisTipaObjekta) {
        this.opisTipaObjekta = opisTipaObjekta;
    }
}
