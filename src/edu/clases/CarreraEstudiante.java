package edu.clases;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class CarreraEstudiante {
	
	@Id
	private int id;
	@MapsId("carreraID")
	@ManyToOne
	private Carrera carrera;
	
	@ManyToOne
	private Estudiante estudiante;
	
	@Column
 	private LocalDate inscripcion;
	@Column(nullable = true)
	private Date graduado;
	
	
	public CarreraEstudiante(LocalDate inscripcion, Date graduado) {
		super();
		this.inscripcion = inscripcion;
		this.graduado = graduado;
	}

	public LocalDate getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(LocalDate inscripcion) {
		this.inscripcion = inscripcion;
	}

	public Date getGraduado() {
		return graduado;
	}

	public void setGraduado(Date graduado) {
		this.graduado = graduado;
	}
	
	
	
}
