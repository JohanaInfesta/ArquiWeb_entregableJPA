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
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
@Entity
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carreraID;
	
	@Column
	private String nombre;
	
 	@OneToMany(mappedBy = "carrera", fetch=FetchType.LAZY)
	private List<CarreraEstudiante>estudiantes;
 	@Column
 	private int duracionAnios;
 	
 		 	
	public Carrera() {
		super();
	}

	public Carrera(String nombre, int duracionAnios) { //int duracionAnios
		super();
		this.nombre = nombre;
		this.duracionAnios = duracionAnios;
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
	
	public int getDuracionAnios() {
		return duracionAnios;
	}

	public void setDuracionAnios(int duracionAnios) {
		this.duracionAnios = duracionAnios;
	}

	public List<CarreraEstudiante> getEstudiantes() {
		return estudiantes;
	}

	
	@Override
	public String toString() {
		return "Carrera [carreraID=" + carreraID + ", nombre=" + nombre + ", estudiantes=" + estudiantes
				+ ", duracionAnios=" + duracionAnios + "]";
	}

}
