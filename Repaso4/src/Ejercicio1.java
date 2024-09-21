import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String test = sc.nextLine();
		
		String texto = getMayusculas(test);
		System.out.println(texto);

		sc.close();
			
	}

	public static String getMayusculas(String cadena) {
		return cadena.trim().toUpperCase();
	}
}
