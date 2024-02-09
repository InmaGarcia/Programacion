package ejercicio28;

import java.util.Objects;                                                                                                                                                                                                                                                                                                             
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona{

	private String dni;
	private Integer nota;
	private Curso curso;

	

	public Alumno() {
		super();
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
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

	public Boolean validarDni() {
		//Boolean dniOk = false;
		
		if (dni == null) {
			return false;
		}
		//String ejemploDni = dni;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			//System.out.println("El dni es correcto");
			return true;
		} else {
			//System.out.println("El dni es incorrecto");
			return false;
		}	
		//return dniOk;
	}
	
	@Override
	public String toString() {
		return "Alumno [dni=" + getDni() + ", curso=" + getCurso() + ", Nombre = " + getNombre() 
		+ ", Edad=" + getEdad() +  ", Class=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
