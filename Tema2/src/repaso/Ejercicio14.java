package repaso;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String contraseña;
		Integer longitud;
		
		do {//pedirá al usuario una palabra de al menos 8 caracteres
			System.out.println("Introduce una contraseña:");
			contraseña = scanner.nextLine();
			longitud = contraseña.length();
			
			if (longitud < 8) {
				System.out.println("La contraseña introducida es corta");
			}
			else {//cambiará las letras de esa palabra por números
				contraseña = contraseña.replaceAll("a", "4");
				contraseña = contraseña.replaceAll("e", "3");
				contraseña = contraseña.replaceAll("i", "1");
				contraseña = contraseña.replaceAll("o", "0");
				contraseña = contraseña.replaceAll("t", "7");
				System.out.println("Su contraseña es: "+contraseña);//resultado por consola
			}
			
		}
		while(longitud < 8); //volverá a pedir otra hasta que el usuario indique una de longitud 8

		scanner.close();
	}

}
