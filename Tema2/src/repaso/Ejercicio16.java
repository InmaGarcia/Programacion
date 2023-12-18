package repaso;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//e solicite al usuario una palabra por consola
		System.out.println("Escribe una palabra");
		String palabra = scanner.nextLine();
		int longitud = palabra.length();
		int x =0; //posicion primera letra
		

		while(x < longitud ) {//mientras mi posicion x sea menor a longitud repetimos el bucle. 
			//Recordemos que la longitud es realmente la longitud -1
			System.out.println(palabra.substring(x, x+1));//s letras de esa palabra en cada línea
		    x++; //avanzamos en las posiciones para sacar todas las letras
			
		}
		scanner.close();
	}

}
