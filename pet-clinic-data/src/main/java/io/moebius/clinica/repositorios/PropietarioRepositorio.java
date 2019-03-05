package io.moebius.clinica.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import io.moebius.clinica.modelos.Propietario;

public interface PropietarioRepositorio extends CrudRepository<Propietario, Long>{

	public Optional<Propietario> findByApellido(String apellido);
}
