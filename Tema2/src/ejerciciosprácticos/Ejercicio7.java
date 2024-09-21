package ejerciciosprácticos;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		Integer num1, num2;
		
		// Realizar un programa que solicite dos números al usuario.
		//Si los números son iguales, terminar el programa con un saludo.
		do  {
		System.out.println("Introduzca un número");
        num1 = scanner.nextInt();
		System.out.println("Introduce otro número");
		num2 = scanner.nextInt();
		}
	
		// Si no son iguales, volver a pedirlos hasta que lo sean. 
		while (num1 != num2); {
			
		}
		
		System.out.println("Un saludo");
		
		scanner.close();
		
		
	}

}
