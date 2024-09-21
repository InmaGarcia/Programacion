package prácticos;

public class Ejercicio12tablamult {

	public static void main(String[] args) {
		// Crea un array bidimensional de 10 x 10 y llénalo con la tabla de multiplicar
		// del 0 al 9
		Integer[][] tablaMultiplicar = new Integer[10][10];

		for (int i = 0; i < tablaMultiplicar.length; i++) {
			for (int j = 0; j < tablaMultiplicar[i].length; j++) {
				tablaMultiplicar[i][j] = i * j;
			}
		}
		for (int i = 0; i < tablaMultiplicar.length; i++) {
			for (int j = 0; j < tablaMultiplicar[i].length; j++) {
			
				System.out.print(tablaMultiplicar[i][j] +"\t");									
			}
			System.out.println();	
			
		}

	}
}
