package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class EsquemaDetalleKey implements Serializable {
    @Column(name = "id_esquema")
    private Integer idEsquema;
    @Column(name = "id_enfermedad")
    private Integer idEnfermedad;
}
