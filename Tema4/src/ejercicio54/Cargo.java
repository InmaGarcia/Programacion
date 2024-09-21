package ejercicio54;

import java.math.BigDecimal;

public class Cargo extends Movimiento{
	
	private String cif;		
	
	public Cargo(BigDecimal importe) {
		super(importe);
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	
	@Override
	public String getTipo() {
		return CARGO;
	}

	@Override
	public String toString() {
		return "["+getTipo()+" - " + super.toString() + " - "+this.cif +"]";
	}

}
