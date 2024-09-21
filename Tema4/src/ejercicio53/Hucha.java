package ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	
	private BigDecimal ahorro;

	public Hucha() {
		super();
		this.ahorro = BigDecimal.ZERO;
	}
	
	public BigDecimal getAhorro() {
		return ahorro;
	}

	public void setAhorro(BigDecimal ahorro) {
		this.ahorro = ahorro;
	}

	public BigDecimal meterDinero(BigDecimal dinero) {
		this.ahorro = this.ahorro.add(dinero).setScale(2, RoundingMode.HALF_DOWN);
		return this.ahorro;
	}
	
	public BigDecimal sacarDinero(BigDecimal dinero) {
		BigDecimal importe = BigDecimal.ZERO;
		if( dinero.compareTo(this.ahorro)>0) {
			importe = this.ahorro;
			this.ahorro = BigDecimal.ZERO;
		}
		else {
			importe = dinero;
			this.ahorro = this.ahorro.subtract(dinero).setScale(2, RoundingMode.HALF_DOWN);
		}
		return importe;
	}
	
	public BigDecimal contarDinero() {
		return this.ahorro;
	}
	
	public BigDecimal romperHucha() {
		BigDecimal dinero = this.ahorro;
		this.ahorro= this.ahorro.subtract(dinero).setScale(2, RoundingMode.HALF_DOWN);
		return dinero;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00 €");
		return "Hucha = " + formato.format(ahorro);
	}
	
	
	

}
