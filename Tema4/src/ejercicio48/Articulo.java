package ejercicio48;

public class Articulo {

	private String descripcion;
	private Double precio;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [descripcion=" + descripcion + ", precio=" + precio + "]";
	}

}
