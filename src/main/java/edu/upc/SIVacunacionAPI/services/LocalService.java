package edu.upc.SIVacunacionAPI.services;

import edu.upc.SIVacunacionAPI.repository.Localrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService {
    @Autowired
    private Localrepository repository;


}
