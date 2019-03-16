package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Visita;
import io.moebius.clinica.servicios.VisitaServicio;

@Service
@Profile({"default", "mapa"})
public class VisitaServicioMapa extends AbstractMapService<Visita, Long> implements VisitaServicio{
	
	@Override
	public Visita findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visita save(Visita visita) {
		
		if(visita.getMascota() == null || visita.getMascota().getPropietario() == null
				|| visita.getMascota().getId() == null || visita.getMascota().getPropietario().getId() == null) {
			throw new RuntimeException("Visita no valida.");
		}
		
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
