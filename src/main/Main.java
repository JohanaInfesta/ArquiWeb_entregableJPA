package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import criterios.Genero;
import entity.Carrera;
import entity.Estudiante;

public class Main {

	public static void main(String[] args) {
		
		// hacer factory de entity manager para MySQL y DERBY .... BUSCAR!!!
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Estudiante e = new Estudiante("johana", "infesta", 31, Genero.femenino, 35580050, "Tandil");
		em.persist(e);
		Carrera c = new Carrera( "TUDAI");
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
