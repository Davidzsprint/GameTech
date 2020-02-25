package com.example.HolaMundo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Build {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombreBuild;
	
	private String objeto1;
	private String objeto2;
	private String objeto3;
	private String objeto4;
	private String objeto5;
	private String objeto6;
	

	
	public Build() {}
	
	public Build(String nombre, String ob1, String ob2, String ob3, String ob4, String ob5, String ob6) {
		
		this.nombreBuild = nombre;
		this.objeto1 = esVacio(ob1);
		this.objeto2 = esVacio(ob2);
		this.objeto3 = esVacio(ob3);
		this.objeto4 = esVacio(ob4);
		this.objeto5 = esVacio(ob5);
		this.objeto6 = esVacio(ob6);
	}
	
	public String esVacio(String objeto) {
		
		if(objeto.equalsIgnoreCase("")) {
			return "Vacio";
		}
		else {
			return objeto;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreBuild() {
		return nombreBuild;
	}

	public void setNombreBuild(String nombreBuild) {
		this.nombreBuild = nombreBuild;
	}

	public String getObjeto1() {
		return objeto1;
	}

	public void setObjeto1(String objeto1) {
		this.objeto1 = objeto1;
	}

	public String getObjeto2() {
		return objeto2;
	}

	public void setObjeto2(String objeto2) {
		this.objeto2 = objeto2;
	}

	public String getObjeto3() {
		return objeto3;
	}

	public void setObjeto3(String objeto3) {
		this.objeto3 = objeto3;
	}

	public String getObjeto4() {
		return objeto4;
	}

	public void setObjeto4(String objeto4) {
		this.objeto4 = objeto4;
	}

	public String getObjeto5() {
		return objeto5;
	}

	public void setObjeto5(String objeto5) {
		this.objeto5 = objeto5;
	}

	public String getObjeto6() {
		return objeto6;
	}

	public void setObjeto6(String objeto6) {
		this.objeto6 = objeto6;
	}

	@Override
	public String toString() {
		return "Build [id=" + id + ", nombreBuild=" + nombreBuild + ", objeto1=" + objeto1 + ", objeto2=" + objeto2
				+ ", objeto3=" + objeto3 + ", objeto4=" + objeto4 + ", objeto5=" + objeto5 + ", objeto6=" + objeto6
				+ "]";
	}	

}
