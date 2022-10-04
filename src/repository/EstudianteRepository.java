package repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Estudiante;
import interfaces.InterfaceEstudiante;


//al extender de repository puedo usar los metodos add y close
public class EstudianteRepository extends Repository<Estudiante> implements InterfaceEstudiante{

	private EntityManager em;

	public EstudianteRepository(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<Estudiante> getEstudianteByCriterio() {
		
//		Query query = em.createcreateQuery("SELECT e FROM estudiante e ORDER BY e.apellido ASC", Estudiante.class);
		
		String jpql = "SELECT * FROM estudiante e ORDER BY e.apellido ASC";
		Query query = em.createNativeQuery(jpql, Estudiante.class);
		
		@SuppressWarnings("unchecked")
		List<Estudiante> resultado = query.getResultList();
		resultado.forEach(p -> System.out.println(p));
		return resultado;
	}

	@Override
	public Estudiante getEstudianteByLibreta(int libreta) {
		return em.find(Estudiante.class, libreta);
	}

	@Override
	public List<Estudiante> getAllEstudiantesByGenero(String genero) {
		String jpql = "SELECT * FROM estudiante e WHERE e.genero =?1";
		Query query = em.createNativeQuery(jpql, Estudiante.class);
		query.setParameter(1, genero);
		@SuppressWarnings("unchecked")
		List<Estudiante>resultado = query.getResultList();
		resultado.forEach(p -> System.out.println(p));
		return resultado;
	}

	@Override
	public void insertarListadoCSV() throws FileNotFoundException, IOException {
		@SuppressWarnings("deprecation")
		CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new
				FileReader("./src/archivosCSV/estudiantes.csv"));
		for(CSVRecord row: parser) {
			Estudiante e = new Estudiante(row.get("nombre"),row.get("apellido"),Integer.parseInt(row.get("edad")),row.get("genero"),Integer.parseInt(row.get("dni")),row.get("ciudad"));
			add(e);
		}
	}

	//a)main

	//b)main



}
