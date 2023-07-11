package com.msvc.producto.services;

import java.util.List;

import com.msvc.producto.entities.Especialidad;

public interface EspecialidadService {

    Especialidad create(Especialidad especialidad);

    List<Especialidad> getEspecialidad();

    //List<Especialidad> getProductosByOfertaId(String ofertaId);

    //List<Especialidad> getCalificacionesByHotelId(String hotelId);

}
