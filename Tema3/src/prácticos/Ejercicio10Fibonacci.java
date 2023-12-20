package prácticos;

import java.util.Scanner;

public class Ejercicio10Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer indice;
//Crea un array de un tamaño que sea indicado por el usuario tendrá que ser mayor a 2
		do{
			System.out.println("Dime el tamaño de mi Array");
		    indice = scanner.nextInt();
		    
		    if (indice <=2) {
		    	System.out.println("Valor erróneo");
		    }
		    
		}
		while(indice <=2);
		
		Integer[] fibonacci = new Integer[indice];
//llena el array con la serie de Fibonacci, dos primeras posiciones del array las puedes 
		//llenar a mano con un 0 y un 1
		
			fibonacci [0]= 0;
			fibonacci [1]= 1;
//debes llenar con un bucle que vaya calculando el valor de la posixion i a partir de las anteriores				
		for (int i= 2; i < indice; i++) {
			fibonacci[i]= fibonacci[i -1] + fibonacci[i -2] ;	
	 
		 }
//imprime el contenido del array para mostrarlo al usuario. 

			for (int i = 0; i < indice; i++) {
			System.out.print(fibonacci[i]+" ");
			}
		
		
        scanner.close();
	}

}
