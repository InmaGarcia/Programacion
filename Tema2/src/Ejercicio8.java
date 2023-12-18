import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Repetir el ejercicio anterior, pero con cadenas.
		// Además, cuando comparemos si son iguales, no
		// tendremos en cuenta ni los espacios que pueda haber al inicio o al final de
		// cada cadena, ni tampoco las mayúsculas o minúsculas.
		Scanner scanner = new Scanner(System.in);

		String cad1, cad2;
		
		
		do {
			System.out.println("Introduzca una palabra:");
			cad1 = scanner.nextLine();
			cad1 = cad1.trim();
			System.out.println("Introduzca otra palabra:");
			cad2 = scanner.nextLine();
			cad2 = cad2.trim();
			
		} while (!cad1.equalsIgnoreCase(cad2));

		System.out.println("Un saludo");

		scanner.close();

	}

}
