package edu.upc.SIVacunacionAPI.services;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import edu.upc.SIVacunacionAPI.repository.DocumentoIdentidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoIdentidadService {
    @Autowired
    DocumentoIdentidadRepository repository;

    public Integer Registrar(DocumentoIdentidad objDocumentoIdentidad){
        repository.save(objDocumentoIdentidad);
        return objDocumentoIdentidad.idDocumentoIdentidad;
    }

    public Integer Eliminar(Integer idDocumentoIdentidad){
        DocumentoIdentidad objDocumentoIdentidad = repository.findById(idDocumentoIdentidad).orElseThrow();
        repository.deleteById(idDocumentoIdentidad);
        return objDocumentoIdentidad.idDocumentoIdentidad;
    }

    public DocumentoIdentidad Actualizar(DocumentoIdentidad objDocumentoIdentidad){
        if(objDocumentoIdentidad.idDocumentoIdentidad != null){
            repository.save(objDocumentoIdentidad);
            return objDocumentoIdentidad;
        }
        else {
            return null;
        }
    }

    public DocumentoIdentidad BuscarPorId(Integer idDocumentoIdentidad){
        return repository.findById(idDocumentoIdentidad).orElseThrow();
    }

    public List<DocumentoIdentidad> ListarTodo(){
        return repository.findAll();
    }

    public List<DocumentoIdentidad> ListarPorActivo(Boolean activo){
        var respuesta = repository.findByActivo(activo);
        return respuesta;
    }
}
