package com.example.HolaMundo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LigaRepository extends JpaRepository<Liga, Long>{
	
	Liga findByNombreLiga(String nombreLiga);
	
}
