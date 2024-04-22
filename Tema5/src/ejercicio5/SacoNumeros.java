package ejercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public BigDecimal division() {
		BigDecimal resultado = BigDecimal.ZERO;
		try {
			if (numeros.size() >= 2) {
				BigDecimal posicion1 = new BigDecimal(numeros.get(0));
				BigDecimal posicion2 = new BigDecimal(numeros.get(1));
				resultado = posicion1.divide(posicion2).setScale(2, RoundingMode.HALF_UP);

				for (int i = 2; i < numeros.size(); i++) {
					resultado = resultado.divide(new BigDecimal(numeros.get(i))).setScale(2, RoundingMode.HALF_UP);
				}
			}
			return resultado;
		} catch (ArithmeticException e) {
			return BigDecimal.ZERO;
		}
		finally {
			System.out.println("División completa");
		}

	}

	@Override
	public String toString() {
		return "Lista : " + numeros.toString();
	}

}
