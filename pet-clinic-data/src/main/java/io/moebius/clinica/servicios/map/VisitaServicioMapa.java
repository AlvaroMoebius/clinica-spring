package io.moebius.clinica.servicios.map;

import java.util.Set;

import io.moebius.clinica.modelos.Visita;
import io.moebius.clinica.servicios.VisitaServicio;

public class VisitaServicioMapa extends AbstractMapService<Visita, Long> implements VisitaServicio{
	
	@Override
	public Visita findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visita save(Visita visita) {
		
		return super.save(visita);
	}

	@Override
	public void delete(Visita visita) {
		super.delete(visita);
		
	}

	@Override
	public Set<Visita> findAll() {
		return super.findAll();
	}

	@Override
	
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

}
