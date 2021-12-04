package com.examenfinal.proyecto.services;

import com.examenfinal.proyecto.models.Pais;
import com.examenfinal.proyecto.models.Vuelo;

public interface PaisService {
    
    Pais findBy(Vuelo vuelo);
}
