package edu.clases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {
	@Id
	private int carreraID;
	@Column
	private String nombre;
 	@OneToMany(mappedBy = "carrera")
	private List<CarreraEstudiante>estudiantes;
 	
 	
 	
	public Carrera(int carreraID, String nombre) {
		super();
		this.carreraID = carreraID;
		this.nombre = nombre;
		this.estudiantes = new ArrayList<>();
	}
//	public void addEstudiante(Estudiante e) {
//		if(!estudiantes.contains(e))
//			estudiantes.add(e);
//	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_carrera() {
		return carreraID;
	}
	public List<CarreraEstudiante> getEstudiantes() {
		return estudiantes;
	}
 	
	
 	
}
