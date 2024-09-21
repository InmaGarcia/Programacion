package ejercicio42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Crea dos equipos con al menos 3 jugadores cada uno. Solicitando los datos
		// al usuario. Designa al capitán de cada equipo (será el primer jugador
		// indicado).
		// Cuando los tengas, imprime los equipos por consola.
		List<Jugador> jugadores = new ArrayList<>();
		
		System.out.println("Dime el nombre del equipo");
		String nombreE = sc.nextLine();
		Equipo equipo= new Equipo(nombreE);
			
		
			 
			    			    
			
			

		sc.close();
	}
	private static void cargarJugadores(Scanner scanner, Equipo equipo) {
	     for (int i=0; i<3; i++) {
		     System.out.println("Dime el nombre del jugador");
		     String nombreJ= scanner.nextLine();
		     System.out.println("Dime el dorsal del jugador");
		     Integer dorsal= scanner.nextInt();			    
			
		     Jugador jugador = new Jugador(nombreJ, dorsal);
	         equipo.getJugadores().add(jugador);
	    
		  if(i==0) {
		    equipo.setCapitan(jugador);
		   }
	 }
	}

}
