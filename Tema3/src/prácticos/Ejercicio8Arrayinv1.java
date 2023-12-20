package prácticos;

import java.util.Scanner;

public class Ejercicio8Arrayinv1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// solicitar nº al usuario, los almacene y luego los muestre en el mismo orden
		//1º preguntaremos cuantos nº nos va a decir
		System.out.println("¿Cuántos números va a introducir?");
		Integer indice = scanner.nextInt();
		Integer[] numeros = new Integer[indice];
		int j, i, aux;
		//2º solicitaremos uno a uno y guardaremos en array
		for(i = 0; i < indice; i++) {
			System.out.println("Introduce un número");
			Integer num = scanner.nextInt();
			numeros[i] = num;
			scanner.close();
		}
		//mostrar lista completa
		System.out.println("Los números de mi array son: ");
		for (i = 0; i < indice; i++) {
			System.out.print(numeros[i]+" ");
		}
		for (j = 0, i = indice-1; j < i; j++, i--) {//el j<i hace que cambie el array hasta la mitad 
			//ya que los ultimos los cambiamos en el mismo movimiento						
			aux = numeros[j]; 
			numeros[j] = numeros[i];
			numeros[i] = aux;			
		}
		
		System.out.println("\nLos números de mi array son: ");
		for (j = 0; j < indice; j++) {
			System.out.print(numeros[j]+" ");
		}
		System.out.println();
		
		
	}
	
}
