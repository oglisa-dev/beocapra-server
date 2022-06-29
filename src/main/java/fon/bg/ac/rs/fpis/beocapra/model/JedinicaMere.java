package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;

@Entity
@Table(name = "JedinicaMere ")
public class JedinicaMere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JedinicaMereID",updatable = false)
    private Long jedinicaMereID;

    @Column(name = "NazivJediniceMere",nullable = false)
    private String nazivJediniceMere;

    public JedinicaMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }

    public JedinicaMere() {

    }

    public Long getJedinicaMereID() {
        return jedinicaMereID;
    }

    public void setJedinicaMereID(Long jedinicaMereID) {
        this.jedinicaMereID = jedinicaMereID;
    }

    public String getNazivJediniceMere() {
        return nazivJediniceMere;
    }

    public void setNazivJediniceMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }
}
