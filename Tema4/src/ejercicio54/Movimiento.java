package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {
		
	
	public static final String CARGO = "C";
	public static final String INGRESO = "I";
	public static final String RETIRADA = "R";
	
	private LocalDate fecha;
	private BigDecimal importe;
	
		
	public Movimiento( BigDecimal importe) {
		super();
		this.fecha = LocalDate.now();
		this.importe = importe;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	public abstract String getTipo();

	@Override
	public String toString() {
		return "Movimiento fecha=" + fecha+" - Importe: "+ importe
				+" -Tipo: "+getTipo();
	}

	
	
	

}
