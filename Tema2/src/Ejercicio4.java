import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Introduce un número entero");
		Integer numero = scanner.nextInt();
		Integer acumulado = 0;
		acumulado = acumulado + numero;
				
		while ( numero != 0) {
			System.out.println("Introduce un número entero");
			numero = scanner.nextInt();
			acumulado = acumulado + numero;
			System.out.println("La suma de todos los números introducidos es "+acumulado);
		}
			
		scanner.close();
	}

}
