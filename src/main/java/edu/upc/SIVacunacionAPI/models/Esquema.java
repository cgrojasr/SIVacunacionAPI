package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "esquema")
@AllArgsConstructor
@NoArgsConstructor
public class Esquema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_esquema")
    private Integer idEsquema;
    @OneToOne
    @JoinColumn(name = "id_ciudadano")
    private Ciudadano ciudadano;
    @Column(name = "fecha_registro", nullable = false)
    private Date fechaRegistro;
    @Column(name = "activo", nullable = false)
    private Boolean activo;
    @OneToMany(mappedBy = "esquema")
    private Set<EsquemaDetalle> items = new HashSet<>();
}
