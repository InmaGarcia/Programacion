import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		Integer num;

		System.out.println("Introduce un texto");
		texto = sc.nextLine();
		do {
			System.out.println("¿1 o 2?");
			num = sc.nextInt();

			if (num ==1) {
				System.out.println(Ejercicio1.getMayusculas(texto));
			} else if (num == 2) {
				num=2;
				System.out.println(Ejercicio2.getMinusculas(texto));
			} else {
				System.out.println("Valor erróneo");
			}
		} while (num == 0);

		sc.close();
	}

}
