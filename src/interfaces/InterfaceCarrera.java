package interfaces;

import entities.Carrera;

public interface InterfaceCarrera {

//	//guardar carrera(Carrera)
//	public void guardarCarrera(Carrera c);
//	
	//encontrar carrera (Long id)
	public Carrera encontrarCarrera(Long id);
	
	//eliminar carrera(Carrera)
	public void eliminarCarrera(Carrera c);
	
	//actualizar carrera(Carrera)
	public void actualizarCarrera(Carrera c);
}
