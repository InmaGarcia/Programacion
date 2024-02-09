package ejercicio33;

public class Semaforo {

	public static final String ROJO = "rojo";
	public static final String AMBAR = "ambar";
	public static final String VERDE = "verde";

	private String color;
	private Boolean parpadeando;

	public Semaforo() {
		super();
		this.color = ROJO;
		this.parpadeando = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
			if(color.equals(ROJO) ||color.equals(VERDE)) {
				this.parpadeando = false;
			}
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if (!color.equals(AMBAR) && parpadeando) {
			return;// asi cortamos el bucle, pero no devolvemos nada.
		}

		this.parpadeando = parpadeando;
	}

	// métodos
	public void cambiarEstado() {
		if(color.equals(VERDE)) {
			color= AMBAR;
			parpadeando = true;
		}
		else if(color.equals(AMBAR) && parpadeando) {
			parpadeando=false;
		}
		else if(color.equals(AMBAR)) {
			color = ROJO;
		}
		else {
			color = VERDE;
		}

	}

	@Override
	public String toString() {
		String dev = "Semáforo en " + color;

		if (color.equals(AMBAR) && parpadeando) {
			return dev + " parpadeando";// "Semáforo en " + color + " parpadeando";
		} else {
			return dev;// "Semáforo en " + color;
		}
	}

}
