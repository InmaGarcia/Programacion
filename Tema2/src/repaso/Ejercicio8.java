package repaso;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String txt;
		
		do {
			System.out.println("Introduce un texto");
			txt = scanner.nextLine();
			
			if( txt.startsWith("hola") && txt.endsWith("hastaluego")) {
			   //Integer empieza = txt.indexOf("a");
			   //Integer termina = txt.lastIndexOf("h");
			   String entremedio = txt.substring(txt.indexOf("a")+1, txt.lastIndexOf("h"));
			   System.out.println("Lo he entendido. Mensaje: "+entremedio.trim());
			}
			else {
				System.out.println("No te he entendido. Repitelo.");
			}
		}
		while(!(txt.startsWith("hola") && txt.endsWith("hastaluego")));{
		}
 scanner.close();
	}

}
