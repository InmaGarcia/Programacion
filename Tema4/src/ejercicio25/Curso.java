package ejercicio25;

public class Curso {
	
	private String identificador;
	private String descripcion;
	
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
	
	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}
	
	
}
