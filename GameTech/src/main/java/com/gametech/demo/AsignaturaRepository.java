package com.example.HolaMundo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository extends JpaRepository<asignatura, Long>{
	
	List<asignatura> findByNombreAsignatura(String nombreAsignatura);
	List<asignatura> findByDificultad(String dificultad);
}
