package prácticos;

public class Ejercicio13 {

	public static void main(String[] args) {
		//Repite el ejercicio anterior para que en lugar de sacar la tabla de multiplicar del 0 al 9
		//cree la tabla de multiplicar del 1 al 10
		Integer[][] tablaMultiplicar = new Integer[10][10];

		for (int i = 0; i < tablaMultiplicar.length; i++) {
			for (int j = 0; j < tablaMultiplicar[i].length; j++) {
				tablaMultiplicar[i][j] = (i+1) * (j+1);
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
