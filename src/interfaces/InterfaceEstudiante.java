package interfaces;

import java.util.List;

import entities.Estudiante;

public interface InterfaceEstudiante {

	//c) recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple.
	public List<Estudiante>getEstudianteByCriterio(); // se puede generar una clase en criterios para ordenamiento ASC o DES
	//y se para por parametro
	
	//d) recuperar un estudiante, en base a su número de libreta universitaria.
	public Estudiante getEstudianteByLibreta(int libreta);
	
	//e) recuperar todos los estudiantes, en base a su género.
	public List<Estudiante>getAllEstudiantesByGenero();
	
	
}
