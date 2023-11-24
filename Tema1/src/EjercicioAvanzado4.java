import java.util.Scanner;

public class EjercicioAvanzado4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* Realiza un programa que solicite al usuario su número favorito. A continuación, debe solicitar
		*su ciudad favorita
		*/
		
		System.out.println("Introduce tu número favorito");
		scanner.nextInt();
		// solución
		scanner.nextLine();
		
		System.out.println("Dime tu ciudad favorita");
		scanner.nextLine();
		
		//¿Algo no te funciona? ¿Qué ha pasado? Intenta arreglarlo buscándote la vida…
		
		scanner.close();

	}

}
