package repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//solicitaremos al usuario cuántas veces quiere que lancemos el dado
         System.out.println("Introduce el nº de veces que quieres lanzar el dado");
         Integer intentos = scanner.nextInt();
         
         //simule el lanzamiento de un dado durante N veces
         for(Integer i=1; i<=intentos; i++) {
        	 Integer dado = random.nextInt(1,7);
        	//imprimiremos por consola el resultado de lanzar de manera aleatoria el dado cada una de las veces
        	 System.out.println("Intento "+i+", resultado lanzamiento: "+dado);
         }
   scanner.close();
	}

}
