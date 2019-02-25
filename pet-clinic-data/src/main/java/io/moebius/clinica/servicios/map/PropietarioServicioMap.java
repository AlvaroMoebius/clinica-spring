package io.moebius.clinica.servicios.map;

import java.util.Set;

import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.servicios.CrudService;

public class PropietarioServicioMap extends AbstractMapService<Propietario, Long> implements CrudService<Propietario, Long>{

	@Override
	public Propietario save(Propietario propietario) {
		return super.save(propietario.getId(), propietario);
	}

	@Override
	public Set<Propietario> findAll() {
		return this.findAll();
	}

	@Override
	public Propietario findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Propietario propietario) {
		super.delete(propietario);
	}
	
	



}
