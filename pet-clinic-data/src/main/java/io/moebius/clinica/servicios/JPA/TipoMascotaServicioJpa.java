package io.moebius.clinica.servicios.JPA;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.TipoMascota;
import io.moebius.clinica.repositorios.TipoMascotaRepositorio;
import io.moebius.clinica.servicios.TipoMascotaServicio;

@Service
@Profile("springJPA")
public class TipoMascotaServicioJpa implements TipoMascotaServicio{

	private final TipoMascotaRepositorio tipoMascotaRepositorio;
	
	public TipoMascotaServicioJpa(TipoMascotaRepositorio tipoMascotaRepositorio) {
		this.tipoMascotaRepositorio = tipoMascotaRepositorio;
	}

	@Override
	public Set<TipoMascota> findAll() {
		Set<TipoMascota> mascotas = new HashSet<>();
		tipoMascotaRepositorio.findAll().forEach(mascotas::add);
		return mascotas;
	}

	@Override
	public TipoMascota findById(Long id) {
		return tipoMascotaRepositorio.findById(id).orElse(null);
	}

	@Override
	public TipoMascota save(TipoMascota tipoMascota) {
		return tipoMascotaRepositorio.save(tipoMascota);
	}

	@Override
	public void delete(TipoMascota tipoMascota) {
		tipoMascotaRepositorio.delete(tipoMascota);
	}

	@Override
	public void deleteById(Long id) {
		tipoMascotaRepositorio.deleteById(id);
	}

	
}
