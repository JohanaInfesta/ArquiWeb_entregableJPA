package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import entities.Carrera;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
public interface InterfaceCarrera {

	/**
	 * insercion de carreras con archivo csv
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void insertarListadoCSV() throws FileNotFoundException, IOException;

	/**
	 * encontrar carrera (Long id)
	 * @param id
	 * @return carrera
	 */
	public Carrera getCarrera(int id);
	
	
}
