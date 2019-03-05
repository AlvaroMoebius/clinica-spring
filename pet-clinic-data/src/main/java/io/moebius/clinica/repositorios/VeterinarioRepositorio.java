package io.moebius.clinica.repositorios;

import org.springframework.data.repository.CrudRepository;

import io.moebius.clinica.modelos.Veterinario;

public interface VeterinarioRepositorio extends CrudRepository<Veterinario, Long> {

}
