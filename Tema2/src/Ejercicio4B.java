import java.util.Scanner;

public class Ejercicio4B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer numero;
		Integer suma = 0;
		
		do {
			System.out.println("Introduce un número entero");
			numero = scanner.nextInt();
			suma = suma + numero;
		}
		while (  numero != 0) ;
		System.out.println("Resultado = "+ suma);
		
		scanner.close();
		
	}

}
