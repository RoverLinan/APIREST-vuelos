package com.examenfinal.proyecto.services;

import java.util.List;

import com.examenfinal.proyecto.models.Pago;
import com.examenfinal.proyecto.models.Reserva;

public interface ReservaService {
    
    Reserva findById(int id);
    List<Reserva> findByPago(Pago pago);


}
