package ejercicio37;


public class App {

	public static void main(String[] args) {
	
		//1. Crea un objeto cola.
		ColaCadena cola = new ColaCadena();
		System.out.println(cola);
		//2. Añade a la cola las palabras “primero” y “segundo”
		cola.añadirCadena("primero");
		cola.añadirCadena("segundo");
		System.out.println(cola);
		
		//3. Saca de la cola un elemento e imprímelo. 
		cola.sacarCadena();
		System.out.println(cola);
		
		//4. Añade a la cola la palabra “tercero” 
		cola.añadirCadena("tercero");
		System.out.println(cola);
		
		//5. Saca todos los elementos que queden en la cola e imprímelos. 
		while(cola.getTamaño() >0) {
			cola.sacarCadena();		
		}
		System.out.println(cola);
		//6. Añade a la cola la palabra cuarto.
		cola.añadirCadena("cuarto");

		System.out.println(cola);
	}

}
