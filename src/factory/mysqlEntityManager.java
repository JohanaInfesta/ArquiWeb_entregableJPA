package factory;

import repository.CarreraEstudianteRepository;
import repository.CarreraRepository;
import repository.EstudianteRepository;

public class mysqlEntityManager extends DAOEntityManager {

	
	
	@Override
	public CarreraRepository getCarreraRepository() {
		return null;
	}

	@Override
	public EstudianteRepository getEstudianteRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarreraEstudianteRepository getCarreraEstudianteRepository() {
		// TODO Auto-generated method stub
		return null;
	}



}
