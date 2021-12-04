package com.examenfinal.proyecto.services.implement;

import java.util.ArrayList;
import java.util.List;

import com.examenfinal.proyecto.models.Pago;
import com.examenfinal.proyecto.models.Pasajero;
import com.examenfinal.proyecto.repositories.PagoRepository;
import com.examenfinal.proyecto.services.PagoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    PagoRepository pagoRepository;

    @Override
    public Pago findById(int id) {
       
        return null;
    }

    @Override
    public List<Pago> findByPasajero(Pasajero pasajero) {
        
        List<Pago> listaPagos = new ArrayList<>();

        listaPagos = pagoRepository.findByPasajero(pasajero);

        return listaPagos;
    }

    @Override
    public List<Pago> obtenerPagosIncompletoPorPasajero(Pasajero pasajero) {
        List<Pago> listaPagos = new ArrayList<>();
        List<Pago> listaPagosFiltrada = new ArrayList<>();

        listaPagos = pagoRepository.findByPasajero(pasajero);
        


        for (Pago pago : listaPagos) {
            if(!esPagoCompletado(pago)){
                listaPagosFiltrada.add(pago);
            }
        }

        return listaPagosFiltrada;
    }



    private boolean esPagoCompletado(Pago pago){
        if(pago.getMonto() == 0)
            return false;

        return true;
    }
    
}
