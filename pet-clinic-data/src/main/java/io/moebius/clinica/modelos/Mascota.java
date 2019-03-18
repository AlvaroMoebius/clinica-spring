package io.moebius.clinica.modelos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Builder
@Entity
@Table(name = "mascotas")
public class Mascota extends EntidadBase{

	@Column (name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "tipo_mascota_id")
    private TipoMascota tipoMascota;
    
    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;
    
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mascota")
    private Set<Visita> visitas = new HashSet<>();

}
