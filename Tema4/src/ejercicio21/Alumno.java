package ejercicio21;

public class Alumno extends Persona{

	private String dni;
	private Integer nota;
	

	//llamo al constructor del Padre
	public Alumno() {
		super();
	}
		
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	public void aprobar() {
		nota = 5;
	}
	
}
