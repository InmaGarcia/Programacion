package ejercicio22;

import java.util.Scanner;

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
		
		System.out.println("Dime el id de tu curso");
		String id = sc.nextLine();
		curso.setIdentificador(id);
		alumno.setCurso(curso);
		
		System.out.println("De que es tu curso");
		String descp = sc.nextLine();
		curso.setDescripcion(descp);
		alumno.setCurso(curso);//esto relacciona el curso con el alumno
		
		
		System.out.println(alumno);
		

		sc.close();
	}

}
