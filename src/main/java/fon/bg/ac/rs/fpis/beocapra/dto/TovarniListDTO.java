package fon.bg.ac.rs.fpis.beocapra.dto;

import fon.bg.ac.rs.fpis.beocapra.model.TovarniListEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TovarniListDTO implements DTO<TovarniListEntity>, Serializable {

    private Long tovarniListId;
    private String napomena;
    private Date datumSlanja;
    private Long prijemnicaID;

    @Override
    public TovarniListEntity fromDTO() {
        TovarniListEntity tovarniList = new TovarniListEntity();
        tovarniList.setTovarniListId(this.tovarniListId);
        tovarniList.setDatumSlanja(this.datumSlanja);
        tovarniList.setNapomena(this.napomena);
        return tovarniList;
    }

}
