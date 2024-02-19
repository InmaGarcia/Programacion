package ejercicio54;

import java.math.BigDecimal;

public class Ingreso extends Movimiento {
	
	private String nombre;

	public Ingreso(BigDecimal importe, String nombre) {
		super(importe);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getTipo() {
		return INGRESO;
	}

	@Override
	public String toString() {
		return "["+getTipo()+" - " + super.toString() + " - "+this.nombre +"]";
	}
	
	

}
