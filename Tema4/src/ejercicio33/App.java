package ejercicio33;

public class App {

	public static void main(String[] args) {
		
		//1. Crea un Semáforo
		Semaforo semaforo = new Semaforo();
		System.out.println(semaforo);
		
		//2. Cambia el color a un color incorrecto. 
		semaforo.setColor("azul");
		System.out.println(semaforo);
		
		//3. Cambia el color a verde. 
		semaforo.setColor(Semaforo.VERDE);
		System.out.println(semaforo);

		//4. Pon el atributo parpadeando a cierto. 
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		//5. Cambia el color a ámbar. 
		semaforo.setColor(Semaforo.AMBAR);
		System.out.println(semaforo);
		
		//6. Pon el atributo parpadeando a cierto
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		//7. Llama 5 veces al método cambiarEstado (usando un bucle) 
		for(int i=0; i<5; i++) {
			semaforo.cambiarEstado();
			System.out.println(semaforo);
		}
		
		//8. Crea un nuevo semáforo que sea copia del anterior. 
		Semaforo semaforo2 = new Semaforo();//creamos otro espacio de memoria diferente
		//le introduciomos los valores del 1 asi tenemmos dos memorias iguales
		semaforo2.setColor(semaforo.getColor());
		semaforo2.setParpadeando(semaforo.getParpadeando());
		System.out.println(semaforo2);

	}

}
