package com.msvc.producto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.msvc.producto.entities.Especialidad;

import java.util.List;

public interface EspecialidadRepository extends MongoRepository<Especialidad,Long> {

    //List<Especialidad> findByOfertaId(String ofertaId);
    //List<Calificacion> findByHotelId(String hotelId);
}
