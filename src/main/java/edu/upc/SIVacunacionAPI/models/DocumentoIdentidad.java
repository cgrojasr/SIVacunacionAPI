package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "documento_identidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoIdentidad {
    @Id
    @Column(name = "id_documento_identidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idDocumentoIdentidad;
    @Column(name = "nombre", length = 100, nullable = false)
    public String nombre;
    @Column(name = "activo", nullable = false)
    public Boolean activo;
    @OneToMany(mappedBy = "documentoIdentidad")
    private Set<Ciudadano> ciudadanos = new HashSet<>();
}
