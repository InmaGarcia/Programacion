package prácticos;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Realizar un programa que solicite al usuario su nombre completo
		// A continuación, mostrarle por separado cuál es su nombre, su primer apellido y su segundo apellido.
        // Lo haremos separando por espacios en blanco
		System.out.println("Dime tu nombre completo");
		String nombre = scanner.nextLine();
	
		String[] nombreCompleto = nombre.split(" ");
	
			System.out.println("Nombre: "+nombreCompleto[0]);
			System.out.println("Apellido1: "+nombreCompleto[1]);
			System.out.println("Apellido2: "+nombreCompleto[2]);
		
			for (int i = 0; i < nombreCompleto.length; i++) {
				System.out.print(nombreCompleto[i]);
			}
		scanner.close();
		
	}

}
