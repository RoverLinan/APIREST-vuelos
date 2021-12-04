package com.examenfinal.proyecto.services;

import java.util.List;

import com.examenfinal.proyecto.models.Pago;
import com.examenfinal.proyecto.models.Pasajero;


public interface PagoService {
    Pago findById(int id);
    List<Pago> findByPasajero(Pasajero pasajero);
    List<Pago> obtenerPagosIncompletoPorPasajero(Pasajero pasajero);
}
