package ejercicio18;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		
		//alumno.dni="4700188A";
		//alumno.nombre="Inma";
		System.out.println("Dime tu dni");
		String dni = sc.nextLine();
		alumno.setDni(dni);
		
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
		
		//Alumno alumno2 = new Alumno(dni, nombre, edad, nota);
		
	}

}
