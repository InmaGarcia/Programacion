package ejercicio38;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	
	private List<String> pila;
	
	
	
	public PilaCadenas() {
		super();
		this.pila = new ArrayList<>();
	}

	public void añadirCadena(String cadena) {
		this.pila.add(cadena);
	}

	public String sacarCadena() {
		if(this.pila.isEmpty()) {
			return null;
		}
		return this.pila.remove(pila.size()-1);
	}
	
	public Integer getTamaño() {
		return pila.size();
	}

	@Override
	public String toString() {
		return pila.toString();
	}

	
}
