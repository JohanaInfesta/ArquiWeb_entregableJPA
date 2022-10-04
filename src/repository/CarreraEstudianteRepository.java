package repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Carrera;
import entities.CarreraEstudiante;
import entities.Estudiante;
import entities.dto.carreraDTO;
import interfaces.InterfaceCarreraEstudiante;

@SuppressWarnings("rawtypes")
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
	public List<carreraDTO> getCarrerasOrder() {
		String jpql = "SELECT c.nombre, c.duracionAnios, COUNT(ce.fk_carrera) AS cantidadInscriptos " 
				+ "FROM carrera c " 
				+ "JOIN carrera_estudiante ce ON c.carreraID = ce.fk_carrera "
				+ "GROUP BY (ce.fk_carrera) "
				+ "ORDER BY cantidadInscriptos DESC";
		Query query = em.createNativeQuery(jpql);
		List resultList = query.getResultList();
		List<carreraDTO> resultado = new ArrayList<>();
		Iterator res = resultList.iterator();
		
		while(res.hasNext()) {
			Object[] tupla = (Object[])res.next();
			String CarreraNombre = (String) tupla[0];
			int carreraDuracion = (int) tupla[1];
			long count = Long.parseLong(String.valueOf(tupla[2]));
			
			carreraDTO c = new carreraDTO(CarreraNombre, carreraDuracion, count);
            
            resultado.add(c);
		}
		resultado.forEach(p -> System.out.println(p));
		return null;
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<Estudiante> getEstudiantesCarrera(Carrera c, String ciudad) {
		String idCarrera = String.valueOf(c.getId_carrera());
		String jpql = "SELECT e.libreta, e.nombre, e.apellido, e.edad, e.genero, e.dni, e.ciudad " 
				+ "FROM estudiante e " 
				+ "JOIN carrera_estudiante ce ON ce.fk_estudiante = e.libreta "
				+ "JOIN carrera c ON c.carreraID = ce.fk_carrera "
				+ "WHERE e.ciudad =?1 AND c.carreraID =?2";
		Query query = em.createNativeQuery(jpql, Estudiante.class);
		query.setParameter(1, ciudad);
		query.setParameter(2, idCarrera);
		List<Estudiante>resultado = query.getResultList();
		resultado.forEach(p -> System.out.println(p));
		return resultado;
	}



}
