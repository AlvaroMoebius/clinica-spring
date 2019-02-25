package io.moebius.clinica.servicios.map;

import java.util.Set;

import io.moebius.clinica.modelos.Mascota;
import io.moebius.clinica.servicios.CrudService;

public class MascotaServicioMapa extends AbstractMapService<Mascota, Long> implements CrudService<Mascota, Long>{

	@Override
	public Mascota save(Mascota mascota) {
		return super.save(mascota.getId(), mascota);
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
