package ejercicio43;

public abstract class Persona {
	public static final Integer SUELDO_ACTOR = 100000;
	public static final Integer SUELDO_DIRECTOR = 200000;
	public static final Integer SUELDO_GUIONISTA = 50000;
	
	private String nombre;
	private Integer añoNacimiento;
	private String nacionalidad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public abstract Integer getSueldo();
	
	@Override
	public String toString() {
		return "nombre=" + nombre + ", añoNacimiento=" +
	             añoNacimiento + ", nacionalidad=" + nacionalidad;
	}
	
	
	

}
