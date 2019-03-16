package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.TipoMascota;
import io.moebius.clinica.servicios.TipoMascotaServicio;

@Service
@Profile({"default", "mapa"})
public class TipoMascotaServicioMapa extends AbstractMapService<TipoMascota, Long> implements TipoMascotaServicio{

	@Override
	public TipoMascota save(TipoMascota tipoMascota) {
		return super.save(tipoMascota);
	}

	@Override
	public Set<TipoMascota> findAll() {
		return super.findAll();
	}

	@Override
	public TipoMascota findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(TipoMascota tipoMascota) {
		super.delete(tipoMascota);
	}
	
}
