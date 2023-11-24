import java.util.Scanner;

public class Ejercicio4 {

	public static final int ACTUAL = 2023;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Mostrar un mensaje pidiendo el año de nacimiento del usuario
		System.out.println("Digame el año en el que naciste");
		// Esperar a que el usuario conteste
		int nacimiento = scanner.nextInt();
		/*
		 * Mostrar un nuevo mensaje indicando la edad del usuario calculada restando el
		 * año actual al año indicado por el usuario
		 */
		int edad = ACTUAL - nacimiento;
		System.out.println("Su edad es " + edad);

		scanner.close();

	}

}
