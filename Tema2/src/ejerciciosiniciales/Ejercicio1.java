package ejerciciosiniciales;


public class Ejercicio1 {
    public static final Double X = 144.0;
    public static final Double Y = 999.0;
	public static void main(String[] args) {
		
		
		// Escribe un programa en el que se declaren las variables enteras x e y
		// Asígnales los valores 144 y 999 respectivamente
		//muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.
		System.out.println("La variable x = "+X);
		System.out.println("La variable y = "+Y);
		Double suma = X+Y;
		Double resta = X-Y;
		System.out.println("La suma de x más y es igual a "+ suma);
		System.out.println("La resta de x menos y es igual a "+ resta);
		System.out.println("La division de x entre y es igual a "+ X/Y);
		System.out.println("La multiplicacion de x por y es igual a "+ X*Y);

	}

}
