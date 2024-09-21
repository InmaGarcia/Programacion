package ejrepaso;

public class Ejercicio21 {

	public static void main(String[] args) {
		//Crea un array de números decimales que tenga este contenido: 5.4, 3.1, 9.0, 4.7 
		Double [] decimales = new Double [] {5.4, 3.1, 9.0, 4.7};
		
		//Imprime el contenido del array utilizando un bucle foreach
		for(Double decimal : decimales) {
			System.out.println(decimal);
		}
		
        // calcula la suma de todo el array utilizando también un bucle foreach
		Double suma = 0.0;
		
		for(Double decimal : decimales) {
			suma+= decimal;
		}
		System.out.println(suma);
	}

}
