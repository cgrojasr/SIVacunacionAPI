package edu.upc.SIVacunacionAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "vacuna")
@AllArgsConstructor
@NoArgsConstructor
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JsonIgnore
    @ManyToMany(mappedBy = "vacunas")
    private Set<Enfermedad> enfermedades = new HashSet<>();
    @JsonIgnore
    @OneToMany(mappedBy = "vacuna")
    private Set<EsquemaDetalle> items = new HashSet<>();

}
