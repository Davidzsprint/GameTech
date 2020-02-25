package com.example.HolaMundo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroeRepository extends JpaRepository<Heroe, Long>{

	List<Heroe> findByNombre(String nombre);
	
	List<Heroe> findByPosicion(String posicion);
	
	List<Heroe> findByDificultad(String dificultad);
}
