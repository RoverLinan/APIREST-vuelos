package com.examenfinal.proyecto.models;


import javax.persistence.*;

@Entity
public class Aeropuerto {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;
    String nombre;


    @ManyToOne
    @JoinColumn(name = "idpais")
    Pais pais;
    
}
