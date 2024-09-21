import java.util.Scanner;

public class Ejercicioavanzado3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* Repite el ejercicio anterior, pero con la restricción de que sólo podrás leer desde el teclado
		*datos de tipo String. Es decir, sólo podrás usar el método “nextLine()” del Scanner.
		*/
		System.out.println("Introduce un número entero");
		String numero1 = scanner.nextLine();
		System.out.println("Introduce un segundo número entero");
		String numero2 = scanner.nextLine();
		
		//PISTA: Tendrás que aplicar una conversión de tipos. 
		Integer num1 = Integer.parseInt(numero1);
		Integer num2 = Integer.parseInt(numero2);
		
		Integer multiplicacion = num1*num2;
		System.out.println("El resultado de la multiplicación de ambos números es "+multiplicacion);
		
		scanner.close();


	}

}
