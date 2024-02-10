package edu.upc.SIVacunacionAPI.controllers;

import edu.upc.SIVacunacionAPI.models.DocumentoIdentidad;
import edu.upc.SIVacunacionAPI.services.DocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/findbyid")
    public ResponseEntity<DocumentoIdentidad> BuscarPorId(@RequestParam(value = "id") Integer idDocumentoIdentidad){
        try{
            return ResponseEntity.ok(service.BuscarPorId(idDocumentoIdentidad));
        }
        catch (Exception ex){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/findall")
    public ResponseEntity<List<DocumentoIdentidad>> ListarTodo(){
        try{
            return ResponseEntity.ok(service.ListarTodo());
        }
        catch (Exception ex){
            return ResponseEntity.noContent().build();
        }
    }

    @PutMapping
    public ResponseEntity<DocumentoIdentidad> Actualizar(@RequestBody DocumentoIdentidad objDocumentoIdentidad){
        try {
            var respuesta = service.Actualizar(objDocumentoIdentidad);
            if(respuesta != null)
                return ResponseEntity.ok(respuesta);
            else
                throw new Exception();
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<Integer> Registrar(@RequestBody DocumentoIdentidad objDocumentoIdentidad){
        try {
            return ResponseEntity.ok(service.Registrar(objDocumentoIdentidad));
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Integer> Eliminar(Integer idDocumentoIdentidad){
        try{
            var respuesta = service.Eliminar(idDocumentoIdentidad);
            if(respuesta >= 1)
                return ResponseEntity.ok(service.Eliminar(idDocumentoIdentidad));
            else
                throw new Exception("No se pudo eliminar el documento de identidad");
        }
        catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}
