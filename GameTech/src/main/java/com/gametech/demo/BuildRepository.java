package com.example.HolaMundo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildRepository extends JpaRepository<Build, Long>{
	
	List<Build> findByNombreBuild(String nombreBuild);
	
}
