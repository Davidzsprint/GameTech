package com.example.HolaMundo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<alumno, Long>{
	
	List<alumno> findByNombre(String nombre);
	List<alumno> findByEdad(int edad);
}
