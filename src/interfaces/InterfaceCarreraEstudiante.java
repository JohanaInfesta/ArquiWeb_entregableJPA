package interfaces;

import java.util.List;

import entities.Carrera;
import entities.Estudiante;
import entities.dto.carreraDTO;
import entities.dto.reporteDTO;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
public interface InterfaceCarreraEstudiante{

	/**
	 *  b) matricular un estudiante en una carrera
	 * @param e Estudiante
	 * @param c Carreta
	 */
	public void matricularEstudiante(Estudiante e, Carrera c);
	
	/**
	 * f) recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
	 * @return lista de carreras en orden DESC
	 */
	public List<carreraDTO>getCarrerasOrder();
	
	/**
	 * g) recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia.
	 * @param c Carrera
	 * @param ciudad
	 * @return estudiantes de una carrera especifica y ciudad
	 */
	public List<Estudiante>getEstudiantesCarrera(Carrera c, String ciudad);
	
	/**
	 * 3) Generar un reporte de las carreras, que para cada carrera incluya información de los
		inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y presentar
		los años de manera cronológica.
	 * @return Lista de Carreras ordenadas alfabeticamente y años de manera cronologica
	 */
	public List<reporteDTO>generarReporteFinal();//ReporteDTO y no Estudiante
}
