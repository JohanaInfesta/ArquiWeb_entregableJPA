package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Estudiante;
import repository.CarreraEstudianteRepository;
import repository.CarreraRepository;
import repository.EstudianteRepository;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntegradorJPA");
		EntityManager em = emf.createEntityManager();

		CarreraRepository cr = new CarreraRepository(em);
		EstudianteRepository er = new EstudianteRepository(em);
		CarreraEstudianteRepository cer = new CarreraEstudianteRepository(em);

		//2-A)
		
//		er.insertarListadoCSV();
//		cr.insertarListadoCSV();
//	
		//2-B)
		cer.matricularEstudiante(er.getEstudianteByLibreta(1), cr.getCarrera(11));
		
		//2-C)
		er.getEstudianteByCriterio();
		
		//2-D)
		System.out.println(er.getEstudianteByLibreta(1));
//		er.close();
//		cr.close();


	}

}
