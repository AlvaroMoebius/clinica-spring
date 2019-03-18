package io.moebius.clinica.modelos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "propietarios")
public class Propietario extends Persona {

	@Builder
	public Propietario(Long id, String nombre, String apellido, String direccion, String ciudad, String telefono,
			Set<Mascota> mascotas) {
		super(id, nombre, apellido);
		this.direccion = direccion;
		this.ciudad = ciudad;
		
		
	}

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "ciudad")
	private String ciudad;

	@Column(name = "telefono")
	private String telefono;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "propietario")
	private Set<Mascota> mascotas = new HashSet<>();

}
