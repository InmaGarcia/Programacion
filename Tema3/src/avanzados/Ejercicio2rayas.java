package avanzados;

import java.util.Scanner;

public class Ejercicio2rayas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// jugar al 3 en raya utilizando un array de 3x3
		String[][] tablero = new String[3][3];
//Mostrar el tablero por consola 
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = " _ ";
			}
		}
		Integer jugador = 1;
		Boolean tresEnRaya = false;
		Integer suma = 0;
		do {
			// Pedir coordenadas donde el jugador 1 quiere poner su ficha y colocarla
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero.length; j++) {
					System.out.print(tablero[i][j]);
				}
				System.out.println();
			}
			System.out.println("Jugador " + jugador);
			System.out.print("Dime y ");
			Integer i = scanner.nextInt();
			System.out.print("Dime x ");
			Integer j = scanner.nextInt();
			// comprobar si esa coordenada ya está ocupada
			if (tablero[i][j].equals(" X ") || tablero[i][j].equals(" O ")) {
				System.out.println("Ocupada");// En tal caso, pedir otra correcta.
			} 
			else {// Volver a mostrar el tablero actualizado. Pedir al jugador 2
				if (jugador % 2 != 0) {
					tablero[i][j] = " X ";
					jugador++;
				} 
				else {
					tablero[i][j] = " O ";
					jugador--;
				}
			}
			// Comprobar si hay 3 en raya.
			if (suma > 5) {
				for (int x = 0; x < tablero.length; x++) {
					for (int y = 0; y < tablero.length; y++) {
						if (tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[0][0].equals(tablero[0][1]) && tablero[0][1].equals(tablero[0][2])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[1][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[1][2])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[2][0].equals(tablero[2][1]) && tablero[2][1].equals(tablero[2][2])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[0][0].equals(tablero[1][0]) && tablero[1][0].equals(tablero[2][0])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[0][1].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][1])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						} else if (tablero[0][2].equals(tablero[1][2]) && tablero[1][2].equals(tablero[2][2])) {
							System.out.println("Has ganado jugador " + jugador);
							break;
						}
					}
				} 
			}
			suma++;
		} while (!tresEnRaya);
		
		// Terminar juego y proclamar ganador al jugador

		scanner.close();
	}

}
