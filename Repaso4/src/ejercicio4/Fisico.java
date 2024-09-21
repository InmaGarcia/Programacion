package ejercicio4;

public class Fisico extends Libro {

	private Integer alto;
	private Integer ancho;
	private Integer peso;

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public String getTipo() {
		return TIPO_FISICO;
	}

}
