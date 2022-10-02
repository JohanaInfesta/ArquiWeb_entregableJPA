package repository;

import java.util.List;

import javax.persistence.EntityManager;

import entities.Estudiante;
import interfaces.InterfaceEstudiante;
//al extender de repository puedo usar los metodos add y close
public class EstudianteRepository extends Repository<Estudiante> implements InterfaceEstudiante{

	private EntityManager em;
	
	public EstudianteRepository(EntityManager em) {
		super();
		this.em = em;
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
