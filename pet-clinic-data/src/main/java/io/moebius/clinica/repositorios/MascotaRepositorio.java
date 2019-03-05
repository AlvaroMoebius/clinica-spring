package io.moebius.clinica.repositorios;

import org.springframework.data.repository.CrudRepository;

import io.moebius.clinica.modelos.Mascota;

public interface MascotaRepositorio extends CrudRepository<Mascota, Long> {

}
