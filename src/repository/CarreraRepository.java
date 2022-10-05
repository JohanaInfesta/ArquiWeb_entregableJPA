package repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.persistence.EntityManager;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import entities.Carrera;
import interfaces.InterfaceCarrera;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
public class CarreraRepository extends Repository<Carrera> implements InterfaceCarrera{

	private EntityManager em;

	public CarreraRepository(EntityManager em) {
		super();
		this.em = em;
	}


	@Override
	public Carrera getCarrera(int id) {
		return em.find(Carrera.class, id);
	}

	
	@Override
	public void insertarListadoCSV() throws FileNotFoundException, IOException {
		@SuppressWarnings("deprecation")
		CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new
				FileReader("./src/archivosCSV/carreras.csv"));
		for(CSVRecord row: parser) {
			Carrera c = new Carrera(row.get("nombre"),Integer.parseInt(row.get("duracion")));
			add(c);
		}

	}

}
