package io.moebius.clinica.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "especialidades")
public class Especialidad extends EntidadBase{
	
	@Column(name = "descripcion")
	private String descripcion;

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
