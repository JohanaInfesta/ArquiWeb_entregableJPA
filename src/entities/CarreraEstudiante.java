package entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
@Entity
@Table(name="carrera_estudiante")
public class CarreraEstudiante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="fk_carrera", referencedColumnName="carreraID")
	private Carrera carrera;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="fk_estudiante", referencedColumnName="libreta")
	private Estudiante estudiante;
	
	@Column
 	private LocalDate inscripcion;
	@Column(nullable = true)
	private Date graduado;
	
	
	public CarreraEstudiante(Carrera carrera, Estudiante estudiante, LocalDate inscripcion, Date graduado) {//int antiguedad
		super();
		this.carrera = carrera;
		this.estudiante = estudiante;
		this.inscripcion = inscripcion;
		this.graduado = graduado;
	}

	public int getId() {
		return id;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public LocalDate getInscripcion() {
		return inscripcion;
	}

	public Date getGraduado() {
		return graduado;
	}

	
	
	
	
	//toString
		
	
}
