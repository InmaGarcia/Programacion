package repaso;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
//programa que muestre por consola los números del 1 al 10
		
		for(Integer x=1; x<=10; x++) {
			System.out.print(x);
			scanner.nextLine();
				
		}
		scanner.close();
	}

}
