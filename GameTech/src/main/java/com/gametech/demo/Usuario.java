package com.example.HolaMundo;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String alias;
	private String contrasena;
	private String pais;
	private String servidor;
	private String email;
	private int elo;
	
	@ManyToOne
	private Liga liga;
	
	@OneToMany
	private List<Build> builds = new ArrayList<>();
	

	
	public Usuario() {}
	
	public Usuario(String alias, String contra, String pais, String servidor, String email) {

		this.alias = alias;
		this.contrasena = contra;
		this.pais = pais;
		this.servidor = servidor;
		this.email = email;
		
		int n = (int) (Math.random()*(100-200+1)+200); //generamos un elo aleatorio entre 100 y 200
		this.elo = n;
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getElo() {
		return elo;
	}

	public void setElo(int elo) {
		this.elo = elo;
	}

	public List<Build> getBuilds() {
		return builds;
	}

	public void setBuilds(List<Build> builds) {
		this.builds = builds;
	}
	
	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", alias=" + alias + ", contrasena=" + contrasena + ", pais=" + pais
				+ ", servidor=" + servidor + ", email=" + email + ", elo=" + elo + ", builds=" + builds + ", liga="
				+ liga + "]";
	}

	//Para monstar las Builds
	public void recorrerBuilds() {
		System.out.println("BUILDS\n-----------------");
		for(Build b: this.builds) {
			System.out.println(b.toString());
		}
		System.out.println("");
	}
	

	
}
