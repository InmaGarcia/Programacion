package ejerciciosrepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String maquina = "";
		Integer ganadorU = 0;
		Integer ganadorM = 0;
		String continuar="";
		
		do {
		//mensaje indicando... y se quedará esperando a que el usuario indique una de las tres        
		System.out.println("Piedra, papel, tijera... un, dos, tres... ya!!");
		String eleccionUsuario = scanner.nextLine().toLowerCase();
		//palabra completa, pero podrán ser escritas en mayúscula o minúsculas, nos da igual
				
		//el programa generará aleatoriamente su mano
		Integer aleatorio = random.nextInt(1,4);
		//System.out.println(aleatorio); use esta linea para comprobación
		switch(aleatorio) {//molstramos la mano al usuario
		case 1:
			maquina = "piedra";
			System.out.println("Piedra");
			break;
		case 2:
			maquina = "papel";
			System.out.println("Papel");
			break;
		case 3:
			maquina = "tijera";
			System.out.println("Tijera");
			break;
		default:
			System.out.println("Error");
		}
		
		//Por último, indicará quién ha ganado y terminará.
		if (eleccionUsuario.equals(maquina)) {
			System.out.println("Empate");
		}
		else if( eleccionUsuario.equals("piedra") && maquina.equals("tijera") ||eleccionUsuario.equals("papel") && maquina.equals("piedra") ||eleccionUsuario.equals("tijera") && maquina.equals("papel")) {
			System.out.println("Tú ganas");
			ganadorU++;
		}
		else {
			System.out.println("Gana la máquina");
			ganadorM++;
		}
		//al terminar el juego pregunte al usuario si desea otra partida
		System.out.println("¿Quieres jugar de nuevo?");
		continuar = scanner.nextLine().toLowerCase();
		
		//caso negativo, mostrar el marcador final de victorias y terminar. 
		if(continuar.equals("no") && ganadorU<ganadorM ) {
			System.out.println("Perdiste "+ganadorU+" contra "+ganadorM);
		}
		else if(continuar.equals("no") && ganadorM<ganadorU ) {
			System.out.println("¡Ganaste! "+ganadorU+" contra "+ganadorM);
		}
		else {
			
		}
		
		
		}
		while(continuar.equals("si"));//En caso afirmativo, repetir todo el proceso
		
		
		
scanner.close();
	}

}
