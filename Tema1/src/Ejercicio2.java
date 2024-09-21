import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Mostrar un mensaje pidiendo el nombre del usuario
		System.out.println("Dime tu nombre por favor");
		
		// Esperar a que el usuario escriba su nombre
		String nombre = scanner.nextLine();
		
		// Mostrar un nuevo mensaje indicando: “Bienvenido (nombre)”
		System.out.println("Bienvenido " + nombre);
		
		// Mostrar un nuevo mensaje indicando: “¿De dónde eres?”
		System.out.println("¿De donde eres?");
		
		// Esperar a que el usuario escriba el lugar de donde vive
		String localidad = scanner.nextLine();
		
		// Mostrar un mensaje preguntando: “¿Qué tal se vive en (localidad)?”
		System.out.println("¿Que tal se vive en " + localidad + "?");
		
		// Esperar a que el usuario escriba una respuesta
		scanner.nextLine(); //no ponemos variable porque no usaremos más adelante la respuesta del usuario, solo scanner
		
		// Mostrar un último mensaje indicando “Gracias. Un saludo”
		System.out.println("Gracias.Un saludo");

		scanner.close();

	}

}
