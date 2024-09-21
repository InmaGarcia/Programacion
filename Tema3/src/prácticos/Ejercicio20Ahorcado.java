package prácticos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio20Ahorcado {

	public static void main(String[] args) {
		// programa con el que poder jugar al Ahorcado
		Scanner scanner = new Scanner(System.in);

		// Crea un array que contenga 10 palabras
		String[] ahorcado = new String[10];
		ahorcado[0] = "azulejo";
		ahorcado[1] = "tenedor";
		ahorcado[2] = "satamontes";
		ahorcado[3] = "carretilla";
		ahorcado[4] = "molinero";
		ahorcado[5] = "sofisticado";
		ahorcado[6] = "terremoto";
		ahorcado[7] = "culinario";
		ahorcado[8] = "teclado";
		ahorcado[9] = "primavera";

		// elegimos la palabra con la que vamos a jugar
		Random random = new Random();
		Integer i = random.nextInt(0, 10);

		// pasamos esa palabra a array
		String[] resultado = ahorcado[i].split("");

		// Creamos otro array para el juego vacio menos por la primera letra
		String[] juego = new String[ahorcado[i].length()];
		juego[0] = resultado[0];

		for (int j = 1; j < juego.length; j++) {
			juego[j] = " _";
		}

		Integer intentos = 10;
		Boolean contiene = false;
		Boolean cambio = false;
		Boolean iguales = false;
		do {
			for (int j = 0; j < juego.length; j++) {
				System.out.print(juego[j]);
			}
			System.out.println();
			System.out.println("Introduce una letra");
			String letra = scanner.nextLine();

			//for (int j = 0; j < resultado.length; j++) {
				contiene = ahorcado[i].contains(letra);

				if (contiene == false) {
					intentos--;
					System.out.println("Te quedan " + intentos + " vidas");
				} 
				else {
					for (int j = 0; j < resultado.length; j++) {
						cambio = resultado[j].equals(letra);
						if (cambio == true) {
							juego[j] = letra;
						}
					
				    }
			     }
				for (int j = 0; j < juego.length; j++) {
					iguales = juego[j].equals(resultado[j]);
				}
				
		} while (intentos < 10|| iguales==true);

		if (intentos >= 10) {
			System.out.println("GAMEOVER");
		} else {
			for (int x = 0; x < juego.length; x++) {
				System.out.println(" " + juego[x]);
			}
		}

		scanner.close();
	}

}
