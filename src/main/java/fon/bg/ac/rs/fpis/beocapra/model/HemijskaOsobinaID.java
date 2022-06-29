package fon.bg.ac.rs.fpis.beocapra.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class HemijskaOsobinaID implements Serializable {

    private Long hemijskaOsobinaID;
    private Long proizvodID;

    public HemijskaOsobinaID() {

    }

    public HemijskaOsobinaID(Long hemijskaOsobinaID, Long proizvodID) {
        this.hemijskaOsobinaID = hemijskaOsobinaID;
        this.proizvodID = proizvodID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HemijskaOsobinaID that = (HemijskaOsobinaID) o;
        return Objects.equals(hemijskaOsobinaID, that.hemijskaOsobinaID) && Objects.equals(proizvodID, that.proizvodID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hemijskaOsobinaID, proizvodID);
    }
}
