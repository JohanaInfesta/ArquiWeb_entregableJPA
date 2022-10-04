package repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
		CarreraEstudiante ce = new CarreraEstudiante(c, e, LocalDate.now(), null);
		add(ce);
	}



	@Override
	public List<Carrera> getCarrerasOrder() {
		String jpql = "SELECT c.nombre, c.duracionAnios, COUNT(ce.fk_carrera) AS cantidadInscriptos FROM carrera c JOIN carrera_estudiante ce ON c.carreraID = ce.fk_carrera GROUP BY (ce.fk_carrera) ORDER BY cantidadInscriptos DESC";
		Query query = em.createNativeQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();
		List<Carrera> resultado = new ArrayList<>();
		
		for (int i = 0; i < resultList.size(); i++) {
            String CarreraNombre = (String) resultList.get(i)[0];
            System.out.println(CarreraNombre);
            int carreraDuracion = (int) resultList.get(i)[1];
            System.out.println(carreraDuracion);
            Integer cantInscriptos = (Integer) resultList.get(i)[2]; 
            System.out.println(cantInscriptos);

            Carrera c = new Carrera(CarreraNombre, carreraDuracion);
            
            resultado.add(c);
		}
		resultado.forEach(p -> System.out.println(p));
		return null;
	}



	@Override
	public List<Estudiante> getEstudiantesCarrera(String ciudad) {
		
		return null;
	}



}
