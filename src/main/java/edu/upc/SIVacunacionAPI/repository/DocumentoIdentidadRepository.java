package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoIdentidadRepository extends JpaRepository<DocumentoIdentidad, Integer> {
    List<DocumentoIdentidad> findByActivo(Boolean activo);
}
