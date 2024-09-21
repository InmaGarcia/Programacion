package modulo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String codigo;
	private String nombreEq;
	private List<Jugador> jugadores;

	public Equipo() {
		super();
		this.jugadores = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreEq() {
		return nombreEq;
	}

	public void setNombreEq(String nombreEq) {
		this.nombreEq = nombreEq;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public BigDecimal getEdadMedia() {
		BigDecimal total = BigDecimal.ZERO;

		for (Jugador jugador : jugadores) {
			Period periodo = jugador.getFecha_nacimiento().until(LocalDate.now());
			Integer anyo = periodo.getYears();
			total = total.add(new BigDecimal(anyo));
		}

		return total.divide(new BigDecimal(jugadores.size()).setScale(2, RoundingMode.HALF_DOWN));
	}

	@Override
	public String toString() {
		return "Equipo :" + codigo + " // " + nombreEq;
	}

}
