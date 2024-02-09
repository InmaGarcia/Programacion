package ejercicio47;

public class App {

	public static void main(String[] args) {
		
		//1. Crea un cliente con dni 12345678X y nombre “Blas de los Montes”. 
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Blas de los Montes");
		cliente1.setDni("12345678X");
		
		//2. Crea una cesta para el cliente anterior. Imprímela 
		CarritoCompra cesta = new CarritoCompra(cliente1);
		System.out.println(cesta);
		
		//3. Crea un artículo de tipo Ropa de 20 euros, 
		//se llame “Poncho”, con talla XL y color azul
		Ropa poncho = new Ropa();
		poncho.setPrecio(20.0);
		poncho.setTalla("XL");
		poncho.setColor("Azul");
		
		//4. Añade el artículo anterior dos veces a la cesta. Imprímela
		cesta.addArticulo(poncho);
		cesta.addArticulo(poncho);		
		System.out.println(cesta);
		
		//5. Crea un artículo de tipo Libro que cueste 15 euros, se llame 
		//“Así habló Zaratustra” del autor “Nietzsche” 
		Libro libro1 = new Libro();
		libro1.setPrecio(15.0);
		libro1.setDescripcion("Así habló Zaratustra");
		libro1.setAutor("Nietzsche");
		
		//6. Añade el artículo anterior una vez a la cesta. Imprímela
		cesta.addArticulo(libro1);
		System.out.println(cesta);
		
		//7. Borra el artículo que aparece en la posición 1 de la cesta. Imprímela 
        cesta.borrarArticulo(1);
        System.out.println(cesta);
        
        //8. Obtén e imprime el precio medio del artículo. 
        System.out.println(cesta.getPrecioMedio());
        
        //9. Vacía la cesta e imprímela.
        cesta.vaciarCesta();
        System.out.println(cesta);
        
        //10. Obtén e imprime el precio medio del artículo
        System.out.println(cesta.getPrecioMedio());

		

	}

}
