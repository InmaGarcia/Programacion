import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String email;
		Boolean arroba = false;
		Boolean posicionPunto = false;
		Boolean terminaPunto = false;
		Boolean condiciones = true;
		Boolean punto = false;

		// Realizar un programa que solicite un email. A continuación, debemos validar
		// el formato de ese
		// email. Si es correcto, terminamos. Si no es correcto, volvemos a solicitarlo.
		// Para validar el email tendremos que revisar que:

		do {

			System.out.println("Introduce tu email");
			email = scanner.nextLine();
			
//CADA CONDICION PUEDE SER UN IF Y ELSE IF Y FUNCIONA CON UNA UNICA VARIABLE QUE PASA POR TODAS LAS CONDICIONES
			
			// a) Contiene una @
			arroba = email.contains("@");
			
			//cojo la parte de la arroba hasta el final
			Integer indiceArroba = email.indexOf("@");
			String subcadena = email.substring(indiceArroba+ 1);

			// b) Contiene un punto después de la @, 
			punto = subcadena.contains(".");
			
			//pero no inmediatamente después.
			posicionPunto = email.contains("@.");
			

			// c) No puede terminar con el punto
			terminaPunto = email.endsWith(".");

			condiciones = arroba && !posicionPunto && !terminaPunto && punto;

			if (!condiciones) {

				System.out.println("Email incorrecto");

			}

			else {
				System.out.println("Email correcto");
			}

		}

		while (!condiciones);

		scanner.close();

	}

}