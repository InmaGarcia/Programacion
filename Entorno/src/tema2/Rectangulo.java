package tema2;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la base del rectángulo");
		Integer b = sc.nextInt();
		System.out.println("Dime la altura del rectángulo");
		Integer h = sc.nextInt();
		Integer formula, menu;

		do {
			System.out.println("Elige una opción:");
			System.out.println("1.Calcular el área\n2.Calcular el perímetro\n3.Salir");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				formula = b * h;
				System.out.println("El área del rectangulo es: " + formula + "\n");
				break;
			case 2:
				formula = (b + h) * 2;
				System.out.println("El perimetro del rectangulo es: " + formula + "\n");
				break;
			case 3:
				System.out.println("Adiós");
				break;
			}
		} while (menu != 3);

		sc.close();

	}
}
