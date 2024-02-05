package edu.upc.SIVacunacionAPI.controllers;

import edu.upc.SIVacunacionAPI.models.EsquemaPorCiudadano;
import edu.upc.SIVacunacionAPI.services.EsquemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/esquema")
public class EsquemaController {
    @Autowired
    private EsquemaService esquemaCabService;

    @GetMapping("listbycitizen")
    public ResponseEntity<List<EsquemaPorCiudadano>> ObtenerEsquemaDelCiudadano(@RequestParam(value = "id")Integer idCiudadano){
        try{
            return ResponseEntity.ok(esquemaCabService.ObtenerEsquemaDelCiudadano(idCiudadano));
        }catch (Exception ex){
            return ResponseEntity.badRequest().body(null);
        }
    }
}
