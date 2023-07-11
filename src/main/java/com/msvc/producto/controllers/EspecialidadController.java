package com.msvc.producto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msvc.producto.entities.Especialidad;
import com.msvc.producto.services.EspecialidadService;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @PostMapping
    public ResponseEntity<Especialidad> guardarProducto(@RequestBody Especialidad especialidad){
        return ResponseEntity.status(HttpStatus.CREATED).body(especialidadService.create(especialidad));
    }

    @GetMapping
    public ResponseEntity<List<Especialidad>> listarProductos(){
        return ResponseEntity.ok(especialidadService.getEspecialidad());
    }

	/*
	 * @GetMapping("/ofertas/{ofertaId}") public ResponseEntity<List<Especialidad>>
	 * listarProductosPorOfertaId(@PathVariable String ofertaId){ return
	 * ResponseEntity.ok(especialidadService.getProductosByOfertaId(ofertaId)); }
	 */

    
}
