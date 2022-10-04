package entities.dto;

public class estudianteDTO {

	private String nombreCarrera;
	private int libreta;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private int dni;
	private String ciudad;



	public estudianteDTO() {
		super();
	}

	//	public estudianteDTO(String nombreCarrera, int libreta, String nombre, String apellido, int edad, String genero,
	//			int dni, String ciudad) {
	//		super();
	//		this.nombreCarrera = nombreCarrera;
	//		this.libreta = libreta;
	//		this.nombre = nombre;
	//		this.apellido = apellido;
	//		this.edad = edad;
	//		this.genero = genero;
	//		this.dni = dni;
	//		this.ciudad = ciudad;
	//	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public int getLibreta() {
		return libreta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getGenero() {
		return genero;
	}

	public int getDni() {
		return dni;
	}

	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return "nombreCarrera=" + nombreCarrera + ", libreta=" + libreta + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", dni=" + dni + ", ciudad="
				+ ciudad;
	}

}
