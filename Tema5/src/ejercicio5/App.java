package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SacoNumeros lista = new SacoNumeros();
		try {			
		Integer num;
		
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
		System.out.println("La división es: "+lista.division());
		
		}
		finally {
		
		sc.close();
		System.out.println("Scanner cerrado correctamente");
		}
	}

}
