package io.moebius.clinica.servicios.JPA;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Visita;
import io.moebius.clinica.repositorios.VisitaRepositorio;
import io.moebius.clinica.servicios.VisitaServicio;

@Service
@Profile("springJPA")
public class VisitaServicioJPA implements VisitaServicio{
	
	private final VisitaRepositorio visitaRepositorio;

	public VisitaServicioJPA(VisitaRepositorio visitaRepositorio) {
		this.visitaRepositorio = visitaRepositorio;
	}
	
	@Override
	public Set<Visita> findAll() {
		Set<Visita> visitas = new HashSet<>();
		visitaRepositorio.findAll().forEach(visitas::add);
		return visitas;
	}

	@Override
	public Visita findById(Long id) {
		return visitaRepositorio.findById(id).orElse(null);
	}

	@Override
	public Visita save(Visita visita) {
		return visitaRepositorio.save(visita);
	}

	@Override
	public void delete(Visita visita) {
		visitaRepositorio.delete(visita);
	}

	@Override
	public void deleteById(Long id) {
		visitaRepositorio.deleteById(id);
	}

}
