package repaso;

import java.util.Scanner;

public class Ejercicio1 {
     
	public static final Integer FUTURO = 2030;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// solicite el nombre y el año de nacimiento del usuario
		System.out.println("Introduzca su nombre:");
		String nombre = scanner.nextLine();
		System.out.println("Introduce tu año de nacimiento:");
		Integer nacimiento = scanner.nextInt();
		
		//imprima por consola “Hola [nombre], en el año 2030 tendrás [N] años.”
		//años que tendrá en 2030 en base a su nacimiento
		Integer año = FUTURO - nacimiento;
		
		System.out.println("Hola "+nombre+", en el año 2030 tendrás "+año+" años.");

		
		scanner.close();
		
	}

}
