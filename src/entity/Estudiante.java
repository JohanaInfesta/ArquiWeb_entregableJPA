package entity;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import criterios.Genero;

@Entity
public class Estudiante {
	
	@Column
	private int dni;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private int edad; //Long
	@Column
	private Genero genero;
	
	@Id
	@Column(name="libreta")
	@GeneratedValue(strategy=GenerationType.AUTO) //buscar solucion para este generador porque siempre es 0
	private int libretaUniversitaria; //Long
	@Column
	private String ciudad;
	@OneToMany(mappedBy = "estudiante", fetch=FetchType.LAZY)
	private List <CarreraEstudiante>carreras;
	
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido, int edad, Genero genero, int dni, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
		this.ciudad = ciudad;
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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Estudiante [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", genero=" + genero + ", libretaUniversitaria=" + libretaUniversitaria + ", ciudad=" + ciudad + "]";
	}

	
	
}
