import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		// Solicita por consola al usuario cuál es su altura y su peso (en dos pasos) 
		System.out.println("Digame su altura en metros");
		Double estatura = scanner.nextDouble();
		System.out.println("Digame su peso en Kg");
		Double masa = scanner.nextDouble();
		
		//Recoge los datos y calcula el IMC. Se calcula IMC = masa / estatura al cuadrado
		Double imc = masa /(estatura*estatura);
		System.out.println("Su índice de masa corporal es de "+imc+"%");
        //peso inferior a lo normal menos de 18.5
		if (imc < 18.5) {
		System.out.println("Su peso es inferior a lo normal ");
		}
		//peso normal igual o mayor a 18.5 y menor o igual a 24.9
		else if ( imc >= 18.5 && imc <=24.9) {
			System.out.println("Su peso es normal");
		}
		//peso superior al normal mayor o igual 25.0 y menor o igual 29.9
		else if ( imc >= 25.0 && imc <=29.9) {
			System.out.println("Su peso es superior al normal");
		}
		//obesidad mayor o igual a 30.0
		else {
			System.out.println("Usted tiene obesidad");
			
		}
		
		scanner.close();

	}

}
