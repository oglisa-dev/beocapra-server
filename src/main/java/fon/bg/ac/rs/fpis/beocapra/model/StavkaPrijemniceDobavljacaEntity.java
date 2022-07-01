package fon.bg.ac.rs.fpis.beocapra.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "StavkaPrijemniceDobavljaca", schema = "public", catalog = "beocapra-db")
@IdClass(StavkaPrijemniceDobavljacaEntityPK.class)
@Data @NoArgsConstructor @AllArgsConstructor
public class StavkaPrijemniceDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PrijemnicaDobavljacaID")
    private long prijemnicaDobavljacaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StavkaPrijemniceDobavljacaID")
    private long stavkaPrijemniceDobavljacaId;
    @Basic
    @Column(name = "Kolicina")
    private BigInteger kolicina;
    @Basic
    @Column(name = "Vrednost")
    private BigInteger vrednost;
    @Basic
    @Column(name = "ProizvodID")
    private long proizvodId;
    @JsonIgnore
    @ManyToOne(
        targetEntity = PrijemnicaDobavljacaEntity.class,
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(
            name = "PrijemnicaDobavljacaID",
            nullable = false,
            insertable = false,
            updatable = false
    )
    private PrijemnicaDobavljacaEntity prijemnicaDobavljaca;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StavkaPrijemniceDobavljacaEntity that = (StavkaPrijemniceDobavljacaEntity) o;
        return prijemnicaDobavljacaId == that.prijemnicaDobavljacaId && stavkaPrijemniceDobavljacaId == that.stavkaPrijemniceDobavljacaId && proizvodId == that.proizvodId && Objects.equals(kolicina, that.kolicina) && Objects.equals(vrednost, that.vrednost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prijemnicaDobavljacaId, stavkaPrijemniceDobavljacaId, kolicina, vrednost, proizvodId);
    }
}
