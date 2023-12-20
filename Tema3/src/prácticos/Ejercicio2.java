package prácticos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] resultado = new Integer[6];
		
        // solicite un número al usuario
		System.out.println("Introduce un número");
		Integer num = scanner.nextInt();
        //pedir los 5 siguientes
		for (int i = 0; i < 6; i++) {
			Integer cuadrado = num * num;
			//guardar en un array el cuadrado de ese número
			System.out.println("Mi array [" + i + "] es: " + (resultado[i] = cuadrado));
			num++;
		}

		System.out.println("Bye bye");
		scanner.close();
	}

}
