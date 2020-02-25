package com.example.HolaMundo;

import java.util.*;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;

@CacheConfig(cacheNames = "GameTechAPP")
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	List<Usuario> findByAlias(String alias);
	
	List<Usuario> findByPais(String pais);
	
	List<Usuario> findByElo(int elo);
	
	List<Usuario> findByEmail(String email);
	
	List<Usuario> findByPaisOrderByEloDesc(String pais);
	 
}
