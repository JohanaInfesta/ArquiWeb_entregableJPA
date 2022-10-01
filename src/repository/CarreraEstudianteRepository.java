package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Carrera;
import entities.Estudiante;
import interfaces.InterfaceCarreraEstudiante;

public class CarreraEstudianteRepository implements InterfaceCarreraEstudiante{ //implement interface de carreraEstudiante

	private EntityManagerFactory emf;
	
	public CarreraEstudianteRepository(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}
	
	

	@Override //ReporteDTO en vez de Estudiante
	public ArrayList<Estudiante> generarReporteFinal() {
		EntityManager em = this.emf.createEntityManager();
		return null;
	}



	@Override
	public void matricularEstudiante(Estudiante e, Carrera c) {
		EntityManager em = this.emf.createEntityManager();
		
	}



	@Override
	public List<Carrera> getCarrerasOrder() {
		return null;
	}



	@Override
	public List<Estudiante> getEstudiantesCarrera(String ciudad) {
		return null;
	}

	
	
}
