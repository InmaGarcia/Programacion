import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		Integer num = 0;

		System.out.println("Introduce un texto");
		texto = sc.nextLine();
		do {
			System.out.println("¿Mayuscula o minuscula?");
			String resultado = sc.nextLine();

			if (resultado.equalsIgnoreCase("mayuscula")) {
				num = 1;
			} else if (resultado.equalsIgnoreCase("minuscula")) {
				num = 2;

			} else {
				System.out.println("Valor erróneo");
			}
		} while (num == 0);

		System.out.println(getMayMin(texto, num));

		sc.close();
	}

	public static String getMayMin(String texto, Integer num) {
		if (num == 1) {
			return texto.toUpperCase().trim();
		} else {
			return texto.toLowerCase().trim();
		}
	}

}
