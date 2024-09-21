import java.util.Scanner;

public class Ejercicio6 {
	
    public static final double IVA = 0.21;
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Solicita por consola al usuario cuál es el precio sin IVA del artículo (puede llevar decimales)
		System.out.println("Dígame el precio sin IVA del móvil");
        //Recoge el dato y calcula el IVA (21%)
		double precioSinIva = scanner.nextDouble();
		double iva = precioSinIva * IVA;
		double precioConIva = precioSinIva + iva;
		
		//Muestra como resultado en la consola el IVA calculado y el precio final (la suma del precio sin IVA más el IVA) 
        System.out.println("El precio final del móvil es de "+precioConIva);
        
        scanner.close();
	}

}
