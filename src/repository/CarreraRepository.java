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

public class CarreraRepository extends Repository<Carrera> implements InterfaceCarrera{

	private EntityManager em;

	public CarreraRepository(EntityManager em) {
		super();
		this.em = em;
	}

	//	@Override
	//	public void guardarCarrera(Carrera c) {
	//	}

	@Override
	public Carrera getCarrera(int id) {
		return em.find(Carrera.class, id);
	}

	@Override
	public void eliminarCarrera(Carrera c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCarrera(Carrera c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarListadoCSV() throws FileNotFoundException, IOException {
		CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new
				FileReader("./src/archivosCSV/carreras.csv"));
		for(CSVRecord row: parser) {
			Carrera c = new Carrera(row.get("nombre"),Integer.parseInt(row.get("duracion")));
			add(c);
		}

	}



	//
}
