import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Realiza un programa que solicite un número entero al usuario
		// y muestre su tabla de multiplicar completa del 0 al 10 por consola

		System.out.println("Introduce un número entero");
		Integer num = sc.nextInt();
		Integer contador;
         sc.close(); 
		for (contador = 0; contador <= 10; contador++) {
			Integer resultado = num * contador;

			System.out.println(num + " x " + contador + " = " + resultado);
		}

	

	}

}
