package prácticos;

import java.util.Scanner;

public class Ejercicio3 {

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
		//mostrar lista completa
		System.out.println("los números son: ");
		for (int i = 0; i < indice; i++) {
			System.out.print(numeros[i]+" ");
		}

		scanner.close();
	}

}
