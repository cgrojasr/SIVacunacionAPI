package edu.upc.SIVacunacionAPI.services;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DocumentoIdentidadServiceTest {
    @Autowired
    DocumentoIdentidadService service;

    @Test
    public void Registrar(){
        var objDocumentoIdentidad = new DocumentoIdentidad();
        objDocumentoIdentidad.nombre = "DNI";
        objDocumentoIdentidad.activo = true;
        var IdDocumentoIdentidad = service.Registrar(objDocumentoIdentidad);
        Assertions.assertEquals(IdDocumentoIdentidad, 1);
    }
}
