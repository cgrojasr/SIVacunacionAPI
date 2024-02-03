package edu.upc.SIVacunacionAPI.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EsquemaServiceTest {
    @Autowired
    EsquemaService service;

    @Test
    public void ObtenerEsquemaDelCiudadano(){
        var resultado = service.ObtenerEsquemaDelCiudadano(1);
        Assertions.assertEquals(resultado.size(), 3);
    }
}
