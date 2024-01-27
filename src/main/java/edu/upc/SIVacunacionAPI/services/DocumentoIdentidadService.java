package edu.upc.SIVacunacionAPI.services;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import edu.upc.SIVacunacionAPI.repository.DocumentoIdentidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoIdentidadService {
    @Autowired
    DocumentoIdentidadRepository repository;

    public Integer Registrar(DocumentoIdentidad objDocumentoIdentidad){
        repository.save(objDocumentoIdentidad);
        return objDocumentoIdentidad.idDocumentoIdentidad;
    }
}
