package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import services.EquipoServiceException;
import services.EquiposService;

public class Main {

	private static Scanner scanner;
	private static EquiposService service;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		Integer opcion;

		do {
			opcion = menu();

			switch (opcion) {
			case 1:
				verEquipos();
				break;
			case 2:
				insertarEquipo();
				break;
			case 3:

				break;
			case 0:
				System.out.println("Bye!!");
				break;
			default:
				System.out.println("La opción indicada no es válida");
			}

		} while (!opcion.equals("0"));

	}

	private static void verEquipos() {
		try {
			service.consultarEquipos();
		} catch (EquipoServiceException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void insertarEquipo() {
		String add;
		do {
			System.out.println("Indica Código equipo:");
			String codigo = scanner.nextLine();

			System.out.println("Indica Nombre equipo");
			String nombreEq = scanner.nextLine();

			System.out.println("Indica nombre jugador");
			String nombreJu = scanner.nextLine();

			System.out.println("Indica fecha nacimiento jugador (dd/MM/yyyy)");
			String fNacimientoCad = scanner.nextLine();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaNacimiento = LocalDate.parse(fNacimientoCad, formato);

			System.out.println("¿Deseas añadir otro jugador? (S/N)");
			add = scanner.nextLine();

		} while (add.equalsIgnoreCase("S"));
	}

	private static Integer menu() {
		Integer opcion;
		System.out.println("---------------------------------------");
		System.out.println("Elige una de estas opciones:");
		System.out.println("\t(1) Ver todos los equipos registrados");
		System.out.println("\t(2) Crear nuevo equipo");
		System.out.println("\t(3) Consultar un equipo por su código");
		System.out.println("\t(0) Salir");
		System.out.println("---------------------------------------");
		opcion = scanner.nextInt();

		return opcion;
	}

}
