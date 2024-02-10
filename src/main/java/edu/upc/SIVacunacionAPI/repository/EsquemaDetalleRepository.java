package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.EsquemaDetalle;
import edu.upc.SIVacunacionAPI.models.EsquemaDetalleKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsquemaDetalleRepository extends JpaRepository<EsquemaDetalle, EsquemaDetalleKey> {
}
