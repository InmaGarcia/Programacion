package avanzado;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
    //Programa que transforme un texto escrito por el usuario en nomenclatura camelCase
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = scanner.nextLine();
		frase = frase.toLowerCase();
			
		while(frase.contains(" ")) {//bucle que se repetira mientras la frase tenga espacio
			Integer longitud = frase.length();
			Integer espacio = frase.indexOf(" ");
			String blq1 = frase.substring(0,espacio);
			
			String blq2 = frase.substring(espacio+1, longitud);
			//saco la primera letra del bloque 2, la paso a my y luego la meto
			blq2 = blq2.substring(0,1).toUpperCase()+blq2.substring(1);
			//sumamos el bloque 1 y el bloque 2
			frase = blq1 + blq2;			
		}
		
		System.out.println(frase);
		
	scanner.close();	
	}

}
