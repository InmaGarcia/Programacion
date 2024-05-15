package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Junior extends Programador{
	
	private Senior tutor;

	
	public Junior(String codigoEmp, Senior tutor) {
		super(codigoEmp);
		this.tutor= tutor;
	}

	public Senior getTutor() {
		return tutor;
	}

	public void setTutor(Senior tutor) {
		this.tutor = tutor;
	}
	
	@Override
	public  BigDecimal getSueldoFinal() {
		return getSueldoBase().setScale(2, RoundingMode.HALF_DOWN);
	}
	
}
