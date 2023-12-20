package prácticos;

import java.util.Scanner;

public class Ejercicio17CamelCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Programa que transforme un texto escrito por el usuario en nomenclatura
		// camelCase
		System.out.println("Introduce un texto");
		String txt = scanner.nextLine();

		String[] texto = txt.split(" ");

		// recorrer el array y poner mayusculas cada letra a partir de la segunda
		// palabra
		for (int i = 0; i < texto.length; i++) {

			if (i > 0) {// sacar la pimera letra y transformarla en mayusculas
				String letra = texto[i].substring(0, 1);
				String mayuscula = letra.toUpperCase();
				texto[i] = mayuscula + texto[i].substring(1, texto[i].length());// -1
				System.out.print(texto[i]);
			}
			else {
				System.out.print(texto[i].toLowerCase());
			}
			
		}
		scanner.close();
	}
}
