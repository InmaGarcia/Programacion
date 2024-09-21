import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		//Mostrar un mensaje pidiendo el nombre del usuario
		System.out.println("Dimer tu nombre por favor");
		//Esperar a que el usuario escriba su nombre y registrarlo en una variable
		String nombre = scanner.nextLine();
        //Mostrar un nuevo mensaje pidiendo el apellido del usuario
		System.out.println("Dime tu apellido por favor");
		//Esperar a que el usuario escriba su apellido y registrarlo en otra variable
		String apellido = scanner.nextLine();
		//Mostrar un mensaje final indicando: "Su nombre completo es ... (nombre y apellido)" 
		System.out.println("Su nombre completo es "+nombre+" "+apellido);
		
		scanner.close();
		
  
	}

}
