package ejerciciosprácticos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String username;
		Integer longitud;
		Boolean condiciones = false;
		Boolean long10 = false;
		Boolean espacios = false;
				
		//solicitemos el username de un usuario para registrarse y validar este dato del siguiente modo:
		//Quitaremos los espacios que tenga al inicio y al final. Pondremos todo en mayúsculas
		//Si la longitud es inferior a 10 caracteres, indicaremos un error y volveremos a solicitar nuevo username
		//Si contiene algún espacio en blanco, indicaremos un error y volveremos a solicitar
		//Si todo está correcto, mostraremos el username final tras aplicar el algoritmo y terminamos el programa
		
     do {
    	 System.out.println("Introduzca un Username");
    	 username = scanner.nextLine();
    	 username = username.trim();
    	 username = username.toUpperCase();
    	 longitud = username.length();
    	 long10 = longitud < 10;
    	 espacios = username.contains(" ");
    	 condiciones = long10 && espacios;
    	 
    	 if (condiciones) { 
    		 //if(!condiciones), mis condiciones son longitud menor de 10 y tener espacios, al poner ! delante estaba permitiendo que todo lo que no cumpliera
    		 // las condiciones entrara como incorrecto y volviera a solicitarlo, cuando debe ser lo contrario
    		 System.out.println("Username erróneo");
    	 }    	
    	 else {
    		 System.out.println("Su username es: "+username);
    	 }   	    	
     }
     while (condiciones);     
     scanner.close();
     //Como conlcusión,este código es corto,pero habrá códigos que tengan muchas vueltas y variables, poder ver los valores que toman
     // esas variables, qué esta entrando en el bucle, si se da o no algo que queremos... el poder ver que esta haciendo linea por linea, nos ayudará a ver 
     // donde dejo de hacer lo que debia y el porque no lo hizo. También creo que es una manera de evitar el bloqueo cuando no ves que le pasa, el porqué no sale 
     // cuando lo que ves en tu cabeza tiene sentido.
     
	}

}
