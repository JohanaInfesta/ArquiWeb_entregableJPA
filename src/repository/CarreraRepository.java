package repository;

import javax.persistence.EntityManagerFactory;

import entities.Carrera;
import interfaces.InterfaceCarrera;

public class CarreraRepository implements InterfaceCarrera{

	private EntityManagerFactory emf;
	
	public CarreraRepository(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}

	@Override
	public void guardarCarrera(Carrera c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carrera encontrarCarrera(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCarrera(Carrera c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCarrera(Carrera c) {
		// TODO Auto-generated method stub
		
	}

	

	//
}
