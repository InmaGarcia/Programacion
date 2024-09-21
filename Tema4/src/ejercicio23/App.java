package ejercicio23;

import java.util.Scanner;

import ejercicio22.Alumno;
import ejercicio22.Curso;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		Curso curso = new Curso();
		
		System.out.println("Dime tu dni");
		String dni = sc.nextLine();
		alumno.setDni(dni);
		
		System.out.println("Dime tu nota");
		Integer nota = sc.nextInt();
		alumno.setNota(nota);
		sc.nextLine();
		
		System.out.println("Dime el id de tu curso");
		String id = sc.nextLine();
		curso.setIdentificador(id);
		alumno.setCurso(curso);
		
		System.out.println("De que es tu curso");
		String descp = sc.nextLine();
		curso.setDescripcion(descp);
		alumno.setCurso(curso);//esto relacciona el curso con el alumno
				
		System.out.println(alumno);
		
		Profesor profesor = new Profesor();
		
		System.out.println("Dime el nombre del profesor");
		String nombre = sc.nextLine();
		profesor.setNombre(nombre);
		
		System.out.println("Dime la edad del profesor");
		Integer edad = sc.nextInt();
		profesor.setEdad(edad);    

		System.out.println(profesor);
		System.out.println(curso);
		sc.close();
	}

}
