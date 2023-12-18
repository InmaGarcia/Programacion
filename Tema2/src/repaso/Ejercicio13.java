package repaso;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String txt;
		String suma= "";
		
		do  {
		System.out.println("Introduce una frase");
		txt = scanner.nextLine();
		
		if (!txt.equalsIgnoreCase("fin")) {//condicion para que no aparezca la palabra fin  
		   suma += txt+" ";
		}
		
		}
		while(!txt.equalsIgnoreCase("fin"));
		System.out.println(suma);
		
		scanner.close();
	}

}
