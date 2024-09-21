package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {			
		Integer num;
		SacoNumeros lista = new SacoNumeros();
		do {
			System.out.println("Dame un número");
			num = sc.nextInt();

			if (num != -1) {
				lista.addNumero(num);
			}

		} while (num != -1);
		System.out.println("Lista :" + lista);
		
		do {
			try {
				System.out.println("Dame una posición");
				num = sc.nextInt();
	
				if (num != -1) {
					System.out.println(lista.getNumero(num));
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Solo admite números");
				sc.nextLine();
			}

		} while (num != -1);
		System.out.println("Lista :" + lista);
		}
		finally {
		sc.close();
		System.out.println("Scanner cerrado correctamente");
		}
	}

}
