package com.example.HolaMundo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class asignatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombreAsignatura;
	private String dificultad;
	
	public asignatura (String nombre, String dificultad) {
		
		this.nombreAsignatura = nombre;
		this.dificultad = dificultad;
	}
	
	public asignatura() {}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "asignatura [id=" + id + ", nombreAsignatura=" + nombreAsignatura + ", dificultad=" + dificultad + "]";
	}
	
	
}
