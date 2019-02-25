package io.moebius.clinica.servicios.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService <T, ID>{
	
	
	protected Map<ID, T> map = new HashMap<>();
	
	// Encontrar todos
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	// Encontrar por ID
	T findById(ID id) {
		return map.get(id);
	}
	
	// Guardar
	T save(ID id, T object) {
		map.put(id, object);
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
}
