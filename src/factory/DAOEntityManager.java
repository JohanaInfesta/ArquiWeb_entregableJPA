package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import repository.CarreraEstudianteRepository;
import repository.CarreraRepository;
import repository.EstudianteRepository;

public abstract class DAOEntityManager {

	public static final String MySQL = "mysql";
	public static final String Derby = "derby";

	protected static EntityManager em = null;
	private EntityManagerFactory emf = null;

	public abstract CarreraRepository getCarreraRepository();

	public abstract EstudianteRepository getEstudianteRepository();

	public abstract CarreraEstudianteRepository getCarreraEstudianteRepository();


	public DAOEntityManager getDAOEntityManager(String factory) {
		switch(factory) {
		case MySQL : 
			return new mysqlEntityManager();
		case Derby :
			return new derbyEntityManager();
		default : 
			return null;
		}
	}

	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}
	public EntityManagerFactory getEntityManagerFactory() {
		return this.emf;
	}
	public EntityManager createEntityManager() {
		return emf.createEntityManager();
	}

}
