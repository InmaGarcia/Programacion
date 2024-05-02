package ejercicio54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {

	private String numero;// es string porque puede empezar por 0
	private List<Movimiento> movimientos;

	public CuentaAhorros(String numero) {
		super();
		this.movimientos = new ArrayList<>();
	}

	public void addMovimiento(Movimiento mov) {
		movimientos.add(mov);
	}

	public String getNumero() {
		return numero;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public BigDecimal totalDinero() {
		BigDecimal dinero = BigDecimal.ZERO;
		for (Movimiento movimiento : movimientos) {

			if (movimiento.getTipo().equals("I")) {
				dinero = dinero.add(movimiento.getImporte());
			} else {
				dinero = dinero.subtract(movimiento.getImporte());
			}
		}
		return dinero.setScale(2, RoundingMode.HALF_DOWN);

	}

	public void movimientos() {
		for (Movimiento movimiento : movimientos) {
			System.out.println(movimiento);
		}
	}

	public void retiradas() {
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals("R")) {
				System.out.println(movimiento);
			}
		}
	}

}
