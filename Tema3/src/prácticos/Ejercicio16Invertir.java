package prácticos;

import java.util.Scanner;

public class Ejercicio16Invertir {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//solicite una palabra al usuario y luego la escriba invertida
			System.out.println("Introduce una palabra");
		    String palabra = scanner.nextLine();
		    	
		    String[] invertida = palabra.split("");
		    
		   //invertimos el array
		    for (int j = 0, i = invertida.length-1; j < i; j++, i--) { 						
				String aux = invertida[j]; 
				invertida[j] = invertida[i];
				invertida[i] = aux;	
		    }

		    //imprimimos el array
			for (int i = 0; i < invertida.length; i++) {
			System.out.print(invertida[i]+" ");
			}
		
		
        scanner.close();
	}

}