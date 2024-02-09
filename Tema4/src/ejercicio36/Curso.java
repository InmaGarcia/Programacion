package ejercicio36;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	
	private String identificador;
	private String descripcion;
	private List<Alumno> listaAlumnos; // array de alumnos
	//private Integer numAlumnosMaximo; esto o haria si quiero un tope en numero de alumnos

	public Curso() {
		super();
		listaAlumnos = new ArrayList<>();
	}


	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Alumno> getAlumnos() {
		return listaAlumnos;
	}

	public void addAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
		}

	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}

}
