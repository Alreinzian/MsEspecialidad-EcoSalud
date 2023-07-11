package com.msvc.especialidad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.msvc.especialidad.entities.Especialidad;

import java.util.List;

public interface EspecialidadRepository extends MongoRepository<Especialidad,Long> {

    //List<Especialidad> findByOfertaId(String ofertaId);
    //List<Calificacion> findByHotelId(String hotelId);
}
