package io.moebius.clinica.servicios.JPA;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.repositorios.MascotaRepositorio;
import io.moebius.clinica.repositorios.PropietarioRepositorio;
import io.moebius.clinica.repositorios.TipoMascotaRepositorio;
import io.moebius.clinica.servicios.PropietarioServicio;

@Service
@Profile("springJPA")
public class PropietarioServicioJpa implements PropietarioServicio{

	private final PropietarioRepositorio propietarioRepositorio;
	private final MascotaRepositorio mascotaRepositorio;
	private final TipoMascotaRepositorio tipoMascotaRepositorio;
	
	public PropietarioServicioJpa(PropietarioRepositorio propietarioRepositorio, MascotaRepositorio mascotaRepositorio, TipoMascotaRepositorio tipoMascotaRepositorio) {
		this.propietarioRepositorio = propietarioRepositorio;
		this.mascotaRepositorio = mascotaRepositorio;
		this.tipoMascotaRepositorio = tipoMascotaRepositorio;
	}

	@Override
	public Set<Propietario> findAll() {
		Set<Propietario> propietarios = new HashSet<>();
		propietarioRepositorio.findAll().forEach(propietarios::add);
		return propietarios;
	}

	@Override
	public Propietario findById(Long id) {
		return propietarioRepositorio.findById(id).orElse(null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Propietario save(Propietario propietario) {
		return propietarioRepositorio.save(propietario);
	}

	@Override
	public void delete(Propietario propietario) {
		propietarioRepositorio.delete(propietario);
		
	}

	@Override
	public void deleteById(Long id) {
		propietarioRepositorio.deleteById(id);
		
	}

	@Override
	public Optional<Propietario> findByApellido(String apellido) {
		return propietarioRepositorio.findByApellido(apellido);
	}

}
