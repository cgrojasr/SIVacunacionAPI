package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "esquema_detalle")
public class EsquemaDetalle {
    @EmbeddedId
    private EsquemaDetalleKey id;
    @MapsId("idEsquema")
    @ManyToOne
    @JoinColumn(name = "id_esquema", nullable = false)
    private Esquema esquema;
    @MapsId("idEnfermedad")
    @ManyToOne
    @JoinColumn(name = "id_enfermedad", nullable = false)
    private Enfermedad enfermedad;
    @ManyToOne
    @JoinColumn(name = "id_vacuna")
    private Vacuna vacuna;
    @Column(name = "fecha_aplicacion")
    private Date fechaAplicacion;
    @ManyToOne
    @JoinColumn(name = "id_personal")
    private Personal personal;
    @ManyToOne
    @JoinColumn(name = "id_local")
    private Local local;

}
