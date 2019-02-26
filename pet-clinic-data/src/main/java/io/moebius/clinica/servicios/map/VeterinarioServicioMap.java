package io.moebius.clinica.servicios.map;

import java.util.Set;

import io.moebius.clinica.modelos.Veterinario;
import io.moebius.clinica.servicios.VeterinarioServicio;

public class VeterinarioServicioMap extends AbstractMapService<Veterinario, Long> implements VeterinarioServicio {

	@Override
	public Veterinario findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Veterinario save(Veterinario veterinario) {
		return super.save(veterinario.getId(), veterinario);
	}

	@Override
	public Set<Veterinario> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Veterinario object) {
		super.delete(object);
	}
	
	

}
