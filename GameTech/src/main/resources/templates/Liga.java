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
	
	@OneToMany
	private List <Usuario> usuraios = new ArrayList<>();
	
	
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

	public List<Usuario> getUsuraios() {
		return usuraios;
	}

	public void setUsuraios(List<Usuario> usuraios) {
		this.usuraios = usuraios;
	}

	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombreLiga=" + nombreLiga + ", usuraios=" + usuraios + "]";
	}
	
	
	public void addUsuarioLiga(Usuario u) {
		this.usuraios.add(u);
	}
	
	public void mostrarUsaruiosLiga() {
		for(Usuario u: this.usuraios) {
			System.out.println(u.getAlias());
		}
	}

}
