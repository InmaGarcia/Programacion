package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadena {
	
	private List<String> cola;

	public ColaCadena() {
		super();
		this.cola = new ArrayList<>();
	}
	
	public void añadirCadena(String cadena) {
		this.cola.add(cadena);
	}
	
	public String sacarCadena() {
		if(cola.isEmpty()) {
			return null;
		}
		String devuelve = this.cola.get(0);
		this.cola.remove(0);
		return devuelve; //return cola.remove(0); esto es lo mismo 
	}
	
	public Integer getTamaño() {
		return this.cola.size();
	}

	@Override
	public String toString() {
		return cola.toString() ;
	}
	
	
}
