import java.util.Scanner;

public class Ejercicio8 {

	public static final String SUMAR = "ADD";
	public static final String RESTAR = "SUB";
	public static final String MULTIPLICAR = "MUL";
	public static final String DIVIDIR = "DIV";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean repetir= false;
		String opcion ="";

		do {
		System.out.println("Opciones:\tSumar\tRestar\tMultiplicar\tDividir");
		opcion = scanner.nextLine();
		
		if(opcion.equalsIgnoreCase("sumar")) {
			opcion=SUMAR;
		}
		else if(opcion.equalsIgnoreCase("restar")) {
			opcion=RESTAR;
		}
		else if(opcion.equalsIgnoreCase("multiplicar")) {
			opcion=MULTIPLICAR;
		}
		else if(opcion.equalsIgnoreCase("dividir")) {
			opcion=DIVIDIR;
		}
		else {
			System.out.println("No es una opción");
			repetir=true;
		}
		}
		while(repetir);
		
		System.out.println("Dime un número");
		Integer num1 = scanner.nextInt();
		
		System.out.println("Dime otro número");
		Integer num2 = scanner.nextInt();
		
		System.out.println("El resultado de es: "+Calculadora.calcular(num1, num2, opcion));
		
		scanner.close();
	}

}
