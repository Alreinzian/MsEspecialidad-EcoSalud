package com.msvc.especialidad.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msvc.especialidad.entities.Especialidad;
import com.msvc.especialidad.repository.EspecialidadRepository;
import com.msvc.especialidad.services.EspecialidadService;

import java.util.List;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public Especialidad create(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public List<Especialidad> getEspecialidad() {
        return especialidadRepository.findAll();
    }

	

	/*
	 * @Override public List<Especialidad> getProductosByOfertaId(String ofertaId) {
	 * // TODO Auto-generated method stub return
	 * especialidadRepository.findByOfertaId(ofertaId); }
	 */

  
	

	
}
