package io.moebius.clinica.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.modelos.TipoMascota;
import io.moebius.clinica.modelos.Veterinario;
import io.moebius.clinica.servicios.PropietarioServicio;
import io.moebius.clinica.servicios.TipoMascotaServicio;
import io.moebius.clinica.servicios.VeterinarioServicio;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final PropietarioServicio propietarioServicio;
	private final VeterinarioServicio veterinarioServicio;
	private final TipoMascotaServicio tipoMascotaServicio;
	
	// Injección de dependencia por constructor con Spring
	public DataLoader(PropietarioServicio propietarioServicio, VeterinarioServicio veterinarioServicio, TipoMascotaServicio tipoMascotaServicio) {
		this.propietarioServicio = propietarioServicio;
		this.veterinarioServicio = veterinarioServicio;
		this.tipoMascotaServicio = tipoMascotaServicio;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		

		// Tipos de mascota
		TipoMascota gato = new TipoMascota();
		gato.setNombre("Gato");
		
		TipoMascota guardadoGatoTipoMascota = tipoMascotaServicio.save(gato);
		
		TipoMascota loro = new TipoMascota();
		gato.setNombre("Loro");
		
		TipoMascota guardadoLoroTipoMascota = tipoMascotaServicio.save(loro);
		
		
		TipoMascota perro = new TipoMascota();
		gato.setNombre("Perro");
		
		TipoMascota guardadoPerroTipoMascota = tipoMascotaServicio.save(perro);
		
		
		TipoMascota canguro = new TipoMascota();
		gato.setNombre("Canguro");
		
		TipoMascota guardadoCanguroTipoMascota = tipoMascotaServicio.save(canguro);
		
		System.out.println("[DATA LOADER] --INFO-- Cargados tipos de mascota.");
		
		
		
		// Propietarios
		Propietario p1 = new Propietario();
		p1.setNombre("Álvaro");
		p1.setApellido("González");
		p1.setDireccion("C/ Pinos");
		p1.setCiudad("Alcorcón");
		p1.setTelefono("666999666");
		
		propietarioServicio.save(p1);
		
		
		Propietario p2 = new Propietario();
		p2.setNombre("Carlos");
		p2.setApellido("Ramírez");
		p2.setDireccion("C/ Cuba");
		p2.setCiudad("Aluche");
		p2.setTelefono("321321321");
		
		propietarioServicio.save(p2);
		
		
		Propietario p3 = new Propietario();
		p3.setNombre("Justo");
		p3.setApellido("Castaño");
		p3.setDireccion("C/ Normandía");
		p3.setCiudad("Leganés");
		p3.setTelefono("111222333");
		
		propietarioServicio.save(p3);
		
		
		Propietario p4 = new Propietario();
		p4.setNombre("Martina");
		p4.setApellido("Oliva");
		p4.setDireccion("C/ Whitecastle");
		p4.setCiudad("Londres");
		p4.setTelefono("987654321");
		
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
