package prácticos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] palabras = new String[3];
		
		for (int i =0; i<palabras.length ; i++)  {
			System.out.println("Introduce una palabra");
			String palabra = scanner.nextLine();
			palabras [i] = palabra;
			
		}
		//concatenar las palabras
		String frase= "";
		for (int i =0; i<palabras.length ; i++)  {
			frase+=palabras [i];
		}
		System.out.println(frase);
        scanner.close();
	}

}
