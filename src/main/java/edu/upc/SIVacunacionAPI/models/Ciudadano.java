package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ciudadano")
@AllArgsConstructor
@NoArgsConstructor
public class Ciudadano {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ciudadano")
    private Integer idCiudadano;
    @Column(name = "nombres", nullable = false)
    private String nombres;
    @Column(name = "apellido_paterno", nullable = false)
    private String apellidoPaterno;
    @Column(name = "apellido_materno", nullable = false)
    private String apellidoMaterno;
    @ManyToOne
    @JoinColumn(name = "id_documento_identidad")
    private DocumentoIdentidad documentoIdentidad;
    @Column(name = "numero_documento_identidad", nullable = false)
    private String numeroDocumentoIdentidad;
    @Column(name = "activo", nullable = false)
    private Boolean activo;
}
