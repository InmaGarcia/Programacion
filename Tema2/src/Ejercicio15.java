import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ejercicio 14 pero con while
		System.out.println("Introduce un número entero");
		Integer num = scanner.nextInt();
		Integer contador = 0;

		while (contador <= 10) {
			Integer resultado = num * contador;

			System.out.println(num + " x " + contador + " = " + resultado);
			contador++;
		}

		scanner.close();
	}

}
