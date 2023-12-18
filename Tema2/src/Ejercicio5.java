
public class Ejercicio5 {

	public static void main(String[] args) {

		Integer contador = 1;
		Integer suma = 0;

		while (contador <= 10000) {
			suma = suma + contador; //suma += contador
			contador = contador + 1;

		}

		System.out.println("La suma de todos los números desde el 1 al 10000 es : " + suma);
	}

}
