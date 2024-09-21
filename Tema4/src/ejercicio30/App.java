package ejercicio30;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Alumno[] alumnos = new Alumno[3];
		Curso curso = new Curso();
		curso.setIdentificador("1");
		curso.setDescripcion("DAM-DAW");


		for (int i = 0; i < alumnos.length; i++) {
			
			Alumno alumno = new Alumno();
			
			Boolean dniOk = false;
			do {
			System.out.println("Dime tu nombre");
			String nombre = sc.nextLine();
			alumno.setNombre(nombre);
			
			System.out.println("Dime tu dni");
			String dni = sc.nextLine();
			alumno.setDni(dni);
			
			System.out.println("Dime tu edad");
			Integer edad = sc.nextInt();
			alumno.setEdad(edad);
			
			if(!alumno.validar()) {
				System.out.println("El alumno no tiene los datos válidos");
			}
			else {
				System.out.println("Los datos del alumno son válidos");
				dniOk = true;
			}
			}
			while(!dniOk);
			
			
			System.out.println("Dime tu nota");
			Integer nota = sc.nextInt();
			alumno.setNota(nota);
			sc.nextLine();
			alumno.setCurso(curso);
			
			alumnos[i]= alumno; //asi introduzco los valores del alumno en la posicion del array
			curso.addAlumno(alumno);
		}
		
		for(int i=0; i<alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
			 
		if(alumnos[0].equals(alumnos[1])
				|| alumnos[1].equals(alumnos[2])
				|| alumnos[0].equals(alumnos[2])) {
			System.out.println("Error, hay al menos dos alumnos repetidos");			
		}
		
		else {
			System.out.println("No hay alumnos repetidos");
		}
		

		sc.close();
	}

}
