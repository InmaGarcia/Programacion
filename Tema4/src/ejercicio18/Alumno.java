package ejercicio18;

public class Alumno {

	private String dni;
	private String nombre;
	private Integer edad;
	private Integer nota;
	
	public Alumno() {
		this.dni = "";
		this.nombre = "";
		this.edad = 0;
		this.nota = 0;
	}

	public Alumno(String dni, String nombre, Integer edad, Integer nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	public static void aprobar(Integer nota) {
		nota = 5;
	}
	
}
