package io.moebius.clinica.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.modelos.Veterinario;
import io.moebius.clinica.servicios.PropietarioServicio;
import io.moebius.clinica.servicios.VeterinarioServicio;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final PropietarioServicio propietarioServicio;
	private final VeterinarioServicio veterinarioServicio;
	
	// Injección de dependencia por constructor con Spring
	public DataLoader(PropietarioServicio propietarioServicio, VeterinarioServicio veterinarioServicio) {
		this.propietarioServicio = propietarioServicio;
		this.veterinarioServicio = veterinarioServicio;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		// Propietarios
		Propietario p1 = new Propietario();
		p1.setNombre("Álvaro");
		p1.setApellido("González");
		
		propietarioServicio.save(p1);
		
		
		Propietario p2 = new Propietario();
		p2.setNombre("Carlos");
		p2.setApellido("Ramírez");
		
		propietarioServicio.save(p2);
		
		
		Propietario p3 = new Propietario();
		p3.setNombre("Justo");
		p3.setApellido("Castaño");
		
		propietarioServicio.save(p3);
		
		
		Propietario p4 = new Propietario();
		p4.setNombre("Martina");
		p4.setApellido("Oliva");
		
		propietarioServicio.save(p4);
		
		System.out.println("[DATA LOADER] --INFO-- Cargados propietarios.");
		
		
		// Veterinarios
		Veterinario v1 = new Veterinario();
		v1.setNombre("Santiago");
		v1.setApellido("Carrillo");
		
		veterinarioServicio.save(v1);
		
		
		Veterinario v2 = new Veterinario();
		v2.setNombre("Lommie");
		v2.setApellido("Thorne");
		
		veterinarioServicio.save(v2);
		
		
		Veterinario v3 = new Veterinario();
		v3.setNombre("Franz");
		v3.setApellido("Ferdinand");
		
		veterinarioServicio.save(v3);
		
		
		Veterinario v4 = new Veterinario();
		v4.setNombre("José");
		v4.setApellido("Cuervo");
		
		veterinarioServicio.save(v4);
		
		System.out.println("[DATA LOADER] --INFO-- Cargados veterinarios.");
		
		
		// 
	}

}
