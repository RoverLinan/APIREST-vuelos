package com.examenfinal.proyecto.services;

import java.util.List;

import com.examenfinal.proyecto.models.Pasajero;

public interface PasajeroService {
    

    Pasajero findById(int id);
    List<Pasajero> findAll();

}
