package ejercicio3738;

import ejercicio37.ColaCadena;

public class App {

	public static void main(String[] args) {
		
		// 1. Crea un objeto cola.
		ColaCadena cola = new ColaCadena();
		System.out.println(cola);
		// 2. Añade a la cola las palabras “primero” y “segundo”
		cola.añadirCadena("primero");
		cola.añadirCadena("segundo");
		System.out.println(cola);

		// 3. Saca de la cola un elemento e imprímelo.
		cola.sacarCadena();
		System.out.println(cola);

		// 4. Añade a la cola la palabra “tercero”
		cola.añadirCadena("tercero");
		System.out.println(cola);

		// 5. Saca todos los elementos que queden en la cola e imprímelos.
		while (cola.getTamaño() > 0) {
			cola.sacarCadena();
		}
		System.out.println(cola);
		// 6. Añade a la cola la palabra cuarto.
		cola.añadirCadena("cuarto");
		System.out.println(cola);
		
		// 7. Crea un objeto pila.
		PilaCadenas pila = new PilaCadenas();
		System.out.println(pila);

		// 8. Añade a la pila las palabras “primero” y “segundo”
		pila.añadirCadena("primero");
		pila.añadirCadena("segundo");
		System.out.println(pila);

		// 9. Saca de la pila un elemento e imprímelo.
		System.out.println(pila.sacarCadena());
		System.out.println(pila);

		// 10. Añade a la pila la palabra “tercero”
		pila.añadirCadena("tercero");
		System.out.println(pila);

		// 11. Saca todos los elementos que queden en la pila e imprímelos.
		while (pila.getTamaño() > 0) {
			pila.sacarCadena();
		}
		System.out.println(pila);
		// 12. Añade a la pila la palabra cuarto
		pila.añadirCadena("cuarto");
		System.out.println(pila);

	}

}
