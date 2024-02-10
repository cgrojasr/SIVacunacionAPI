package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermedadRepository extends JpaRepository<Enfermedad, Integer> {
}
