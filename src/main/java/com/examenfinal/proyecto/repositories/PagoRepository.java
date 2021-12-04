package com.examenfinal.proyecto.repositories;



import com.examenfinal.proyecto.models.*;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface PagoRepository  extends CrudRepository<Pago,Integer>{
    
    Pago findById(int id);
    List<Pago> findByPasajero(Pasajero pasajero);
   


}
