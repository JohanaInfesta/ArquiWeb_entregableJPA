package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carreraID; //Long en vez de int
	
	@Column
	private String nombre;
	
 	@OneToMany(mappedBy = "carrera", fetch=FetchType.LAZY)
	private List<CarreraEstudiante>estudiantes;
 	//@Column
 	//ptivate int duracionAnios
 	
	public Carrera() {
		super();
	}

	public Carrera(String nombre) { //int duracionAnios
		super();
		this.nombre = nombre;
		this.estudiantes = new ArrayList<>();
	}

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
 	
	//toString
 	
}
