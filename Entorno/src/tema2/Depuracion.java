package tema2;

import java.util.Scanner;

public class Depuracion {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce tu fecha de nacimiento en formato DD-MM-AAAA: ");
	        String fechaNacimiento = scanner.nextLine();

	        // Dividir la fecha de nacimiento en año, mes y día
	        String[] partes = fechaNacimiento.split("-");
	        int diaNacimiento = Integer.parseInt(partes[0]);
	        int mesNacimiento = Integer.parseInt(partes[1]);
	        int yearNacimiento = Integer.parseInt(partes[2]);
	       
	        System.out.print("Introduce la fecha de hoy en formato DD-MM-AAAA: ");
	        String fecha = scanner.nextLine();

	        // Dividir la fecha de hoy en año, mes y día
	        String[] partes2 = fecha.split("-");
	        int diaHoy = Integer.parseInt(partes2[0]);
	        int mesHoy = Integer.parseInt(partes2[1]);
	        int yearHoy = Integer.parseInt(partes2[2]);

	        // Calcular la edad
	        int edad = yearHoy - yearNacimiento;

	        // Verificar si es mayor de edad
	        if (edad > 18 || (edad == 18 && (mesHoy > mesNacimiento || (mesHoy == mesNacimiento && diaHoy >= diaNacimiento)))) {
	            System.out.println("Eres mayor de edad.");
	        } else {
	            System.out.println("Eres menor de edad.");
	        }
	        scanner.close();
	    }
	}