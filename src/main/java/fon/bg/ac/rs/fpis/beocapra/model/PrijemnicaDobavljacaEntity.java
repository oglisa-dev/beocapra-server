package fon.bg.ac.rs.fpis.beocapra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "PrijemnicaDobavljaca", schema = "public", catalog = "beocapra-db")
@Data @NoArgsConstructor @AllArgsConstructor
public class PrijemnicaDobavljacaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PrijemnicaDobavljacaID")
    private Long prijemnicaDobavljacaId;
    @Basic
    @Column(name = "DatumPrijema")
    private Date datumPrijema;
    @Basic
    @Column(name = "Napomena")
    private String napomena;
    @ManyToOne(
            targetEntity = DobavljacEntity.class,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "DobavljacID", nullable = false)
    private DobavljacEntity dobavljac;
    @ManyToOne(
            targetEntity = RadnikEntity.class,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "RadnikID", nullable = false)
    private RadnikEntity radnik;
    @OneToMany(
            targetEntity = StavkaPrijemniceDobavljacaEntity.class,
            mappedBy = "prijemnicaDobavljaca",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Collection<StavkaPrijemniceDobavljacaEntity> stavke;

    public PrijemnicaDobavljacaEntity addStavka(StavkaPrijemniceDobavljacaEntity stavka) {
        if (stavka == null) throw new RuntimeException("Stavka cannot be null!");
        this.stavke.add(stavka);
        return this;
    }

    public PrijemnicaDobavljacaEntity removeStavka(StavkaPrijemniceDobavljacaEntity stavka) {
        if (stavka == null) throw new RuntimeException("Stavka cannot be null!");
        this.stavke.remove(stavka);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrijemnicaDobavljacaEntity that = (PrijemnicaDobavljacaEntity) o;
        return prijemnicaDobavljacaId == that.prijemnicaDobavljacaId && Objects.equals(datumPrijema, that.datumPrijema) && Objects.equals(napomena, that.napomena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prijemnicaDobavljacaId, datumPrijema, napomena);
    }
}
