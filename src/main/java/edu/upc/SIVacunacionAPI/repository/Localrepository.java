package edu.upc.SIVacunacionAPI.repository;

import edu.upc.SIVacunacionAPI.models.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Localrepository extends JpaRepository<Local, Integer> {
}
