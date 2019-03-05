package io.moebius.clinica.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_mascota")
public class TipoMascota extends EntidadBase {

	@Column(name = "nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
