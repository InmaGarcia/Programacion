package examen;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Revision extends Cita {

	private Integer numRevision;

	public Revision(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguro) {
		super(fecha, hora, nombrePaciente, seguro);
	}

	public Revision(String nombrePaciente) {
		super(nombrePaciente);
	}

	public Integer getNumRevision() {
		return numRevision;
	}

	public void setNumRevision(Integer numRevision) {
		this.numRevision = numRevision;
	}

	@Override
	public BigDecimal getImporteFactura() {
		Integer precio = 50 + (10 * this.numRevision);
		return new BigDecimal(precio);
	}

}
