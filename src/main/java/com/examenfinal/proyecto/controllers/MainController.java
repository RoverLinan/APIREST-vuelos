package com.examenfinal.proyecto.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.examenfinal.proyecto.models.Pasajero;
import com.examenfinal.proyecto.models.PasajeroResponse;
import com.examenfinal.proyecto.services.PagoService;
import com.examenfinal.proyecto.services.PasajeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pasajeros")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    PasajeroService pasajeroService;
    PagoService pagoService;


    @Autowired
    public MainController( PasajeroService pasajeroService, PagoService pagoService){

        this.pasajeroService = pasajeroService;
        this.pagoService = pagoService;

    }



    @GetMapping
    public ResponseEntity<List<PasajeroResponse>> obtenerPasajerosPorMayorReservas(){

        List<Pasajero> listaPasajeros = pasajeroService.findAll();
        List<PasajeroResponse> listaTresPasajeros = new ArrayList<PasajeroResponse>();


        listaPasajeros.forEach( pasajero ->  pasajero.setListaPagos(pagoService.obtenerPagosIncompletoPorPasajero(pasajero)));

        
        Collections.sort(listaPasajeros, new Comparator<Pasajero>() {

            @Override
            public int compare(Pasajero o1, Pasajero o2) {
                
                return Integer.valueOf(o2.getListaPagos().size()).compareTo(o1.getListaPagos().size());
            }
            
        });

        if(listaPasajeros.size() > 3 ){

            listaTresPasajeros.add(0,  new PasajeroResponse(listaPasajeros.get(0)));
        
            listaTresPasajeros.add(1,  new PasajeroResponse(listaPasajeros.get(1)));
            
            listaTresPasajeros.add(2,  new PasajeroResponse(listaPasajeros.get(2)));
            
        }
      


        if(listaTresPasajeros.size() > 0 )
            return  new ResponseEntity<>(listaTresPasajeros, HttpStatus.OK);
        else
            return  new ResponseEntity<>(listaTresPasajeros, HttpStatus.BAD_REQUEST);

    }


    


    
}
