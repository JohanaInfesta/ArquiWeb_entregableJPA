package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import criterios.Genero;
import entities.Carrera;
import entities.Estudiante;
import repository.CarreraEstudianteRepository;
import repository.CarreraRepository;
import repository.EstudianteRepository;

public class Main {

	public static void main(String[] args) {
		// hacer factory de entity manager para MySQL y DERBY .... BUSCAR!!!
		//de momento se puede dejar asi
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntegradorJPA");
		EntityManager em = emf.createEntityManager();
		//
		
		//con esto despues se llaman a los metodos necesarios
		CarreraRepository cr = new CarreraRepository(em);
		EstudianteRepository er = new EstudianteRepository(em);
		CarreraEstudianteRepository cer = new CarreraEstudianteRepository(emf);
		
		//agregar
		Estudiante e = new Estudiante("johana", "infesta", 31, Genero.femenino, 35580050, "Tandil");
		//buscar forma de pasar lo comentado a los metodos abstractos
		Carrera c = new Carrera( "TUDAI");
		//agregarEstudiante
		er.add(e);
		
		//AgregarCarrerra
		cr.add(c);
		
		
		er.close();
		cr.close();


	}

}
