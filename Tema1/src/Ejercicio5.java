import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Mostrar un mensaje preguntando “¿Cuánto te gustaría ganar al año?”
		System.out.println("¿Cuánto te gustaría ganar al año?");
		
		//Esperar a que el usuario conteste indicando una cantidad
		int sueldoAnual = scanner.nextInt();
		
		//Mostrar un nuevo mensaje “Tu sueldo mensual sería de xx euros” (calcular xx dividiendo lo indicado por el usuario entre 12) 
        int sueldoMensual = sueldoAnual/12;
        System.out.println("Tu sueldo mensual sería de "+sueldoMensual+" euros");
        
        scanner.close();
        
	}

}
