package repaso2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime la dimensión del cuadrado");
		Integer dim = scanner.nextInt();

		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				if (i == 0 || j == 0 ||i == dim - 1 || j == dim - 1) {
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		scanner.close();
	}

}
