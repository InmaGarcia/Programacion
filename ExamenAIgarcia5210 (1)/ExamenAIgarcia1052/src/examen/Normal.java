package examen;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Normal extends Cita {

	public Normal(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguro) {
		super(fecha, hora, nombrePaciente, seguro);
	}

	public Normal(String nombrePaciente) {
		super(nombrePaciente);
	}

	@Override
	public BigDecimal getImporteFactura() {
		if (getSeguro()) {
			return new BigDecimal(100);
		} else {
			return new BigDecimal(150);
		}
	}

}
