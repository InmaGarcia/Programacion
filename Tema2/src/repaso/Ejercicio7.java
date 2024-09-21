package repaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer multiplo;
		Integer suma =0;
		
		do {
			System.out.println("Introduce un número");
			multiplo = scanner.nextInt();
			if(multiplo<=0 || multiplo > 10) {//numero fuera rango 1 al 10
				System.out.println("El número debe estar entre el 0 y el 10");
			}
			else if ( multiplo != 0) { //esta dentro del rango 1 al 10
				
				for (int i =1; i<= 10;i++) { //creamos la tabla de multiplicar
					Integer numero = i*multiplo;//multiplo entra por consola e i va desde 1 creciendo 1 a 1 
					suma = suma + numero;
					if (i == 10) {
						System.out.print(numero+" = ");
					}
					else {
						System.out.print(numero +" + ");
					}
				}
				System.out.println(suma);
			}
		}
		while (multiplo != 0);// multiplo distinto a 0 repetimos bucle, multiplo = 0 salimos del blucle
		
		
		scanner.close();
  }
}