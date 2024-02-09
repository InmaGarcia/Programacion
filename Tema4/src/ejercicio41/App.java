package ejercicio41;

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
		
		for (int i=0; i<2; i++) {
		System.out.println("Dime el nombre del equipo");
		String nombreE = sc.nextLine();
		Equipo equipo = new Equipo(nombreE);
		
		List<Jugador> jugadores = new ArrayList<>();

	     for (int j=0; j<3; j++) {
		     System.out.println("Dime el nombre del jugador"+j);
		     String nombreJ= sc.nextLine();
		     System.out.println("Dime el dorsal del jugador"+j);
		     Integer dorsal= sc.nextInt();			    
			
		     Jugador jugador = new Jugador(nombreJ, dorsal);
	         equipo.getJugadores().add(jugador);
	    
		     if(i==0) {
		        equipo.setCapitan(jugador);
		      }
	     }
	     
		}
			    			    
			
			

		sc.close();
	}
	

}
