package repaso;

import java.util.Scanner;

public class Ejercicio10Alum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// calcular la nota media de los alumnos de clase
		// el programa debe preguntar al usuario cuántos alumnos hay
		System.out.println("¿Cuántos alumnos hay en clase?");
		Integer cantidad = scanner.nextInt();
		// por alumno solicitará su nombre y las notas de los 3 exámenes realizados
		String[] alumnos = new String[cantidad];
		Integer[] medias = new Integer[cantidad];
		Integer suma = 0;
		scanner.nextLine();
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("¿Cuál es el nombre del alumno " + i + "?");
			String alumno = scanner.nextLine();
			 alumnos[i]=alumno;
				
			for (int exam = 1; i <=3; exam++) {
				System.out.println("¿Cuál es la nota de " + alumno + " para el examen "+exam+"?");
				suma +=  scanner.nextInt(); 
			}
			scanner.nextLine();
			medias[i] = suma / 3;
		}
		
		suma=0;
		System.out.println("LISTADO DE NOTAS");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Alumno: "+alumnos[i]+" - Nota media: "+medias[i]);
			suma+=medias[i];
		}
		
		System.out.println("La media de los alumnos es: "+suma);
        
		scanner.close();
	}

}
