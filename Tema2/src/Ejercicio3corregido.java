import java.util.Scanner;

public class Ejercicio3corregido {
	
	private static final double NORMAL = 0.21;
	private static final double REDUCIDO = 0.10;
	private static final double SUPERREDUCIDO = 0.04;
	private static final double EXENTO = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// solicitar dos datos al usuario: el precio sin IVA y el tipo de IVA
		System.out.println("¿Cuanto cuesta el articulo sin IVA?");
		Double precioSinIVA = scanner.nextDouble();


		// el problema aqui es que el usuario debe escribir la palabra tal cual yo la pongo
		System.out.println("Dime el tipo de IVA (4, 10, 21, 0)");
		Integer tipoIva = scanner.nextInt();

		// programa que calcule el IVA de un producto
		if (tipoIva == 21) {
			Double iva = precioSinIVA * NORMAL;
			System.out.println("El IVA del articulo es de " + iva);
		}

		else if (tipoIva == 10) {
			Double iva = precioSinIVA * REDUCIDO;
			System.out.println("El IVA del articulo es de " + iva);

		}

		else if (tipoIva == 4) {
			Double iva = precioSinIVA * SUPERREDUCIDO;
			System.out.println("El IVA del articulo es de " + iva);
		}

		else if (tipoIva == 0) {
			Double iva = precioSinIVA * EXENTO;
			System.out.println("El IVA del articulo es de " + iva);
		}
		
		else {
			
			System.out.println("El valor introducido es erroneo");
		}

		scanner.close();


	}

}
