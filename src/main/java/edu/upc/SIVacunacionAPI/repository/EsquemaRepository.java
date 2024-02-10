package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.Esquema;
import edu.upc.SIVacunacionAPI.models.EsquemaPorCiudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EsquemaRepository extends JpaRepository<Esquema, Integer> {
    @Query(value = "SELECT new edu.upc.SIVacunacionAPI.models.EsquemaPorCiudadano(" +
            "esq.idEsquema, det.enfermedad.idEnfermedad, enf.nombre, " +
            "det.vacuna.idVacuna, vac.nombre) " +
            "FROM Esquema AS esq " +
            "LEFT JOIN EsquemaDetalle AS det ON esq.idEsquema = det.esquema.idEsquema " +
            "LEFT JOIN Enfermedad AS enf ON enf.idEnfermedad = det.enfermedad.idEnfermedad " +
            "LEFT JOIN Vacuna AS vac ON vac.idVacuna = det.vacuna.idVacuna " +
            "WHERE esq.ciudadano.idCiudadano = :idCiudadano")
    List<EsquemaPorCiudadano> ObtenerEsquemaDelCiudadano(@Param("idCiudadano") int idCiudadano);
    @Query(value = "SELECT new edu.upc.SIVacunacionAPI.models.EsquemaPorCiudadano(" +
            "esq.idEsquema, det.enfermedad.idEnfermedad, enf.nombre AS nombreEnfermedad, " +
            "det.vacuna.idVacuna, vac.nombre AS nombreVacuna) " +
            "FROM Esquema AS esq " +
            "LEFT JOIN EsquemaDetalle AS det ON esq.idEsquema = det.esquema.idEsquema " +
            "LEFT JOIN Enfermedad AS enf ON enf.idEnfermedad = det.enfermedad.idEnfermedad " +
            "LEFT JOIN Vacuna AS vac ON vac.idVacuna = det.vacuna.idVacuna " +
            "WHERE esq.ciudadano.idCiudadano = :idCiudadano AND det.vacuna.idVacuna = null")
    List<EsquemaPorCiudadano> ObtenerEsquemaDelCiudadano_Pendiente(@Param("idCiudadano") int idCiudadano);
}
