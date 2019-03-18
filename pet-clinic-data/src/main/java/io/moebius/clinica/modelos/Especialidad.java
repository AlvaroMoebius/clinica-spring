package io.moebius.clinica.modelos;


import javax.persistence.Column;
import javax.persistence.Entity;
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
@Builder
@Entity
@Table(name = "especialidades")
public class Especialidad extends EntidadBase{
	
	@Column(name = "descripcion")
	private String descripcion;

}
