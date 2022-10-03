package repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Carrera;
import entities.CarreraEstudiante;
import entities.Estudiante;
import interfaces.InterfaceCarreraEstudiante;

public class CarreraEstudianteRepository extends Repository<CarreraEstudiante> implements InterfaceCarreraEstudiante{ //implement interface de carreraEstudiante

	private EntityManager em;
	
	public CarreraEstudianteRepository(EntityManager em) {
		super();
		this.em = em;
	}
	
	

	@Override //ReporteDTO en vez de Estudiante
	public ArrayList<Estudiante> generarReporteFinal() {
//		EntityManager em = this.emf.createEntityManager();
		return null;
	}



	@Override
	public void matricularEstudiante(Estudiante e, Carrera c) {
//		EntityManager em = this.emf.createEntityManager();
		CarreraEstudiante ce = new CarreraEstudiante(c, e, LocalDate.now(), null);
		add(ce);
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
