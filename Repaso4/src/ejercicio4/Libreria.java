package ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Libreria {

	private List<Libro> libros;
	private String direccion;
	private Integer telefono;

	public Libro obtenerLibroMasAntiguo() {
		LocalDate antiguo = LocalDate.now();
		Libro ultimo = new Libro();

		for (Libro libro : libros) {
			if (libro.getFechaEdicion().isAfter(antiguo)) {
				antiguo = libro.getFechaEdicion();
				ultimo = libro;
			}
		}
		return ultimo;
	}

	public Integer obtenerPesoTotalDeLibros() {
		Integer pesoTotal = 0;
		for (Libro libro : libros) {
			if (libro.getTipo().equals(Libro.TIPO_FISICO)) {
				pesoTotal += Fisico.getPeso();
			}
		}
		return pesoTotal;
	}

	public Integer obtenerNumPaginasMedio() {
		Integer pagTotal = 0;
		Integer contador = 0;
		for (Libro libro : libros) {
			pagTotal += libro.getNumPaginas();
			contador++;
		}
		return pagTotal / contador;
	}

}
