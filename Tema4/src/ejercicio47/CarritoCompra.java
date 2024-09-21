package ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	private LocalDate fechaCreacion;
	private LocalDate fechaAct;
	private Cliente cliente;
	private List<Articulo> articulos;

	public CarritoCompra(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.articulos = new ArrayList<>();
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

	public List<Articulo> getArticulos() {
		return articulos;
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
				+" euros, Fecha última actualización: " + fechaAct.format(formato);
	}

	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.fechaAct= LocalDate.now();
	}

	public void borrarArticulo(int posicion) {
		if(posicion>=0 && posicion<this.articulos.size()) {//comprobar que la posicion existen
		articulos.remove(posicion);
		this.fechaAct= LocalDate.now();
		}
	}

	public void vaciarCesta() {
		articulos.clear();
		this.fechaAct= LocalDate.now();
	}

}
