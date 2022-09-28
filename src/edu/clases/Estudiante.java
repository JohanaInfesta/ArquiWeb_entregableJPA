package edu.clases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estudiante {

	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private int edad;
	@Column
	private String genero;
	@Id
	private int dni;
	@Column
	private String ciudad;
	@OneToMany(mappedBy = "estudiante")
	private List <CarreraEstudiante>carreras;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int libretaUniversitaria;
	
	public Estudiante(String nombre, String apellido, int edad, String genero, int dni, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
		this.ciudad = ciudad;
		this.carreras = new ArrayList<>();
	}

//	public void addCarrera(Carrera c) {
//		if(!carreras.contains(c))
//			carreras.add(c);
//	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<CarreraEstudiante> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<CarreraEstudiante> carreras) {
		this.carreras = carreras;
	}

	public int getDni() {
		return dni;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", dni=" + dni + ", ciudad=" + ciudad + ", carreras=" + carreras + ", libretaUniversitaria="
				 + "]";
	}
	
	
	
}
