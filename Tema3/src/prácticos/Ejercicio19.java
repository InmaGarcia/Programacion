package prácticos;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		// Realiza un programa que cuente el número de veces que aparece la letra ‘a’
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = scanner.nextLine();

		// número palabras que hay en un texto solicitado al usuario
		String[] palabra = frase.split(" ");
		int npalabras = palabra.length;
		Integer suma = 0;
		Boolean contiene = false;

		System.out.println("La frase tiene " + npalabras + " palabras");
		// separar las palavras e contar somente as que tem a
		for (int i = 0; i < palabra.length; i++) {
			contiene = palabra[i].contains("a");
			if (contiene == true) {
				for (int j = 0; j < palabra[i].length(); j++) {
					String letra = palabra[i].substring(j, j + 1);
					letra = letra.toLowerCase();
					Integer comparacion = letra.compareTo("a");
					if (comparacion == 0) {
						suma++;
					}
				}
			}
		}
		System.out.println("Mi frase tiene " + suma + " 'a' ");
		scanner.close();
	}

}
