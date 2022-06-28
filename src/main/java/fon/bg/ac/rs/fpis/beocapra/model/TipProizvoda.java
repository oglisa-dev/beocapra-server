package fon.bg.ac.rs.fpis.beocapra.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class TipProizvoda {

    @Id
    @Column(name = "TipProizvodaID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tipProizvodaID;

    @NonNull
    @Column(name = "NazivTipaProizvoda")
    private String nazivTipaProizvoda;

    public TipProizvoda(Long tipProizvodaID, @NonNull String nazivTipaProizvoda) {
        this.tipProizvodaID = tipProizvodaID;
        this.nazivTipaProizvoda = nazivTipaProizvoda;
    }

    public TipProizvoda() {
    }

    public Long getTipProizvodaID() {
        return tipProizvodaID;
    }

    public void setTipProizvodaID(Long tipProizvodaID) {
        this.tipProizvodaID = tipProizvodaID;
    }

    @NonNull
    public String getNazivTipaProizvoda() {
        return nazivTipaProizvoda;
    }

    public void setNazivTipaProizvoda(@NonNull String nazivTipaProizvoda) {
        this.nazivTipaProizvoda = nazivTipaProizvoda;
    }
}
