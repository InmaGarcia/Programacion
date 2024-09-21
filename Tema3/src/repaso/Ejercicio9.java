package repaso;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Haz un programa que extraiga el texto de un HTML ignorando todas las
		// etiquetas
		// inserte un salto de línea siempre que se imprima texto de una nueva etiqueta
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe tu HTML");
		String txt = scanner.nextLine();

		String[] html = txt.split(">");

		System.out.println("Texto extraido:");
		for (int i = 0; i < html.length; i++) {
			if (html[i].startsWith("<")) {
				// son las etiquetas
			} else {
				Integer quitar = html[i].indexOf("<");
				html[i] = html[i].substring(0, quitar);
				System.out.print(html[i] + "\n");
			}
		}

		scanner.close();
	}
}