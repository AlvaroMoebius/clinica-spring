package io.moebius.clinica.servicios.JPA;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Mascota;
import io.moebius.clinica.repositorios.MascotaRepositorio;
import io.moebius.clinica.servicios.MascotaServicio;

@Service
@Profile("springJPA")
public class MascotaServicioJpa implements MascotaServicio{

	private final MascotaRepositorio mascotaRepositorio;
		
	public MascotaServicioJpa(MascotaRepositorio mascotaRepositorio) {
		this.mascotaRepositorio = mascotaRepositorio;
	}

	
	@Override
	public Set<Mascota> findAll() {
		Set<Mascota> mascotas = new HashSet<>();
		mascotaRepositorio.findAll().forEach(mascotas::add);
		return mascotas;
	}

	@Override
	public Mascota findById(Long id) {
		return mascotaRepositorio.findById(id).orElse(null);
	}

	@Override
	public Mascota save(Mascota mascota) {
		return mascotaRepositorio.save(mascota);
	}

	@Override
	public void delete(Mascota mascota) {
		mascotaRepositorio.delete(mascota);
	}

	@Override
	public void deleteById(Long id) {
		mascotaRepositorio.deleteById(id);
	}

}
