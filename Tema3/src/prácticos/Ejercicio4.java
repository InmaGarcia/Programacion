package prácticos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// solicitar nº al usuario, los almacene y luego los muestre en el mismo orden
		//1º preguntaremos cuantos nº nos va a decir
		System.out.println("¿Cuántos números va a introducir?");
		Integer indice = scanner.nextInt();
		Integer[] numeros = new Integer[indice];
		
		//2º solicitaremos uno a uno y guardaremos en array
		for(int i = 0; i < indice; i++) {
			System.out.println("Introduce un número");
			Integer num = scanner.nextInt();
			numeros[i] = num;
		}
		//mostrar lista completa a la inversa de como se ha introducido
		System.out.println("los números son: ");
		for (int i = indice-1; i >=0; i--) {
			System.out.print(numeros[i]);
			System.out.print("  ");
		}

		scanner.close();
	}

}
