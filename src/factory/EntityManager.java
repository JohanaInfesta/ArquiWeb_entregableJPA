package factory;

import repository.CarreraEstudianteRepository;
import repository.CarreraRepository;
import repository.EstudianteRepository;

public abstract class EntityManager {

	public static final String MySQL = "mysql";
	public static final String Derby = "derby";

	public abstract CarreraRepository getCarreraRepository();

	public abstract EstudianteRepository getEstudianteRepository();

	public abstract CarreraEstudianteRepository getCarreraEstudianteRepository();


	public static EntityManager getEntityManager(String factory) {
		switch(factory) {
		case MySQL : 
			return new mysqlEntityManager();
		case Derby :
			return new derbyEntityManager();
		default : 
			return null;
		}
	}
}
