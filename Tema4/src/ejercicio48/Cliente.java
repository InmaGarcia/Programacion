package ejercicio48;

public class Cliente {

	private String Nombre;
	private String dni;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre + ", dni=" + dni + "]";
	}

}
