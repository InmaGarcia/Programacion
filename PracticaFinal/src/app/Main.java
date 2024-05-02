package app;

import java.util.Scanner;


public class Main {

	private static Scanner scanner;
	//private static PersonasService service;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		String opcion = "";
		
		do {
			System.out.println("---------------------------------------");
			System.out.println("Elige una de estas opciones:");
			System.out.println("\t(1) Ver todos los equipos registrados");
			System.out.println("\t(2) Crear nuevo equipo");
			System.out.println("\t(3) Consultar un equipo por su código");
			System.out.println("\t(0) Salir");
			System.out.println("---------------------------------------");
			opcion = scanner.nextLine();
			
			if (!(opcion.equals("1") || opcion.equals("2")|| opcion.equals("3")|| opcion.equals("0"))) {
				System.out.println("La opción indicada no es válida");
			}
			if (opcion.equals("0")) {
				System.out.println("Bye!!");
			}
			if (opcion.equals("1")) {
				System.out.println("Listado de equipos:");
				System.out.println("\t EQUIPO: BT / BETIS");
				System.out.println("\t EQUIPO: RM / REAL MADRID");
			}
			
		}while(!opcion.equals("0"));

	}

}
