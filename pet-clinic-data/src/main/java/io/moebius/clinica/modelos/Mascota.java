package io.moebius.clinica.modelos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
