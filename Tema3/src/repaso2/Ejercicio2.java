package repaso2;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random random = new Random();

		Integer count = 0;
		Integer[] nums = new Integer[] { 0, 0, 0, 0, 0, 0, };
		Integer suma = 0;
		do {
			Integer aleatorio = random.nextInt(1, 7);

			if (aleatorio == 1) {// se puede hacer con un for
				nums[0] += 1;
			} else if (aleatorio == 2) {
				nums[1] += 1;
			} else if (aleatorio == 3) {
				nums[2] += 1;
			} else if (aleatorio == 4) {
				nums[3] += 1;
			} else if (aleatorio == 5) {
				nums[4] += 1;
			} else if (aleatorio == 6) {
				nums[5] += 1;
			}
			count++;
			suma += aleatorio;
		} while (count < 1000);

		for (int i = 0; i < nums.length; i++) {
			int x = i + 1;
			System.out.println("El " + x + " ha salido: " + nums[i] + " veces");

		}
		System.out.println("Total de los valores obtenidos: " + suma);
	}

}
