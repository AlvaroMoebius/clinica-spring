package io.moebius.clinica.servicios.JPA;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Especialidad;
import io.moebius.clinica.repositorios.EspecialidadRepositorio;
import io.moebius.clinica.servicios.EspecialidadServicio;

@Service
@Profile("springJPA")
public class EspecialidadServicioJpa implements EspecialidadServicio{
	
	private final EspecialidadRepositorio especialidadRepositorio;

	public EspecialidadServicioJpa(EspecialidadRepositorio especialidadRepositorio) {
		this.especialidadRepositorio = especialidadRepositorio;
	}

	@Override
	public Set<Especialidad> findAll() {
		Set<Especialidad> especialidades = new HashSet<>();
		especialidadRepositorio.findAll().forEach(especialidades::add);
		return especialidades;
	}

	@Override
	public Especialidad findById(Long id) {
		return especialidadRepositorio.findById(id).orElse(null);
	}

	@Override
	public Especialidad save(Especialidad especialidad) {
		return especialidadRepositorio.save(especialidad);
	}

	@Override
	public void delete(Especialidad especialidad) {
		especialidadRepositorio.delete(especialidad);
	}

	@Override
	public void deleteById(Long id) {
		especialidadRepositorio.deleteById(id);
	}
	
	

}
