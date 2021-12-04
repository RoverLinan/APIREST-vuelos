package com.examenfinal.proyecto.services.implement;

import java.util.List;

import com.examenfinal.proyecto.models.Pasajero;
import com.examenfinal.proyecto.repositories.PasajeroRespository;
import com.examenfinal.proyecto.services.PasajeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasajeroServiceImpl implements PasajeroService{

    @Autowired
    PasajeroRespository pasajeroRespository;




    @Override
    public Pasajero findById(int id) {
        
        return pasajeroRespository.findById(id);
    }

    @Override
    public List<Pasajero> findAll() {
        
        return pasajeroRespository.findAll();
    }
    
}
