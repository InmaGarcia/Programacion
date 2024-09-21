package ejerciciosrepaso;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(Integer i=1; i<=10; i++) {
			System.out.println(i);//esto es el bucle para sacar todos los números
     		
			scanner.nextLine();//este scanner se queda esperando a que el usuario meta algo
			
		}
 scanner.close();
	}

}
