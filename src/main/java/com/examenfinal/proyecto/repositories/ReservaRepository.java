package com.examenfinal.proyecto.repositories;


import com.examenfinal.proyecto.models.Reserva;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva,Integer>{
    
    Reserva findById(int id);

}
