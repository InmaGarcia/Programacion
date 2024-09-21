package prácticos;

public class Ejercicio11Bidm {

	public static void main(String[] args) {
		// Crea un array bidimensional de 5 x 10. Llénalo con todos los números del 1 al 50. 
		Integer [][] tablaNumeros = new Integer [5][10];
		Integer k =1;
		for (int i=0; i<5 ; i++) {
			for (int j=0; j < tablaNumeros[i].length; j++) {
			tablaNumeros[i][j] = k;
			k++;
			}
		}
		
        //en un método aparte, imprímelo de modo que en cada línea aparezcan 10 números. 
		for (int i=0; i<5 ; i++) {
			for (int j=0; j < tablaNumeros[i].length; j++) {
					System.out.print(tablaNumeros[i][j]+"\t");			
			}
			System.out.println();
		}

	}

}
