import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Mostrar un mensaje pidiendo la edad del usuario 
		System.out.println("Digame su edad por favor");
		//Esperar a que el usuario escriba su edad y almacenarla en una variable
		String edad = scanner.nextLine();
		//Mostrar un nuevo mensaje indicando “Su edad es de xx años”
		System.out.println("Su edad es de "+edad+" años");
		
		scanner.close();
		

	}

}
