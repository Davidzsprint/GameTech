package com.example.HolaMundo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private int edad;
	
	public alumno (String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;	
	}	
	
	public alumno() {}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "alumno [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
