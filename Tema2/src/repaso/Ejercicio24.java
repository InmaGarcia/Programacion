package repaso;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		Integer num;
		Integer suma = 0;

		do {// solicite un número mayor a 0 al usuario
			System.out.println("Introduce un nº mayor a 0");
			num = scanner.nextInt();

			if (num <= 0) {// no es así, volver a solicitarlo
				System.out.println("Número incorrecto");
			} 
			// calcular la suma de todos los números impares que hay entre 1 y el nº indicado
			else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 !=0) {
						suma += i;
						if (i != num) {
							System.out.print(" "+i + " +");
						} 
						else {
							System.out.print(i);
						}
					}
				}
				System.out.print(" = " + suma);
			}
		} while (num <= 0);// no es así, volver a solicitarlo

		scanner.close();
	}

}
