package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número mayor que 0");
		int num = scanner.nextInt();
		int i,j;
		
		for (i = 0; i <= num; i++) {

			for (j = 1; j <= num; j++) {
				if (i == 0) {
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
