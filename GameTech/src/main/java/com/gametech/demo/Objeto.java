package com.gametech.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Objeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String descripcion;
	private int ataque;
	private int defensa;
	private int vida;
	private int mana;
	
	
	
	public Objeto() {
		
	}

	public Objeto(String nombre, String descripcion, int ataque, int defensa, int vida, int mana) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ataque = ataque;
		this.defensa = defensa;
		this.vida = vida;
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
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", descripcion=" + descripcion + ", ataque=" + ataque
				+ ", defensa=" + defensa + ", vida=" + vida + ", mana=" + mana + "]";
	}

	
}
