package com.examenfinal.proyecto.repositories;

import java.util.List;

import com.examenfinal.proyecto.models.Pasajero;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroRespository extends CrudRepository<Pasajero,Integer>{
    Pasajero findById(int id);
    List<Pasajero> findAll();
}
