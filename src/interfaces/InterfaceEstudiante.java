package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import entities.Estudiante;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
public interface InterfaceEstudiante {
	/**
	 * c) recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple.
	 * @return Lista de estudiantes por orden asc 
	 */
	public List<Estudiante>getEstudianteByCriterio(); 

	/**
	 * d) recuperar un estudiante, en base a su número de libreta universitaria.
	 * @param id libreta
	 * @return Estudiante
	 */
	public Estudiante getEstudianteByLibreta(int libreta);

	/**
	 * e) recuperar todos los estudiantes, en base a su género.
	 * @param genero
	 * @returnlista de estudiante segun el genero
	 */
	public List<Estudiante>getAllEstudiantesByGenero(String genero);

	/**
	 * insercion de estudiantes mediante archivo csv
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void insertarListadoCSV() throws FileNotFoundException, IOException;

}
