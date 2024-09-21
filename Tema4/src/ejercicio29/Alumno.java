package ejercicio29;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {

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

		if (dni == null) {
			return false;
		}
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			return true;
		} else {
			return false;
		}

	}
	
	public Boolean validar() {
		Boolean correcto = false;
		 
		 if(curso !=null) {
			 correcto = true;
		 }
		 if(getNombre() != null && getNombre().length() >=10 ) {
			 correcto = true; 
		 }
		 if(getEdad() != null && getEdad()<=65 && getEdad()>=12) {
			 correcto = true;
		 }
		 if(validarDni()) {
			 correcto = true;			 
		 }
		 return correcto;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + getDni() + ", curso=" + getCurso() + ", Nombre = " + getNombre() + ", Edad=" + getEdad()
				+ ", Class=" + getClass() + "]";
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
