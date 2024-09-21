package examen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {

	private String medicoEspecialista;
	private List<Cita> citas;

	public Agenda(String medicoEspecialista) {
		super();
		this.medicoEspecialista = medicoEspecialista;
		this.citas = new ArrayList<>();
	}

	public String getMedicoEspecialista() {
		return medicoEspecialista;
	}

	public void addCita(Cita cita) {
		
		if (!citas.contains(cita)) {
			citas.add(cita);
		}
	}

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> agenda = new ArrayList<>();
		if (citas.isEmpty()) {
			return null;
		} else {
			for (Cita cita : citas) {
				if (cita.getFecha().compareTo(fecha) == 0) {
					agenda.add(cita);
				}
			}
			return agenda;
		}
	}

	public BigDecimal getImportePendienteFacturar() {
		BigDecimal total = BigDecimal.ZERO;
		for (Cita cita : citas) {
			if (!cita.getFacturado()) {
				total = total.add(cita.getImporteFactura());
			}
		}
		return total.setScale(2, RoundingMode.HALF_DOWN);
	}

	public Boolean tieneCitaProxima(String paciente) {
		Boolean contiene = false;
		for (Cita cita : citas) {
			if (cita.getNombrePaciente().equalsIgnoreCase(paciente) && cita.getFecha().isAfter(LocalDate.now())) {
				contiene = true;
			}
		}
		return contiene;
	}

	public void borrarCitasFacturadas() {
		Iterator<Cita> iterador = citas.iterator();
		while (iterador.hasNext()) {
			Cita cita = iterador.next();
			if (cita.getFacturado()) {
				iterador.remove();
			}
		}
	}

	public void facturarCitasPendientes(String paciente) {
		for (Cita cita : citas) {
			if (cita.getNombrePaciente().equalsIgnoreCase(paciente) && cita.getFecha().isAfter(LocalDate.now())) {
				cita.setFacturado(true);
			}
		}
	}

}
