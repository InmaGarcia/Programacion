package repaso2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Integer aleatorio = random.nextInt(1, 51);
		Integer num;

		do {
			System.out.println("Introduce un número");
			num = scanner.nextInt();
			if (num > aleatorio) {
				System.out.println("El número aleatorio es menor");
			} else if (num < aleatorio) {
				System.out.println("El número aleatorio es mayor");
			} else {
				System.out.println("Acertaste!");
				break;
			}
		} while (!(num == aleatorio));

		scanner.close();

	}

}
