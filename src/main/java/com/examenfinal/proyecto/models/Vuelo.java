package com.examenfinal.proyecto.models;


import javax.persistence.*;


@Entity
public class Vuelo {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    int id;


    @ManyToOne
    @JoinColumn(name = "idaeropuerto" )
    Aeropuerto aeropuerto;

   

    @ManyToOne
    @JoinColumn(name = "idavion" )
    Avion avion;

    
    @ManyToOne
    @JoinColumn(name = "idreserva")
    Reserva reserva;


    @ManyToOne
    @JoinColumn(name = "idasiento")
    Asiento asiento;

    @ManyToOne
    @JoinColumn(name = "idtarifa")
    Tarifa tarifa;


}
