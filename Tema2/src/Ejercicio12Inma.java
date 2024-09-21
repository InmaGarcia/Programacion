//package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio12Inma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número mayor que 0");
		int num = scanner.nextInt();
		int i,j;
		
		/*
		 * Inma muy bien, sólo te ha faltado separar el comportamiento de la primera fila, que es distinta al resto. SI te fijas, no debe tener
		 * espacios entre los subrayados. Este for que te pongo sólo se encarga de la primera fila del cuadrado. Despues, iría el for doble para cada 
		 * caracter de la tabla.
		 * 
		  for (int x = 0; x < num; x++) {
			if (x == 0) {
				System.out.print(" __");
			}
			else {
				System.out.print("___");
			}
		}
		  
		 */
						
		for (i = 0; i <= num; i++) {

			for (j = 1; j <= num; j++) {
				if (i == 0) {         /*Este if no iria aqui, ya está contemplado en el for que te he puesto arriba*/
					System.out.print(" _");
			    }
				else {
					System.out.print("|_");
				}
		    }
			
			if(i>=1) {
			System.out.print("|");
			}
			System.out.print("\n");
		}
	
		
		scanner.close();
	}

}    
