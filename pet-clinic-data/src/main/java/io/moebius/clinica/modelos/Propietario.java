package io.moebius.clinica.modelos;

import java.util.Set;

public class Propietario extends Persona {
	
	private Set<Mascota> mascotas;

	
	
	
	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	
	
}
