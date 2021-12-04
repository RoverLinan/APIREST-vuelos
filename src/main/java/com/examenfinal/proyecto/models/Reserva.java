package com.examenfinal.proyecto.models;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Reserva {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;
    double costo;
    Date fecha;
    String observacion;


}
