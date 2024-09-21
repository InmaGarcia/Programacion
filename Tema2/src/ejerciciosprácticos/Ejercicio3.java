package ejerciciosprácticos;

import java.util.Scanner;

public class Ejercicio3 {

	private static final double NORMAL = 0.21;
	private static final double REDUCIDO = 0.10;
	private static final double SUPERREDUCIDO = 0.04;
	private static final double EXENTO = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// solicitar dos datos al usuario: el precio sin IVA y el tipo de IVA
		System.out.println("¿Cuanto cuesta el articulo sin IVA?");
		Double precioSinIVA = scanner.nextDouble();
		scanner.nextLine();
		// el problema aqui es que el usuario debe escribir la palabra tal cual yo la
		// pongo
		System.out.println("Dime el tipo de IVA: Normal, Reducido, Superreducido o Exento");
		String tipoIva = scanner.nextLine();

		// programa que calcule el IVA de un producto

		if (tipoIva.equals("Normal")) {
			Double iva = precioSinIVA * NORMAL;
			System.out.println("El IVA del articulo es de " + iva + " euros");
		} else if (tipoIva.equals("Reducido")) {
			Double iva = precioSinIVA * REDUCIDO;
			System.out.println("El IVA del articulo es de " + iva + " euros");
		} else if (tipoIva.equals("Superreducido")) {
			Double iva = precioSinIVA * SUPERREDUCIDO;
			System.out.println("El IVA del articulo es de " + iva + " euros");
		} else {
			Double iva = precioSinIVA * EXENTO;
			System.out.println("El IVA del articulo es de " + iva + " euros");
		}

		scanner.close();

	}

}
