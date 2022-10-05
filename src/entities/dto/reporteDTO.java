package entities.dto;

import java.util.Date;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
public class reporteDTO {

	private String nombreCarrera;
	private Date inscripcion;
	private Long cantGraduados;
	private Long cartInscriptos;
	
	public reporteDTO(String nombreCarrera, Date inscripcion, Long cantGraduados, Long cartInscriptos) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.inscripcion = inscripcion;
		this.cantGraduados = cantGraduados;
		this.cartInscriptos = cartInscriptos;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public Date getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(Date inscripcion) {
		this.inscripcion = inscripcion;
	}

	public Long getCantGraduados() {
		return cantGraduados;
	}

	public void setCantGraduados(Long cantGraduados) {
		this.cantGraduados = cantGraduados;
	}

	public Long getCartInscriptos() {
		return cartInscriptos;
	}

	public void setCartInscriptos(Long cartInscriptos) {
		this.cartInscriptos = cartInscriptos;
	}

	@Override
	public String toString() {
		return "nombreCarrera=" + nombreCarrera + ", inscripcion=" + inscripcion + ", cantGraduados="
				+ cantGraduados + ", cartInscriptos=" + cartInscriptos;
	}
	
	
	
}
