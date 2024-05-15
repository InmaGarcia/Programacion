package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Proyecto {

	private String codigoProyecto;
	private String descripcion;
	private LocalDate fechaInicio;
	private LocalDate fechaEntrega;
	private BigDecimal presupuesto;
	private BigDecimal costeActual;
	private List<Programador> progAsignados;

	public Proyecto(String codigoProyecto, String descripcion) {
		super();
		this.codigoProyecto = codigoProyecto;
		this.descripcion = descripcion;
		this.progAsignados = new ArrayList<>();
	}

	public String getCodigoProyecto() {
		return codigoProyecto;
	}

	public void setCodigoProyecto(String codigoProyecto) {
		this.codigoProyecto = codigoProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public BigDecimal getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(BigDecimal presupuesto) {
		this.presupuesto = presupuesto;
	}

	public BigDecimal getCosteActual() {
		return costeActual;
	}

	public void setCosteActual(BigDecimal costeActual) {
		this.costeActual = costeActual;
	}

	public List<Programador> getProgAsignados() {
		return progAsignados;
	}

	public void setProgAsignados(List<Programador> progAsignados) {
		this.progAsignados = progAsignados;
	}


	public Integer getDuracion() {
		if (fechaInicio != null && fechaEntrega != null) {
			Period periodo = this.fechaInicio.until(fechaEntrega);
			Integer anyo = periodo.getYears() * 12;
			Integer meses = periodo.getMonths() + anyo;
			return meses;
		} else {
			return 0;
		}
	}

	public BigDecimal getPresupuestoRestante() {
		if (costeActual.compareTo(presupuesto) > 0) {
			return BigDecimal.ZERO;
		} else {
			return presupuesto.subtract(costeActual).setScale(2, RoundingMode.HALF_DOWN);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProyecto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyecto other = (Proyecto) obj;
		return Objects.equals(codigoProyecto, other.codigoProyecto);
	}
	
	@Override
	public String toString() {

		DecimalFormat formato = new DecimalFormat("#,###.00");
		return "\t" + codigoProyecto + " - " + descripcion + " // Presupuesto: " + formato.format(presupuesto) + " ("
				+ formato.format(costeActual) + ")\n";
	}

}
