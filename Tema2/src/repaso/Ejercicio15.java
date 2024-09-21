package repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
// programa generará de manera aleatoria un número del 0 al 9
		Integer aleatorio = random.nextInt(0, 10);
		Integer num, puntuacion; //Integer puntuacion =10, no haria falta ni contador ni suma
		Integer contador = 1; 
		Integer suma = 0;

		do {
			System.out.println("Adivina el número");//usuario que intente averiguarlo
			num = scanner.nextInt();
			suma += contador; // puntuacion--
			puntuacion = 10 - suma;

			if (num == aleatorio) {//el programa terminará mostrando la puntuación obtenida
				//restando a 10 el número de intentos que el usuario a necesitado.
				System.out.println("Tu puntuación es de: " + puntuacion + " puntos");

			}
			else {
				System.out.println("Número fuera de rango");
			}

		} while (num != aleatorio);//si no lo consigue, seguirá preguntando hasta que lo haga

		scanner.close();
	}

}
