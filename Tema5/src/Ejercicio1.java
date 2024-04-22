import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		Integer num;
		List<Integer> numeros = new ArrayList<>();
		do {
			System.out.println("Dame un número");
			num = sc.nextInt();

			if (num != -1) {
				numeros.add(num);
			}

		} while (num != -1);
		System.out.println("Lista :" + numeros);
		}
		finally {
		sc.close();
		System.out.println("Scanner cerrado correctamente");
		}
	}

}
