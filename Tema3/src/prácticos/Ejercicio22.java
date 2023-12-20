package prácticos;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Solicita una palabra al usuario y a continuación deletréala
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce una palabra");
		String palabra = scanner.nextLine();

		String[] letras = palabra.split("");

		for (String deletrear : letras) {
			System.out.println(deletrear);
		}

		scanner.close();
	}

}