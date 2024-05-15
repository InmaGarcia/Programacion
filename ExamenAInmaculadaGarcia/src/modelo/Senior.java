package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Senior extends Programador{
	
	private Integer anyoAntiguedad;

	public Senior(String codigoEmp) {
		super(codigoEmp);
		// TODO Auto-generated constructor stub
	}

	public Integer getAnyoAntiguedad() {
		return anyoAntiguedad;
	}

	public void setAnyoAntiguedad(Integer anyoAntiguedad) {
		this.anyoAntiguedad = anyoAntiguedad;
	}
	
	@Override
	public  BigDecimal getSueldoFinal() {
		return getSueldoBase().add(new BigDecimal(1000).multiply(new BigDecimal (anyoAntiguedad))).setScale(2, RoundingMode.HALF_DOWN);
	}

}
