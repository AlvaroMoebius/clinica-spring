package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Especialidad;
import io.moebius.clinica.servicios.EspecialidadServicio;

@Service
public class EspecialidadServicioMapa extends AbstractMapService<Especialidad, Long> implements EspecialidadServicio {

	@Override
	public Especialidad findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Especialidad save(Especialidad especialidad) {
		
		return super.save(especialidad);
	}

	@Override
	public void delete(Especialidad especialidad) {
		super.delete(especialidad);
		
	}

	@Override
	public Set<Especialidad> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}
	
	

}
