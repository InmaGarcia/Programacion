package ejercicio26;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Dime tu dni");
		String dni = sc.nextLine();
		
		Alumno alumno = new Alumno(dni);
		//alumno.setDni(dni);
		
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		alumno.setNombre(nombre);
		
		System.out.println("Dime tu edad");
		Integer edad = sc.nextInt();
		alumno.setEdad(edad);
		
		System.out.println("Dime tu nota");
		Integer nota = sc.nextInt();
		alumno.setNota(nota);
		
		System.out.println("NOMBRE: "+alumno.getNombre());
		System.out.println("DNI: "+alumno.getDni());
		System.out.println("EDAD: "+alumno.getEdad());
		System.out.println("NOTA: "+alumno.getNota());
	
		
		sc.close();
	}

}
