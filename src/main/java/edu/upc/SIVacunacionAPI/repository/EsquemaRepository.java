package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.Esquema;
import edu.upc.SIVacunacionAPI.models.EsquemaPorUsuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EsquemaRepository extends CrudRepository<Esquema, Integer> {
    @Query(value = "SELECT new edu.upc.SIVacunacionAPI.models.EsquemaPorUsuario(" +
            "esq.idEsquema, det.enfermedad.idEnfermedad, enf.nombre, " +
            "det.vacuna.idVacuna, vac.nombre) " +
            "FROM Esquema AS esq " +
            "LEFT JOIN EsquemaDetalle AS det ON esq.idEsquema = det.esquema.idEsquema " +
            "LEFT JOIN Enfermedad AS enf ON enf.idEnfermedad = det.enfermedad.idEnfermedad " +
            "LEFT JOIN Vacuna AS vac ON vac.idVacuna = det.vacuna.idVacuna " +
            "WHERE esq.ciudadano.idCiudadano = :idCiudadano")
    List<EsquemaPorUsuario> ObtenerEsquemaDelCiudadano(@Param("idCiudadano") int idCiudadano);
}
