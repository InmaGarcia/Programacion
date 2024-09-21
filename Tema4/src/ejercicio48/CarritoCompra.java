package ejercicio48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class CarritoCompra {

	private LocalDate fechaCreacion;
	private LocalDate fechaAct;
	private Cliente cliente;
	private Set<Articulo> articulos;

	public CarritoCompra(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.articulos = new HashSet<>();
		this.fechaCreacion = LocalDate.now();
		this.fechaAct = LocalDate.now();
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getfechaAct() {
		return fechaAct;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Integer getCantidad() {
		return articulos.size();
	}

	public Double getTotal() {
		Double total = 0.0;
		for (Articulo articulo : articulos) {
			total += articulo.getPrecio();
		}
		return total;
	}

	public Double getPrecioMedio() {
		if (getCantidad() == 0) {
			return 0.0;
		}
		return getTotal() / getCantidad();

	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return "cliente: " + cliente + ", articulos: " + getCantidad() + ", Total a pagar: " + getTotal()
				+ " euros, Fecha última actualización: " + fechaAct.format(formato);
	}

	public void addArticulo(Articulo articulo) {
		if(articulos.add(articulo)) {//add y remove devuelve un boolean
		this.fechaAct = LocalDate.now();
		}
	}

	public void borrarArticulo(Articulo articulo) {
//no tengo que preguntar si existe el objeto porque el remove es de tipo boolean
				articulos.remove(articulo);
				this.fechaAct = LocalDate.now();
	}

	public void vaciarCesta() {
		articulos.clear();
		this.fechaAct = LocalDate.now();
	}

}
