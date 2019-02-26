package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Mascota;
import io.moebius.clinica.servicios.MascotaServicio;

@Service
public class MascotaServicioMapa extends AbstractMapService<Mascota, Long> implements MascotaServicio{

	@Override
	public Mascota save(Mascota mascota) {
		return super.save(mascota);
	}

	@Override
	public Set<Mascota> findAll() {
		return super.findAll();
	}

	@Override
	public Mascota findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Mascota mascota) {
		super.delete(mascota);
	}

}
