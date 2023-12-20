import java.util.Scanner;

public class ArrayUtils {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un texto");
		String txt = sc.nextLine();

		String[] texto = txt.split(" ");
		imprimirArray(texto);

		System.out.println("\nDime un número");
		Integer num = sc.nextInt();

		System.out.println(obtenerPalabra(texto, num));

		sc.nextLine();
		System.out.println("Escribe una palabra");
		String pal = sc.nextLine();

		System.out.println(buscarPalabra(texto, pal));

		sc.close();
	}

	public static void imprimirArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static String obtenerPalabra(String[] array, Integer num) {
		String cadena = "";
		if (num < array.length) {
			cadena = array[num];
		}
		return cadena;
	}

	public static Integer buscarPalabra(String[] array, String cadena) {
		Integer posicion = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(cadena)) {
				posicion = i;
			}
		}
		return posicion;
	}
}
