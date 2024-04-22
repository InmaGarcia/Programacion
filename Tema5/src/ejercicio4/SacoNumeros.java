package ejercicio4;

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
		try {
			return numeros.get(posicion);
		}
		catch (IndexOutOfBoundsException a) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Lista : " + numeros.toString();
	}

}
