package ejercicio25;

import java.util.Scanner;

import ejercicio22.Alumno;
import ejercicio22.Curso;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alumno alumno = new Alumno();
		Curso curso = new Curso();
		Alumno[] alumnos = new Alumno[3];

		curso.setIdentificador("1");
		// alumno.setCurso(curso);

		curso.setDescripcion("DAM-DAW");
		// alumno.setCurso(curso);

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Dime tu nombre");
			String nombre = sc.nextLine();
			alumno.setNombre(nombre);
			
			System.out.println("Dime tu dni");
			String dni = sc.nextLine();
			alumno.setDni(dni);

			System.out.println("Dime tu edad");
			Integer edad = sc.nextInt();
			alumno.setEdad(edad);
			sc.nextLine();
			
			alumnos[i]= alumno; //asi introduzco los valores del alumno en la posicion del array
		}
		
			 
		if(alumnos[0].equals(alumnos[1])) {
			System.out.println("Error, alumno 1 igual al alumno 2");
				
		}
		else if(alumnos[1].equals(alumnos[2])) {
			System.out.println("Error, alumno 2 igual al alumno 3");
		}
		else if(alumnos[0].equals(alumnos[2])) {
			System.out.println("Error, alumno 1 igual al alumno 3");
		}
		else {
			System.out.println("No hay alumnos repetidos");
		}
		

		sc.close();
	}

}
