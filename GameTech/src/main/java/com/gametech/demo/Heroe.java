package com.gametech.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Heroe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String descripcion;
	private String posicion;
	private int vida;
	private int ataque;
	private int defensa;
	private int mana;
	private int dificultad;
	
	
	public Heroe() {
		
	}
	
	
	public Heroe(long id, String nombre, String descripcion, String posicion, int vida, int ataque, int defensa,
			int mana) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.posicion = posicion;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.mana = mana;
	}



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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	@Override
	public String toString() {
		return "Heroe [nombre=" + nombre + ", descripcion=" + descripcion + ", posicion=" + posicion
				+ ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa + ", mana=" + mana + "]";
	}
	
	
	
}
