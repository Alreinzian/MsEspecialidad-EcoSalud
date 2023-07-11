package com.msvc.especialidad.services;

import java.util.List;

import com.msvc.especialidad.entities.Especialidad;

public interface EspecialidadService {

    Especialidad create(Especialidad especialidad);

    List<Especialidad> getEspecialidad();

    //List<Especialidad> getProductosByOfertaId(String ofertaId);

    //List<Especialidad> getCalificacionesByHotelId(String hotelId);

}
