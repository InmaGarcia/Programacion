package ejercicio36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		List<Alumno> listaAlumnos = new ArrayList<>(3);
		Curso curso = new Curso();
		curso.setIdentificador("1");
		curso.setDescripcion("DAM-DAW");


		for (int i = 0; i < listaAlumnos.size(); i++) {
			
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
			curso.addAlumno(alumno);
			
			listaAlumnos.add(alumno);
		}
		
		System.out.println(listaAlumnos);
			 
		if(listaAlumnos.get(0).equals(listaAlumnos.get(1))
				|| listaAlumnos.get(1).equals(listaAlumnos.get(2))
				|| listaAlumnos.get(0).equals(listaAlumnos.get(2))) {
			System.out.println("Error, hay al menos dos alumnos repetidos");			
		}
		
		else {
			System.out.println("No hay alumnos repetidos");
		}
		

		sc.close();
	}

}
