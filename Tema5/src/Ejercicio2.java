import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		List<Integer> numeros = new ArrayList<>();
		try {
			do {
				System.out.println("Dame un número");
				try {num = sc.nextInt();
				if (num != -1) {
					numeros.add(num);
				}
				}catch (InputMismatchException e) {
					System.out.println("Error: has introducido una letra y es un numero");
					sc.nextLine();
				}
			}

			while (num != -1);
			System.out.println("Lista :" + numeros);
			
		}finally {
		sc.close();
		System.out.println("Scanner cerrado correctamente");
	}
	}
}
