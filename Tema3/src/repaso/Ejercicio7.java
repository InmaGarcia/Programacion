package repaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static final Double PRECIO = 0.24;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//calcule el precio de un telegrama se dictan ,cambiando los puntos por la palabra “STOP”
		//precio se calcula multiplicando el total de palabras por un precio fijo(0,24 €). 
		//Obviamente, la palabra “STOP” no se cuenta
		System.out.println("Escribe tu telegrama usando STOP en vez de .");
		String tlgram = scanner.nextLine();
		String [] palabra = tlgram.split(" ");
		
		Double contador =0.0;
		for(int i=0; i<palabra.length; i++) {
			if(!palabra[i].equalsIgnoreCase("stop")) {
				contador++;
			}		
		}
	
		Double telegram = PRECIO * contador;
		System.out.println();
		System.out.println("El precio es de: "+telegram+"€");
		
		scanner.close();

	}

}
