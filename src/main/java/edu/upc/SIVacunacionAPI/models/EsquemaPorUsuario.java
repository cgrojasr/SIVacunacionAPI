package edu.upc.SIVacunacionAPI.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EsquemaPorUsuario {
    @JsonProperty("id_esquema")
    private Integer idEsquema;
    @JsonProperty("id_enfermedad")
    private Integer idEnfermedad;
    @JsonProperty("nombre_enfermedad")
    private String nombreEnfermedad;
    @JsonProperty("id_vacuna")
    private Integer idVacuna;
    @JsonProperty("nombre_vacuna")
    private String nombreVacuna;
}
