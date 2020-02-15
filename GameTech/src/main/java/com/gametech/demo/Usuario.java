package com.gametech.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String alias;
	private String contraseña;
	private String liga;
	
	private boolean admin;
	
	//Opcional
	private String nombre;
	private String apellidos;
	private String direccion;
	private int edad;
	private String region;
	private String nacionalidad;
	
	
	
	public Usuario(String alias, String contraseña, String liga, boolean admin) {
		super();
		this.alias = alias;
		this.contraseña = contraseña;
		this.liga = liga;
		this.admin = admin;
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Usuario [alias=" + alias + ", liga=" + liga + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", edad=" + edad + ", region=" + region + ", nacionalidad="
				+ nacionalidad + "]";
	}
	
	
	
}
