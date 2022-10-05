package entities.dto;
/**
 * 
 * @author Johana Infesta, Rocio Giannaccini, Juan Mauro, Juan Manuel Campo
 *
 */
public class carreraDTO {

	private String nombre;
	
	private int duracionAnios;
	
	private Long cantInscriptos;

	public carreraDTO(String nombre, int duracionAnios, Long cantInscriptos) {
		super();
		this.nombre = nombre;
		this.duracionAnios = duracionAnios;
		this.cantInscriptos = cantInscriptos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracionAnios() {
		return duracionAnios;
	}

	public Long getCantInscriptos() {
		return cantInscriptos;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDuracionAnios(int duracionAnios) {
		this.duracionAnios = duracionAnios;
	}

	public void setCantInscriptos(Long cantInscriptos) {
		this.cantInscriptos = cantInscriptos;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", duracionAnios=" + duracionAnios + ", cantInscriptos="
				+ cantInscriptos;
	} 
	
	
	
}
