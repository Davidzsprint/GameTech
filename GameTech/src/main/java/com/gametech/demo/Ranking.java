package com.example.HolaMundo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ranking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany
	private List<Usuario> usuarios = new ArrayList<>();
	
	
	public Ranking () {}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void addUsuairo(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public void monstrarUsuariosRanking() {
		
		System.out.println("Lista de usuarios del Ranking");
		System.out.println("------------------------------");
		for(Usuario u : this.usuarios) {
			System.out.println(u.getAlias()+" ELO ["+u.getElo()+"]");
		}
	}
	
}
