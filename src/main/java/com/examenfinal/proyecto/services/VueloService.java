package com.examenfinal.proyecto.services;

import com.examenfinal.proyecto.models.Reserva;
import com.examenfinal.proyecto.models.Vuelo;

public interface VueloService {
    
    Vuelo findByReserva(Reserva reserva);

}
