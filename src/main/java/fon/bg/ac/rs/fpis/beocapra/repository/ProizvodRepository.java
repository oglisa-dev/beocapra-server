package fon.bg.ac.rs.fpis.beocapra.repository;

import fon.bg.ac.rs.fpis.beocapra.model.ProizvodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProizvodRepository extends JpaRepository<ProizvodEntity,Long> {

    List<ProizvodEntity> findByNazivProizvoda(String name);

    List<ProizvodEntity> findByNazivProizvodaIgnoreCase(String name);

    @Query("SELECT p FROM ProizvodEntity p WHERE upper(p.nazivProizvoda) LIKE CONCAT('%',upper(:namePart),'%')")
    List<ProizvodEntity> findByNazivProizvodaPart(@Param("namePart") String namePart);

    @Query("SELECT p FROM ProizvodEntity p WHERE CONCAT(p.proizvodId,'') LIKE CONCAT('%',upper(:idPart),'%')")
    List<ProizvodEntity> findByProizvodIdPart(@Param("idPart") String idPart);

    @Query(
            value = "SELECT p FROM ProizvodEntity p WHERE " +
                    "CONCAT(p.proizvodId,'') LIKE CONCAT('%',upper(:idPart),'%')" +
                    "AND upper(p.nazivProizvoda) LIKE CONCAT('%',upper(:namePart),'%')"
    )
    List<ProizvodEntity> findByNazivProizvodaAndProizvodIdPart(@Param("namePart")String namePart,
                                                               @Param("idPart") String idPart);

}
