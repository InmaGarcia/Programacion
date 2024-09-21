package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {

	private List<Integer> numeros;

	public SacoNumeros() {
		super();
		this.numeros = new ArrayList<>();
	}

	public void addNumero(Integer num) {
		numeros.add(num);
	}

	public Integer getNumero(Integer posicion) {
		//if (posicion < numeros.size()) { tengo que generar un fallo asi 
		//que no compruebo
			return numeros.get(posicion);
		
		//return null;
	}

	@Override
	public String toString() {
		return "Lista : " + numeros.toString();
	}

}
