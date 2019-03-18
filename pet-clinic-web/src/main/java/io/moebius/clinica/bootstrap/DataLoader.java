package io.moebius.clinica.bootstrap;

import java.time.LocalDate;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.moebius.clinica.modelos.Especialidad;
import io.moebius.clinica.modelos.Mascota;
import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.modelos.TipoMascota;
import io.moebius.clinica.modelos.Veterinario;
import io.moebius.clinica.modelos.Visita;
import io.moebius.clinica.servicios.EspecialidadServicio;
import io.moebius.clinica.servicios.PropietarioServicio;
import io.moebius.clinica.servicios.TipoMascotaServicio;
import io.moebius.clinica.servicios.VeterinarioServicio;
import io.moebius.clinica.servicios.VisitaServicio;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final PropietarioServicio propietarioServicio;
	private final VeterinarioServicio veterinarioServicio;
	private final TipoMascotaServicio tipoMascotaServicio;
	private final EspecialidadServicio especialidadServicio;
	private final VisitaServicio visitaServicio;
	
	// Injección de dependencia por constructor con Spring
	public DataLoader(PropietarioServicio propietarioServicio, VeterinarioServicio veterinarioServicio, TipoMascotaServicio tipoMascotaServicio, EspecialidadServicio especialidadServicio, VisitaServicio visitaServicio) {
		this.propietarioServicio = propietarioServicio;
		this.veterinarioServicio = veterinarioServicio;
		this.tipoMascotaServicio = tipoMascotaServicio;
		this.especialidadServicio = especialidadServicio;
		this.visitaServicio = visitaServicio;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		int contador = tipoMascotaServicio.findAll().size();
		
		// Inicialización de los datos
		if(contador ==0) { loadData(); }
		
		
	}

	
	// Cargador de datos
	private void loadData() {
		
		// Especialidades
		Especialidad radiologia = new Especialidad();
		radiologia.setDescripcion("radiología");
		Especialidad guardadaRadiologia = especialidadServicio.save(radiologia);
		
		Especialidad cirugia = new Especialidad();
		cirugia.setDescripcion("cirugía");
		Especialidad guardadaCirugia = especialidadServicio.save(cirugia);
		
		Especialidad alimentacion = new Especialidad();
		alimentacion.setDescripcion("alimentación");
		Especialidad guardadaAlimentacion = especialidadServicio.save(alimentacion);
		
		Especialidad odontologia = new Especialidad();
		odontologia.setDescripcion("odontología");
		Especialidad guardadaOdontologia = especialidadServicio.save(odontologia);
		
		System.out.println("[DATA LOADER] --INFO-- Cargadas especialidades.");
		

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
				
		Mascota m1 = new Mascota();
		m1.setTipoMascota(guardadoGatoTipoMascota);
		m1.setPropietario(p1);
		m1.setNombre("Kafka");
		m1.setFechaNacimiento(LocalDate.now());	
		p1.getMascotas().add(m1);
		
		Mascota m2 = new Mascota();
		m2.setTipoMascota(guardadoCanguroTipoMascota);
		m2.setPropietario(p1);
		m2.setNombre("Roger");
		m2.setFechaNacimiento(LocalDate.now());	
		p1.getMascotas().add(m2);
		
		propietarioServicio.save(p1);
		
		
		Propietario p2 = new Propietario();
		p2.setNombre("Carlos");
		p2.setApellido("Ramírez");
		p2.setDireccion("C/ Cuba");
		p2.setCiudad("Aluche");
		p2.setTelefono("321321321");
		
		Mascota m3 = new Mascota();
		m3.setTipoMascota(guardadoLoroTipoMascota);
		m3.setPropietario(p2);
		m3.setNombre("Euclides");
		m3.setFechaNacimiento(LocalDate.now());	
		p2.getMascotas().add(m3);
		
		propietarioServicio.save(p2);
		
		
		Propietario p3 = new Propietario();
		p3.setNombre("Justo");
		p3.setApellido("Castaño");
		p3.setDireccion("C/ Normandía");
		p3.setCiudad("Leganés");
		p3.setTelefono("111222333");

		Mascota m4 = new Mascota();
		m4.setTipoMascota(guardadoPerroTipoMascota);
		m4.setPropietario(p3);
		m4.setNombre("Toby");
		m4.setFechaNacimiento(LocalDate.now());	
		p3.getMascotas().add(m4);
		
		propietarioServicio.save(p3);
		
		
		Propietario p4 = new Propietario();
		p4.setNombre("Martina");
		p4.setApellido("Oliva");
		p4.setDireccion("C/ Whitecastle");
		p4.setCiudad("Londres");
		p4.setTelefono("987654321");
		
		Mascota m5 = new Mascota();
		m5.setTipoMascota(guardadoGatoTipoMascota);
		m5.setPropietario(p4);
		m5.setNombre("Bigotes");
		m5.setFechaNacimiento(LocalDate.now());	
		p4.getMascotas().add(m5);

		
		propietarioServicio.save(p4);
		
		System.out.println("[DATA LOADER] --INFO-- Cargados propietarios.");
		
		//Visitas
		Visita gatoVisita = new Visita();
		gatoVisita.setMascota(m5);
		gatoVisita.setFecha(LocalDate.now());
		gatoVisita.setDescripcion("Recortarle las uñitas.");
		
		visitaServicio.save(gatoVisita);
		
		System.out.println("[DATA LOADER] --INFO-- Cargadas visitas.");
		
		// Veterinarios
		Veterinario v1 = new Veterinario();
		v1.setNombre("Santiago");
		v1.setApellido("Carrillo");
		v1.getEspecialidades().add(guardadaAlimentacion);
		
		veterinarioServicio.save(v1);
		
		
		Veterinario v2 = new Veterinario();
		v2.setNombre("Lommie");
		v2.setApellido("Thorne");
		v2.getEspecialidades().add(guardadaOdontologia);
		
		veterinarioServicio.save(v2);
		
		
		Veterinario v3 = new Veterinario();
		v3.setNombre("Franz");
		v3.setApellido("Ferdinand");
		v3.getEspecialidades().add(guardadaCirugia);
		
		veterinarioServicio.save(v3);
		
		
		Veterinario v4 = new Veterinario();
		v4.setNombre("José");
		v4.setApellido("Cuervo");
		v4.getEspecialidades().add(guardadaRadiologia);
		
		veterinarioServicio.save(v4);
		
		System.out.println("[DATA LOADER] --INFO-- Cargados veterinarios.");
	}

}
