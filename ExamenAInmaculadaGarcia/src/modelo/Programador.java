package modelo;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Programador {
	
	private String codigoEmp;
	private BigDecimal sueldoBase;
	
	
	public Programador(String codigoEmp) {
		super();
		this.codigoEmp = codigoEmp;
		this.sueldoBase = BigDecimal.ZERO;
	}
	
	public String getCodigoEmp() {
		return codigoEmp;
	}
	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}
	public BigDecimal getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(BigDecimal sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public abstract BigDecimal getSueldoFinal();

	@Override
	public int hashCode() {
		return Objects.hash(codigoEmp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programador other = (Programador) obj;
		return Objects.equals(codigoEmp, other.codigoEmp);
	}
	
	
	

}
