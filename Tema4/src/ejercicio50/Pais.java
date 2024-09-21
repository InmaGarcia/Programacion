package ejercicio50;

import java.util.Objects;

public class Pais {
	
	private  String codigo;
	private String nombre;
	
	
	
	public Pais(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.nombre = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String descripcion) {
		this.nombre = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo.toUpperCase());//pasamos a may. para que los compare
	}//en ese estado, lo ponemos tmb abajo
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigo.toUpperCase(), other.codigo.toUpperCase());
	}
	
	
	

}
