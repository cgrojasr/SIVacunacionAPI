package edu.upc.SIVacunacionAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_personal")
    private Integer idPersonal;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "profesion")
    private String profesio;
}
