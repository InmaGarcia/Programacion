package ejercicio35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		List<Alumno> listaAlumno =new ArrayList<>();
		Curso curso = new Curso();
		curso.setIdentificador(1L);
		curso.setDescripcion("DAM-DAW");


		for (int i = 0; i < 3; i++) {
			System.out.println("Dime el dni");
			String dni = sc.nextLine();
			Alumno alumno = new Alumno(dni);
			System.out.println("Dime el nombre");
			String nombre = sc.nextLine();
			alumno.setNombre(nombre);
			System.out.println("Dime la edad");
			Integer edad = sc.nextInt();
			alumno.setEdad(edad);
			System.out.println("Dime la nota");
			Double nota = sc.nextDouble();
			sc.nextLine();
			alumno.setNota(nota);
			alumno.setCurso(curso);
			listaAlumno.add(alumno);
		}
		
		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno);
		}
		
		if (listaAlumno.get(0).equals(listaAlumno.get(1)) 
				|| listaAlumno.get(0).equals(listaAlumno.get(2))
				|| listaAlumno.get(1).equals(listaAlumno.get(2))) {
			System.err.println("Error: hay al menos 2 alumnos repetidos");
		}
		else {
			System.out.println("Felicidades: todos los alumnos son distintos!!");
		}
		
		sc.close();

	}

}
