import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Realizar un programa que solicite un texto por teclado
		System.out.println("Introduce una texto");
		String txt = scanner.nextLine();
		// cojemos la primera vez del 0 al 4
		Integer x = 0;
		Integer y = 5;
		// hasta que completemos el tamaño del texto
		Integer longitud = txt.length();

		while (y <= longitud) {
			System.out.println(txt.substring(x, y));
			x = y;
			y = y + 5;
			
		}
		

		scanner.close();

	}

}
