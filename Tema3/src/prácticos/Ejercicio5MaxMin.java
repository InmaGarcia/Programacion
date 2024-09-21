package prácticos;

import java.util.Scanner;

public class Ejercicio5MaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// solicitar nº al usuario, los almacene y luego los muestre en el mismo orden
		// 1º preguntaremos cuantos nº nos va a decir
		System.out.println("¿Cuántos números va a introducir?");
		Integer indice = scanner.nextInt();
		Integer[] numeros = new Integer[indice];
		Integer suma = 0;

		// 2º solicitaremos uno a uno y guardaremos en array
		for (int i = 0; i < indice; i++) {
			System.out.println("Introduce un número");
			Integer num = scanner.nextInt();
			numeros[i] = num;
			suma += num;
		}
		// mostrar lista completa
		System.out.println("los números son: ");
		for (int i = 0; i < indice; i++) {
			System.out.print(numeros[i]+" ");
       
		}
		//mostar máximo y el mínimo (y en qué posición están) y calcular la media
		
		int max = numeros[0];
		int min = numeros[0];
		int posmax = 0;
		int posmin =0;
		for(int i=1; i<indice;i++) {
			
			if(numeros[i]>max) {
				max= numeros[i];
				posmax = i;
			}
			if(numeros[i]<min) {
				min= numeros[i];
				posmin = i;
			}
		}
	
		// for ( i =0 
		Integer media = suma / indice;
		System.out.println("\nLa media de estos números es de: "+media);
		System.out.println("Mi máximo es: "+max+" que está en la posición: "+posmax); 
		System.out.println("Mi mínimo es: "+min+" que está en la posición: "+posmin);
		scanner.close();
	}

}