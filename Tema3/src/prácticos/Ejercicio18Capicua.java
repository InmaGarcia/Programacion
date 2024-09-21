package prácticos;

import java.util.Scanner;

public class Ejercicio18Capicua {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		// Realizar un programa que solicite al usuario un número e indique si es o no es capicúa.
        System.out.println("Introduce un número");
        String numero = scanner.nextLine();
        
        //separar el numero en array
        String [] numeros = numero.split("");
        Integer capicua = 0;
        Integer suma = 0;
        
        //comparar valores array sabiendo que si es capicua em primero es igual al ultimo y asi
        for(int j=0, i =numeros.length-1; j<i; j++, i--) {
        	capicua = numeros[j].compareTo(numeros[i]);
        	suma +=capicua;
        	
        }
        if(suma == 0) {
    		System.out.println(numero+" es capicua");
    	}
    	else {
    		System.out.println(numero+" no es capicua");
    	}
    	
        scanner.close();
	}

}
