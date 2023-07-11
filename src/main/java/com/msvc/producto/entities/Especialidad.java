package com.msvc.producto.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("especialidad")
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)

public class Especialidad {
	
	@Id
	private String especialidadId;
   
    private String nombreEspecialidad;
    
    private String descripcion;
    
    private String imagen;
 

}
