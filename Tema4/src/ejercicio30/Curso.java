package ejercicio30;

public class Curso {

	Integer tam;
	private String identificador;
	private String descripcion;
	private Alumno[] alumnos; // array de alumnos

	public Curso() {
		super();
	}

	public Curso(Integer tam) { // iniciamos el array
		alumnos = new Alumno[tam];
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

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
			}
		}
	}

	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}

}
