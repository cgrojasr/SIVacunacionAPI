package edu.upc.SIVacunacionAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "documento_identidad")
@Getter
@Setter
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
    @JsonIgnore
    @OneToMany(mappedBy = "documentoIdentidad")
    private Set<Ciudadano> ciudadanos = new HashSet<>();
}
