import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        //Realizar un programa que obtenga por teclado los siguientes datos:
		// Un número, pero registradlo en una variable de tipo String llamada a.
		System.out.println("Introduce un número");
		String a = scanner.nextLine();
		// Un número decimal registrado en una variable de tipo Double llamada b.
		System.out.println("Introduce un número decimal");
		Double b = scanner.nextDouble();
		// Un número entero registrado en una variable de tipo Float llamada c.
		System.out.println("Introduce un número entero");
		Float c = scanner.nextFloat();

		// Guarda el valor de “a” en una variable de tipo Long llamada “x1”
		Long x1 = Long.parseLong(a);
		// Guarda el valor de “b” en una variable de tipo String llamada “x2”
		String x2 = b.toString();
		// Guarda el valor de “b” en una variable de tipo Integer llamada “x3”
		Integer x3 = b.intValue();
		// Guarda el valor de “c” en una variable de tipo Long llamada “x4”
        Long x4 = c.longValue();
        //Imprime por consola el valor de todas las variables x1, x2, x3 y x4 
        System.out.println("x1 : "+x1);
        System.out.println("x2 : "+x2);
        System.out.println("x3 : "+x3);
        System.out.println("x4 : "+x4);
        
		
		scanner.close();
	}

}
