package repaso;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String txt;
		Boolean condiciones= false;
		
		do {
			System.out.println("Introduce un texto");
			txt = scanner.nextLine();
			
			if( txt.startsWith("hola") && txt.endsWith("hastaluego")) {
			   Integer empieza = txt.indexOf("a");
			   Integer termina = txt.lastIndexOf("h");
			   String entre = txt.substring(empieza+1, termina);
			   System.out.println("Lo he entendido. Mensaje: "+entre.trim());
			   condiciones = true;
			}
			else if (txt.startsWith("hola") && txt.endsWith("adiós")) {
				   Integer empieza = txt.indexOf("a");
				   Integer termina = txt.lastIndexOf("a");
				   String entre = txt.substring(empieza+1, termina);
				   System.out.println("Lo he entendido. Mensaje: "+entre.trim());
				System.out.println("adiós");
				condiciones = false;
			}
			else {
				System.out.println("No te he entendido. Repitelo.");
				condiciones = true;
			}
			
		}
		while(condiciones);{
		}
 scanner.close();
	}

}
