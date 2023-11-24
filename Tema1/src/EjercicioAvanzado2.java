import java.util.Scanner;

public class EjercicioAvanzado2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Realiza un programa que solicite dos números enteros y los multiplique. 
		System.out.println("Introduce un número entero");
		Long numero1 = scanner.nextLong();
		System.out.println("Introduce un segundo número entero");
		Long numero2 = scanner.nextLong();
		
		Long multiplicacion = numero1*numero2;
		//Mostrará el resultado de esa multiplicación.
		System.out.println("El resultado de la multiplicación de ambos números es "+multiplicacion);
		//Prueba a introducir números muy grandes. ¿Qué ocurre? ¿Cómo podemos resolverlo?
		
		
		scanner.close();

	}

}
