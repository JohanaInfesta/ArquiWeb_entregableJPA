package interfaces;

import java.util.List;

import entities.Carrera;
import entities.Estudiante;

public interface InterfaceCarreraEstudiante {

	//b) matricular un estudiante en una carrera
	//
	public void matricularEstudiante(Estudiante e, Carrera c);
	
	//f) recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
	// carreraConInscriptosDTO
	public List<Carrera>getCarrerasOrder();
	
	//g) recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia.
	public List<Estudiante>getEstudiantesCarrera(String ciudad);
	/*
	 * 3) Generar un reporte de las carreras, que para cada carrera incluya información de los
		inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y presentar
		los años de manera cronológica.
	 */
	public List<Estudiante>generarReporteFinal();//ReporteDTO y no Estudiante
}
