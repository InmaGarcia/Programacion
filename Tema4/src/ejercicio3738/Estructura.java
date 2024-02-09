package ejercicio3738;

import java.util.ArrayList;
import java.util.List;

public abstract class Estructura {
	
	protected List<String> datos;

	public Estructura() {
		super();
		this.datos = new ArrayList<>();
	}
	
	public void añadirCadena(String cadena) {
		this.datos.add(cadena);
	}

	public Integer getTamaño() {
		return datos.size();
	}
	
	public abstract String sacarCadena();
	
	@Override
	public String toString() {
		return datos.toString() ;
	}
	

}
