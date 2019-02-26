package io.moebius.clinica.servicios.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import io.moebius.clinica.modelos.EntidadBase;

public abstract class AbstractMapService <T extends EntidadBase, ID extends Long>{
	
	
	protected Map<Long, T> map = new HashMap<>();
	
	// Encontrar todos
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	// Encontrar por ID
	T findById(ID id) {
		return map.get(id);
	}
	
	// Guardar
	T save(T object) {
		
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextId());
			}	
			map.put(object.getId(), object);
		} else {
			throw new RuntimeException("El objeto no puede ser nulo");
		}
		

		return object;
	}
	
	// Borrado por ID
	void deleteById(ID id) {
		map.remove(id);
	}

	// Borrado por objeto
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private long getNextId() {
		
		Long nextId = null;
		
		try {
			nextId = Collections.max(map.keySet()) +1;
		} catch (NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}
}
