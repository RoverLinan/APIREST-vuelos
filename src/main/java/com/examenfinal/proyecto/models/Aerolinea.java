package com.examenfinal.proyecto.models;



import javax.persistence.*;

@Entity
public class Aerolinea {
   @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
   int id;
   String ruc;
   String nombre;
   
}
