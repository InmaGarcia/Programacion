import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Realizar un programa que solicite dos números al usuario. 
		//Si los números son iguales, terminar el programa con un saludo. 
		//Si no son iguales, volver a pedirlos hasta que lo sean.
		
		Scanner scanner = new Scanner(System.in);
		
		Integer num1, num2;
		
		do {
			System.out.println("Introduzca un número");
			num1 = scanner.nextInt();
			System.out.println("Introduzca un otro número");
			num2 = scanner.nextInt();
		}
		while (num1 != num2); {
			
		}

     System.out.println("Un saludo");
     
     scanner.close();
	}

}
