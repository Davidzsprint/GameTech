package com.example.HolaMundo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Liga {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombreLiga;

	@OneToMany(mappedBy="liga")
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Liga() {}
	
	public Liga(String nombreLiga) {

		this.nombreLiga = nombreLiga;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreLiga() {
		return nombreLiga;
	}

	public void setNombreLiga(String nombreLiga) {
		this.nombreLiga = nombreLiga;
	}
	

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombreLiga=" + nombreLiga;
	}

	public void addUsuarioLiga(Usuario u) {
		this.usuarios.add(u);
	}

	public void mostrarUsaruiosLiga() {
		for (Usuario u : this.usuarios) {
			System.out.println(u.getAlias());
		}
	}
	
}
