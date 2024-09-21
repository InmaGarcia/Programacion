package repaso;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer resultado, eleccion;
		
		//pedirle al usuario dos números
		System.out.println("Introduce un número entero");
		Integer num1 = scanner.nextInt();
		
		System.out.println("Introduce otro número");
		Integer num2 = scanner.nextInt();
		
		do {
		 //mostrar un menú
		System.out.println("*** MENÜ ***\n  1. Sumar\n  2. Restar\n  3. Multiplicar\n  4. Dividir\n  0. Salir\n Elige opción:");
		eleccion = scanner.nextInt();
		//hacer la operación elegida, mostrar el resultado
		//Repetir el menú en los casos 1, 2, 3 o 4
		//Salir en la opcion 0
		if (eleccion == 1) {
			resultado = num1 + num2;
			System.out.println("el resultado es: "+resultado);
		
		}
		else if (eleccion == 2) {
			resultado = num1 - num2;
			System.out.println("el resultado es: "+resultado);
			
		}
		else if (eleccion == 3) {
			resultado = num1 * num2;
			System.out.println("el resultado es: "+resultado);
			
		}
		else if (eleccion == 4) { //nose puede dividir sie l número 2 es 0
			if (num2 == 0) {
				System.out.println("No se puede dividir entre 0");
			}
			else {
			resultado = num1 / num2;
			System.out.println("el resultado es: "+resultado);
			}
			
		}
		else if (eleccion == 0){
			
		}
		else {// por si el usuario pone un número que no vaya del 0 al 4
			System.out.println("Elección incorrecta. Elige una nueva opción");
		}
		}
		while (eleccion !=0);
				
		System.out.println("Bye bye");
		scanner.close();

	}

}
