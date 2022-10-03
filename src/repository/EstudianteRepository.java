package repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
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
		
		Query query = em.createNativeQuery("SELECT * FROM estudiante e ORDER BY e.apellido ASC", Estudiante.class);
		
//		String jpql = "SELECT e FROM estudiante e ORDER BY e.apellido ASC";
//		Query query = em.createQuery(jpql);
		
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
	public List<Estudiante> getAllEstudiantesByGenero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarListadoCSV() throws FileNotFoundException, IOException {
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
