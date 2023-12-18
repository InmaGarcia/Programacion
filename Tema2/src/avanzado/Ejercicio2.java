package avanzado;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	
		Integer num;
		
		do {
			System.out.println("Introduce un número de filas y columnas");
			num = scanner.nextInt();			
		}
		while(num<=0);
		
		for(Integer x=1; x<=num; x++) {
			for(Integer y=1; y<=num; y++) {
				if(x==y || x+y==6) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
