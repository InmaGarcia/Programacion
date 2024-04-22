package ejercicio9;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean mas = false;
		Persona persona;
		do {
			persona = new Persona();
			try {
				System.out.println("Dime tu género");
				String genero = sc.nextLine();
				persona.setGenero(genero);

				System.out.println("Dime tu altura");
				BigDecimal altura = sc.nextBigDecimal();
				persona.setAltura(altura);
			} catch (InputMismatchException e) {
				System.out.println("La altura es incorrecta");
			}catch (ParametroIncorrectoException e) {
				System.out.println(e.getMessage());
			}
			sc.nextLine();

			System.out.println("¿Introducir más personas?");
			String respuesta = sc.nextLine();

			if (respuesta.equalsIgnoreCase("si")) {
				mas = true;
			} else {
				mas = false;
			}
		} while (mas);
		System.out.println(persona);

		sc.close();
	}

}
