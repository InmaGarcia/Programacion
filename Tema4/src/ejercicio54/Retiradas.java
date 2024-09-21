package ejercicio54;

import java.math.BigDecimal;

public class Retiradas extends Movimiento {
	

	public Retiradas(BigDecimal importe) {
		super(importe);
	}
	
	@Override
	public String getTipo() {
		return RETIRADA;
	}

	@Override
	public String toString() {
		return "["+getTipo()+" - " + super.toString() +"]";
	}
	
	

}
