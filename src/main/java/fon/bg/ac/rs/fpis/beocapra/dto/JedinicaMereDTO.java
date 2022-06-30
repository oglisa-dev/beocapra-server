package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.JedinicaMereEntity;

import java.io.Serializable;

public class JedinicaMereDTO implements Serializable, DTO<JedinicaMereEntity> {

    private Long jedinicaMereId;
    private String nazivJediniceMere;

    public JedinicaMereDTO(long jedinicaMereId, String nazivJediniceMere) {
        this.jedinicaMereId = jedinicaMereId;
        this.nazivJediniceMere = nazivJediniceMere;
    }

    public JedinicaMereDTO() {
    }

    public JedinicaMereDTO(JedinicaMereEntity jedinicaMere) {
        this.jedinicaMereId = jedinicaMere.getJedinicaMereId();
        this.nazivJediniceMere = jedinicaMere.getNazivJediniceMere();
    }

    public long getJedinicaMereId() {
        return jedinicaMereId;
    }

    public void setJedinicaMereId(long jedinicaMereId) {
        this.jedinicaMereId = jedinicaMereId;
    }

    public String getNazivJediniceMere() {
        return nazivJediniceMere;
    }

    public void setNazivJediniceMere(String nazivJediniceMere) {
        this.nazivJediniceMere = nazivJediniceMere;
    }

    @Override
    public JedinicaMereEntity fromDTO() {
        JedinicaMereEntity jedinicaMere = new JedinicaMereEntity();
        jedinicaMere.setJedinicaMereId(this.jedinicaMereId);
        jedinicaMere.setNazivJediniceMere(this.nazivJediniceMere);
        return jedinicaMere;
    }
}
