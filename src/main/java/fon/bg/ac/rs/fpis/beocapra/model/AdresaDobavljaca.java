package fon.bg.ac.rs.fpis.beocapra.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AdresaDobavljaca")
public class AdresaDobavljaca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AdresaDobavljacaID")
    private Long adresaDobavljacaID;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "DobavljacID", referencedColumnName = "DobavljacID", nullable = false)
    private Dobavljac dobavljac;

    @Column(name = "Ulica")
    private String ulica;

    @Column(name = "Broj")
    private int broj;

    @Column(name = "Fax")
    private String fax;

    @Column(name = "BrojTelefona")
    private String brojTelefona;

}
