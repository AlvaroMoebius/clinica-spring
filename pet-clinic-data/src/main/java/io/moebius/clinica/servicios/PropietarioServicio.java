package io.moebius.clinica.servicios;

import io.moebius.clinica.modelos.Propietario;

public interface PropietarioServicio extends CrudService<Propietario, Long> {

    Propietario findByApellido(String apellido);

}
