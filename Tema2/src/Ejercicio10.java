import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Realizar un programa que solicite dos cadenas al usuario por separado.
		//Si alguna de las dos es vacía o sólo tiene espacios en blanco, volver a pedirla indefinidamente
		//Cuando tengamos las dos cadenas, escribirlas por consola en orden alfabético. 
		String frase1, frase2;
		Integer comparando;
		
		do {
			System.out.println("Introduce una frase");
		
		frase1 = scanner.nextLine();
		
		System.out.println("Introduce otra frase");
		frase2 = scanner.nextLine();
		}
		
		while (frase1.isBlank() || frase2.isBlank());{
		}
		  comparando = frase1.compareTo(frase2);
			if (comparando >0) {
				System.out.println("Orden correcto primero :"+frase2+", segundo va: "+frase1);
			}
			else if (comparando <0) {
				System.out.println("Orden correcto primero :"+frase1+", segundo va: "+frase2);
			}
			else if (comparando == 0) {
				System.out.println("Las dos van en la misma posición");
			}
			
			scanner.close();
	}

}
