package ExamenA;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {

	private String medico;
	private List<Cita> citas;

	public Agenda(String medico) {
		super();
		this.medico = medico;
		citas = new ArrayList<>();
	}

	public String getMedico() {
		return medico;
	}

	public void addCita(Cita cita) {
		if (!citas.contains(cita)) {
			citas.add(cita);
		}
	}

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> aux = new ArrayList<>();
		for (Cita cita1 : this.citas) {
			if (cita1.getFecha().equals(LocalDate.now())) {
				aux.add(cita1);
			}
		}
		return aux;
	}

	public BigDecimal getImportePendienteFacturar() {
		BigDecimal importe = new BigDecimal(0);
		for (Cita cita1 : this.citas) {
			if (cita1.getFacturada() == false) {
				importe = importe.add(cita1.getImporteFactura());
			}

		}
		return importe.setScale(2, RoundingMode.HALF_DOWN);

	}

	public Boolean tieneCitaProxima(String nombre) {
		for (Cita cita1 : this.citas) {
			if (cita1.getFecha().isAfter(LocalDate.now())) {
				return true;
			}
		}
		return false;
	}

	public void borrarCitasFacturadas() {
		Iterator<Cita> it = citas.iterator();
		while (it.hasNext()) {
			Cita cita = it.next();
			if (cita.getFacturada() == true) {
				it.remove();
			}
		}
	}

	public void facturarCitasPendientes(String nombre) {
		for (Cita cita1 : this.citas) {
			if (cita1.getFecha().isBefore(LocalDate.now())) {
				cita1.setFacturada(true);
			}
		}
	}

}
