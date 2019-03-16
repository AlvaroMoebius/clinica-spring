package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Especialidad;
import io.moebius.clinica.modelos.Veterinario;
import io.moebius.clinica.servicios.EspecialidadServicio;
import io.moebius.clinica.servicios.VeterinarioServicio;

@Service
@Profile({"default", "mapa"})
public class VeterinarioServicioMap extends AbstractMapService<Veterinario, Long> implements VeterinarioServicio {

	private final EspecialidadServicio especialidadServicio;

	public VeterinarioServicioMap(EspecialidadServicio especialidadServicio) {
		this.especialidadServicio = especialidadServicio;
	}

	@Override
	public Veterinario findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Veterinario save(Veterinario veterinario) {
		if(veterinario.getEspecialidades().size() > 0) {
			veterinario.getEspecialidades().forEach(especialidad -> {
				if(especialidad.getId() == null) {
					Especialidad especialidadGuardada = especialidadServicio.save(especialidad);
					especialidad.setId(especialidadGuardada.getId());
				}
			});
		}
		
		
		
		return super.save(veterinario);
	}

	@Override
	public Set<Veterinario> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Veterinario object) {
		super.delete(object);
	}

}
