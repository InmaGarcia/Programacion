package prácticos;

public class Ejercicio1 {

	public static void main(String[] args) {
		// un array todos los números pares entre 1 y 30
	Integer[] par = new Integer [15];
	 Integer posicion =0;
	 
	for( int i = 1; i <=30; i++ ) {		
		Integer resto = i % 2;
		if (resto == 0) {
			//mostrar el contenido del array por consola.
			System.out.println("Mi array de posición "+ posicion+" es: "+ (par [posicion] = i));
			posicion++;
			
		}
	}

	}

}
