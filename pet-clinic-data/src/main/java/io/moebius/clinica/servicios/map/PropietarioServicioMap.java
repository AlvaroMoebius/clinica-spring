package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Mascota;
import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.servicios.MascotaServicio;
import io.moebius.clinica.servicios.PropietarioServicio;
import io.moebius.clinica.servicios.TipoMascotaServicio;

@Service
public class PropietarioServicioMap extends AbstractMapService<Propietario, Long> implements PropietarioServicio{

	private final TipoMascotaServicio tipoMascotaServicio;
	private final MascotaServicio mascotaServicio;

	// Constructor para la injección en Spring
	public PropietarioServicioMap(TipoMascotaServicio tipoMascotaServicio, MascotaServicio mascotaServicio) {
		this.tipoMascotaServicio = tipoMascotaServicio;
		this.mascotaServicio = mascotaServicio;
	}
	

	@Override
	public Propietario save(Propietario propietario) {
		
		Propietario propietarioGuardado = null;
		
		if (propietario != null) {
			if(propietario.getMascotas() != null) {
				propietario.getMascotas().forEach(mascota -> {
					if(mascota.getTipoMascota() != null) {
						if(mascota.getTipoMascota().getId() == null) {
							mascota.setTipoMascota(tipoMascotaServicio.save(mascota.getTipoMascota()));
						}
						
					} else {
						throw new RuntimeException("Pet Type is required.");
					}
					
					if(mascota.getId() == null) {
						Mascota mascotaGuardada = mascotaServicio.save(mascota);
						mascota.setId(mascotaGuardada.getId());
					}
				});
			}
			
			return super.save(propietario);
		} else {
			return null;
		}
		
		
	}

	@Override
	public Set<Propietario> findAll() {
		return super.findAll();
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

	@Override
	public Propietario findByApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	



}
