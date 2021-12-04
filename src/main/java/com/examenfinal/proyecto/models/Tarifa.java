package com.examenfinal.proyecto.models;



import javax.persistence.*;

@Entity
public class Tarifa {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;
    String clase;
    double precio;
    double impuesto;


}
