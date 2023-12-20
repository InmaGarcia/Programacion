package prácticos;

import java.util.Scanner;

public class Ejercicio7ArrayInv2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// solicitar nº al usuario, los almacene y luego los muestre en el mismo orden
		//1º preguntaremos cuantos nº nos va a decir
		System.out.println("¿Cuántos números vas a introducir?");
		Integer indice = scanner.nextInt();
		Integer[] numeros = new Integer[indice];
		
		//2º solicitaremos uno a uno y guardaremos en array
		for(int i = 0; i < indice; i++) {
			System.out.println("Dame el número de la posición "+i);
			Integer num = scanner.nextInt();
			numeros[i] = num;
		}
		//mostrar lista completa
		System.out.println("los números son: ");
		for (int i = 0; i < indice; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		//array inverso
		Integer[] inverso = new Integer[indice];
		for (int j = 0, i = indice-1; j < indice ; j++, i-- ) {	
			inverso [j] = numeros[i];
		}
		System.out.println("\nEl array inverso es: ");
		for (int j = 0; j < indice; j++) {
			System.out.print(inverso[j]+" ");
		}

		scanner.close();
	}

}
