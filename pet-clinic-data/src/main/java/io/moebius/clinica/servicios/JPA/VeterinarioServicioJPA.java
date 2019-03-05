package io.moebius.clinica.servicios.JPA;

import java.util.Set;
import java.util.HashSet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Veterinario;
import io.moebius.clinica.repositorios.VeterinarioRepositorio;
import io.moebius.clinica.servicios.VeterinarioServicio;

@Service
@Profile("springJPA")
public class VeterinarioServicioJPA implements VeterinarioServicio{

	private final VeterinarioRepositorio veterinarioRepositorio;
	
	public VeterinarioServicioJPA(VeterinarioRepositorio veterinarioRepositorio) {
		this.veterinarioRepositorio = veterinarioRepositorio;
	}

	
	@Override
	public Set<Veterinario> findAll() {
		Set<Veterinario> veterinarios = new HashSet<>();
		veterinarioRepositorio.findAll().forEach(veterinarios::add);
		return veterinarios;
	}

	@Override
	public Veterinario findById(Long id) {
		return veterinarioRepositorio.findById(id).orElse(null);
	}

	@Override
	public Veterinario save(Veterinario veterinario) {
		return veterinarioRepositorio.save(veterinario);
	}

	@Override
	public void delete(Veterinario veterinario) {
		veterinarioRepositorio.delete(veterinario);
	}

	@Override
	public void deleteById(Long id) {
		veterinarioRepositorio.deleteById(id);
	}

}
