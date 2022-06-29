package fon.bg.ac.rs.fpis.beocapra.model;

import java.io.Serializable;
import java.util.Objects;

public class FizickaOsobinaID implements Serializable {

    private Long fizickaOsobinaID;
    private Long proizvodID;

    public FizickaOsobinaID(Long fizickaOsobinaID, Long proizvodID) {
        this.fizickaOsobinaID = fizickaOsobinaID;
        this.proizvodID = proizvodID;
    }

    public FizickaOsobinaID() {
    }

    public Long getFizickaOsobinaID() {
        return fizickaOsobinaID;
    }

    public void setFizickaOsobinaID(Long fizickaOsobinaID) {
        this.fizickaOsobinaID = fizickaOsobinaID;
    }

    public Long getProizvodID() {
        return proizvodID;
    }

    public void setProizvodID(Long proizvodID) {
        this.proizvodID = proizvodID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FizickaOsobinaID that = (FizickaOsobinaID) o;
        return Objects.equals(fizickaOsobinaID, that.fizickaOsobinaID) && Objects.equals(proizvodID, that.proizvodID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fizickaOsobinaID, proizvodID);
    }
}
