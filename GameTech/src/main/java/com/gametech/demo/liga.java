package com.example.GameTech;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	private List <Usuario> usuraios;
	
	
	public Liga() {}
	
	public Liga(String nombreLiga, List<Usuario> listaUsuarios) {
		
		this.nombreLiga = nombreLiga;
		
		//inicicializamos la lista
		usuraios = new ArrayList<Usuario>();
		
		for(Usuario usuario: listaUsuarios) {
			this.usuraios.add(usuario);
		}
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
	
	public void mostrarUsaruiosLiga() {
		
		System.out.println("Usaruios de la liga "+this.getNombreLiga());
		System.out.println("-----------------------------------------");
		for(Usuario u: this.usuraios) {
			System.out.println(u.getAlias());
		}
	}
	
}
