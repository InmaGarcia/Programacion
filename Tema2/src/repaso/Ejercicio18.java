package repaso;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = scanner.nextLine();

		for(int i = palabra.length();i>0 ; i--) {//mientras mi longitud de palabra sea mayor a 0
			//restamos en las posiciones para sacar todas las letras
			
			System.out.print(palabra.substring(i-1, i));// letras de esa palabra en cada línea			
		}
				
        scanner.close();
	}

}
