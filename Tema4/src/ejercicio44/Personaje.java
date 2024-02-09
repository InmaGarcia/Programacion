package ejercicio44;

import java.util.Objects;

public abstract class Personaje {
	
	private String nombre;
	private String codigo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public abstract Integer getPuntosVida();
	public abstract Integer getDaño();
	public abstract Integer getDañoTiempo();
	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	

}
