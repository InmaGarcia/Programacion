import java.util.Scanner;

public class Ejercicio7 {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Solicita por consola al usuario cuál es su altura y su peso (en dos pasos) 
		System.out.println("Digame su altura en metros");
		Double estatura = scanner.nextDouble();
		System.out.println("Digame su peso en Kg");
		Double masa = scanner.nextDouble();
		
		//Recoge los datos y calcula el IMC. Se calcula IMC = masa / estatura al cuadrado
		Double imc = masa /(estatura*estatura);
        //Muestra por consola el resultado del IMC calculado
		System.out.println("Su IMC es de "+imc);
		
		scanner.close();
		

	}

}
