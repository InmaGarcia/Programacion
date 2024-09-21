package prácticos;

import java.util.Scanner;

public class Ejercicio15Web {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Solicitar al usuario una dirección web que tendrá este formato:
		//PROTOCOLO://PARTE1.PARTE2.PARTE3
		System.out.println("Introduce una dirección web");
		String web = scanner.nextLine();
	    //utilizando un array y la función Split.
		String[] array1 = web.split("//");
		array1[0] = array1[0]+"//";
		System.out.println(array1[0]);
		String web2 = array1[1];
		String[] array2 = web2.split("\\.");
		for (int i =0; i< array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		scanner.close();
		
	}

}

