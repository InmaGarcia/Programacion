import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String test = sc.nextLine();
		
		String texto = getMinusculas(test);
		System.out.println(texto);

		sc.close();
	}

	public static String getMinusculas(String test) {
      return test.trim().toLowerCase();
	}
}
