package fon.bg.ac.rs.fpis.beocapra.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class JedinicaMere {

    @Id
    @Column(name = "JedinicaMereID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jedinicaMereID;

    @NonNull
    @Column(name = "NazivJediniceMere")
    private String nazivJediniceMere;

}
