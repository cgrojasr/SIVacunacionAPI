package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "esquema_detalle")
public class EsquemaDetalle {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_esquema", nullable = false)
    private Esquema esquema;
    @ManyToOne
    @JoinColumn(name = "id_vacuna")
    private Vacuna vacuna;
    @Id
    @ManyToOne
    @JoinColumn(name = "id_enfermedad", nullable = false)
    private Enfermedad enfermedad;
    @Column(name = "fecha_aplicacion")
    private Date fechaAplicacion;
    @ManyToOne
    @JoinColumn(name = "id_personal")
    private Personal personal;
    @ManyToOne
    @JoinColumn(name = "id_local")
    private Local local;

}
