package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 * @param <T>
 */
public class Repository<T> { //abstract class?
	//esta clase no va
	//hacer clases DTO para cada clase que tengas los constructotes de ReporteDTO, Carrera, Estudiante clase, gets y toString
	// se puede generar una clase abstracta de repository ... BUSCAR!!!!!!!

	private EntityManager em;
	private EntityManagerFactory emf;
	
	
	public Repository() {
		super();
		this.emf = Persistence.createEntityManagerFactory("IntegradorJPA");
		this.em = this.emf.createEntityManager(); 
	}


	public void add(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}
	
	public void close() {
		this.em.close();
		this.emf.close();
	}
}
