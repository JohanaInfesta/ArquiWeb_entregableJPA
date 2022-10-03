package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import entities.Carrera;

public interface InterfaceCarrera {

//	//guardar carrera(Carrera)
	public void insertarListadoCSV() throws FileNotFoundException, IOException;
//	
	//encontrar carrera (Long id)
	public Carrera getCarrera(int id);
	
	//eliminar carrera(Carrera)
	public void eliminarCarrera(Carrera c);
	
	//actualizar carrera(Carrera)
	public void actualizarCarrera(Carrera c);
}
