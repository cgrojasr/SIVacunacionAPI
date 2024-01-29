package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vacuna")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vacuna")
    private Integer idVacuna;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "dosis", nullable = false)
    private Float dosis;
    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;
    @Column(name = "activo", nullable = false)
    private Boolean activo;
    @ManyToMany(mappedBy = "vacunas")
    private Set<Enfermedad> enfermedades;
}
