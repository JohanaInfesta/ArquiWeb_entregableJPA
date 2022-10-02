package repository;

import javax.persistence.EntityManager;
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
