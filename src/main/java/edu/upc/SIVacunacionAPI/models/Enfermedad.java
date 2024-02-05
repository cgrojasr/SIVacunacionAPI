package edu.upc.SIVacunacionAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "enfermedad")
@AllArgsConstructor
@NoArgsConstructor
public class Enfermedad {
    @Id
    @Column(name = "id_enfermedad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEnfermedad;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "vacuna_enfermedad",
            joinColumns = @JoinColumn(name = "id_enfermedad", foreignKey = @ForeignKey(name = "FK_ENFERMEDAD_VACUNA")),
            inverseJoinColumns = @JoinColumn(name = "id_vacuna", foreignKey = @ForeignKey(name = "FK_VACUNA_ENFERMEDAD"))
    )
    private Set<Vacuna> vacunas = new HashSet<>();
    @JsonIgnore
    @OneToMany(mappedBy = "enfermedad")
    private Set<EsquemaDetalle> items = new HashSet<>();
}
