package edu.upc.SIVacunacionAPI.services;

import edu.upc.SIVacunacionAPI.models.EsquemaPorUsuario;
import edu.upc.SIVacunacionAPI.repository.EsquemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EsquemaService {
    @Autowired
    private EsquemaRepository repository;

    public List<EsquemaPorUsuario> ObtenerEsquemaDelCiudadano(int idCiudadano){
        return repository.ObtenerEsquemaDelCiudadano(idCiudadano);
    }
}
