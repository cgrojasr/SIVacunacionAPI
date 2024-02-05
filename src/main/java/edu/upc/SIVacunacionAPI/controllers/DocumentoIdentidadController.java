package edu.upc.SIVacunacionAPI.controllers;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import edu.upc.SIVacunacionAPI.services.DocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documentoidentidad")
public class DocumentoIdentidadController {
    @Autowired
    private DocumentoIdentidadService service;

    @GetMapping("/filter")
    public ResponseEntity<List<DocumentoIdentidad>>  ListarPorActivo(@RequestParam(value = "activo") Boolean activo){
        try {
            return ResponseEntity.ok(service.ListarPorActivo(activo));
        } catch (Exception ex){
            return ResponseEntity.badRequest().body(null);
        }
    }
}
