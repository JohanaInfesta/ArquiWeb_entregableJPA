package repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import entities.Estudiante;
import interfaces.InterfaceEstudiante;

public class EstudianteRepository implements InterfaceEstudiante{

	private EntityManagerFactory emf;
	
	public EstudianteRepository(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}

	@Override
	public List<Estudiante> getEstudianteByCriterio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante getEstudianteByLibreta(int libreta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> getAllEstudiantesByGenero() {
		// TODO Auto-generated method stub
		return null;
	}

	//a)main
	
	//b)main
	
	
	
}
