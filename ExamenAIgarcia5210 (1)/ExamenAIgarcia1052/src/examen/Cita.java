package examen;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Cita {

	private LocalDate fecha;
	private Integer hora;
	private String nombrePaciente;
	private Boolean seguro;
	private Boolean facturado;

	public Cita(String nombrePaciente) {
		super();
		this.nombrePaciente = nombrePaciente;
		this.seguro = false;
		this.facturado = false;
	}

	public Cita(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguro) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.nombrePaciente = nombrePaciente;
		this.seguro = seguro;
		this.facturado = false;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public Boolean getSeguro() {
		return seguro;
	}

	public void setSeguro(Boolean seguro) {
		this.seguro = seguro;
	}

	public Boolean getFacturado() {
		return facturado;
	}

	public void setFacturado(Boolean facturado) {
		this.facturado = facturado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, hora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora);
	}

	public abstract BigDecimal getImporteFactura();

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if (this.seguro) {
			return nombrePaciente + " - " + fecha.format(formato) + " - " + hora + "horas - CON SEGURO";
		} else {
			return nombrePaciente + " - " + fecha.format(formato) + " - " + hora + "horas - SIN SEGURO";
		}
	}

	public Integer getDiasHastaCita() {
		LocalDate hoy = LocalDate.now();

		if (this.fecha.isBefore(hoy)) {
			return -1;
		} else {
			Period periodo = hoy.until(this.fecha);
			Integer diasHastaCita = periodo.getDays();
			return diasHastaCita;
		}
	}

}
