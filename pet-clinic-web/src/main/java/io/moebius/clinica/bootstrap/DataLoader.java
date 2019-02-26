package io.moebius.clinica.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.moebius.clinica.servicios.PropietarioServicio;
import io.moebius.clinica.servicios.VeterinarioServicio;
import io.moebius.clinica.servicios.map.PropietarioServicioMap;
import io.moebius.clinica.servicios.map.VeterinarioServicioMap;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final PropietarioServicio propietarioServicio;
	private final VeterinarioServicio veterinarioServicio;
	
	
	public DataLoader() {
		this.propietarioServicio = new PropietarioServicioMap();
		this.veterinarioServicio = new VeterinarioServicioMap();
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
