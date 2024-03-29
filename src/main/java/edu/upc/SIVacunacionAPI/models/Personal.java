package edu.upc.SIVacunacionAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "personal")
@AllArgsConstructor
@NoArgsConstructor
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal")
    private Integer idPersonal;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "profesion")
    private String profesion;
    @JsonIgnore
    @OneToMany(mappedBy = "personal")
    private Set<EsquemaDetalle> items = new HashSet<>();
}
