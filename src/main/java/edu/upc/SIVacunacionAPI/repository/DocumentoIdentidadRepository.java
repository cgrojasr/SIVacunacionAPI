package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoIdentidadRepository extends CrudRepository<DocumentoIdentidad, Integer> {
    List<DocumentoIdentidad> findByActivo(Boolean activo);
}
