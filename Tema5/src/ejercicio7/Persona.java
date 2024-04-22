package ejercicio7;

import java.math.BigDecimal;

public class Persona {

	private String genero;
	private BigDecimal altura;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) throws ParametroIncorrectoException {
		try {
			if (genero.equalsIgnoreCase("H") || genero.equalsIgnoreCase("M")) {
				this.genero = genero;
			} else {
				throw new ParametroIncorrectoException();

			}
		} catch (ParametroIncorrectoException e) {
			System.out.println("El valor introducido es incorrecto");
		}
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		try {
			if (altura.compareTo(BigDecimal.ONE) == -1 || altura.compareTo(new BigDecimal(2)) == 1) {
				throw new ParametroIncorrectoException();

			} else {
				this.altura = altura;
			}
		} catch (ParametroIncorrectoException e) {
			System.out.println("El valor introducido es incorrecto");
		}

	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
