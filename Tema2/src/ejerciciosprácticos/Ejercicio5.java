package ejerciciosprácticos;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Realizar un programa que muestre la suma de todos los números del 1 al 10000.
		//Es decir: 1 + 2 + 3 + 4 + 5 + … + 9999 + 10000 

		Integer contador = 1;
		Integer suma = 0;
		
		while ( contador <= 10000) {
			suma = suma + contador;
			contador = contador + 1;
			
		}
		System.out.println("La suma de todos los numeros  del 1 al 10000 es "+suma);

	}

}
