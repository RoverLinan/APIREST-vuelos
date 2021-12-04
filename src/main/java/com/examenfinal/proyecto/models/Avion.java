package com.examenfinal.proyecto.models;


import javax.persistence.*;

@Entity
public class Avion {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;
    String tipo;
    String fabricante;
    int capacidad;


    @ManyToOne
    @JoinColumn(name = "idaerolinia")
    Aerolinea aerolinea;
}
