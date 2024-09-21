package ExamenA;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaRevision extends Cita {

	private Integer numRevision;

	public CitaRevision(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguro) {
		super(fecha, hora, nombrePaciente, seguro);

	}

	@Override
	public BigDecimal getImporteFactura() {

		return new BigDecimal(60);
	}

	public Integer getNumRevision() {
		return numRevision;
	}

	public void setNumRevision(Integer numRevision) {
		this.numRevision = numRevision;
	}

	
	
}

