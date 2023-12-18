import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		// Realizar un programa que solicite al usuario su nombre completo
		// A continuación, mostrarle por separado cuál es su nombre, su primer apellido y su segundo apellido.
        // Lo haremos separando por espacios en blanco
		System.out.println("Dime tu nombre completo");
		String nombreCompleto = scanner.nextLine();
	
		
		//sacar el nombre
		Integer primerEspacio = nombreCompleto.indexOf(" ");
		String nombre = nombreCompleto.substring(0,primerEspacio);
		
		//saco el primer apellido
		Integer segundoEspacio = nombreCompleto.lastIndexOf(" ");
		String apellido1 = nombreCompleto.substring(primerEspacio,segundoEspacio);
		apellido1 = apellido1.trim();
		
		//saco el segundo apellido
		String apellido2 = nombreCompleto.substring(segundoEspacio);
		apellido2 = apellido2.trim();
		
		System.out.println("Tu nombre es "+nombre);
		System.out.println("Tu primer apellido es "+apellido1);
		System.out.println("Tu segundo apellido es "+apellido2);
		
		
		scanner.close();
		
	}

}
