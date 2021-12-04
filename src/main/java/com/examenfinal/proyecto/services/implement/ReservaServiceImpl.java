
package com.examenfinal.proyecto.services.implement;
import java.util.List;

import com.examenfinal.proyecto.models.Pago;
import com.examenfinal.proyecto.models.Reserva;
import com.examenfinal.proyecto.repositories.ReservaRepository;
import com.examenfinal.proyecto.services.ReservaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl  implements ReservaService{

    @Autowired
    ReservaRepository reservaRepository;

    @Override
    public Reserva findById(int id) {
    
        return reservaRepository.findById(id);
    }

    @Override
    public List<Reserva> findByPago(Pago pago) {

        return null;
    }



    
}
