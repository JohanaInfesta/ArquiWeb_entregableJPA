package edu.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.clases.Carrera;
import edu.clases.CarreraEstudiante;
import edu.clases.Estudiante;

public class insert {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Estudiante e = new Estudiante("johana", "infesta", 31, "femenino", 35580050, "Tandil");
		em.persist(e);
		Carrera c = new Carrera(1, "TUDAI");
		em.persist(c);
		CarreraEstudiante ce = new CarreraEstudiante(LocalDate.now(), null);
		em.persist(ce);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
