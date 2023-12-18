package repaso;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer num;
		Integer primero = 0;
		Integer segundo = 1;
		Integer contador =2;
		Integer suma= 0;
		
		
		do {
			
			System.out.println("Introduce un número");
			num = scanner.nextInt();

			if (num > 2) {
				System.out.print(primero+","+segundo);
				
				while(contador<num)  {
					//System.out.println("Los "+num+" primeros números de la serie fibonacci son: "+fibonacci + y);
					suma= primero+segundo;
					System.out.print(","+suma);
					
					primero= segundo; //primero
					segundo= suma;
					contador++;
				    //suma += contador;	
				}
			} 
			else {
				System.out.println("El número no es válido al ser menor de 2");
			}
		} 
		while (num <= 2);

		scanner.close();
	}

}
