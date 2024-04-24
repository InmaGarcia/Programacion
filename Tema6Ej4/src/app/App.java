package app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import modelo.DatosImcompletosException;
import modelo.Persona;
import servicios.PersonasService;

public class App {

	private static Scanner scanner;
	private static PersonasService service;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		service = new PersonasService();
		Integer menu;
		do {
			menu = mostrarMenu();

			switch (menu) {
			case 1:
				buscarPersonaFiltro();
				break;
			case 2:
					consultarPersonaPorDni();			
				break;
			case 3:
				insertarPersona();
				break;
			case 4:
				System.out.println("Has salido del menú");
				break;
			default:
				System.out.println("La opcion elegida no es correcta");
			}
		}

		while (menu == 4);

		scanner.close();

	}

	private static void insertarPersona() {
		scanner.nextLine();
		Boolean error = false;
		Persona p1 = null;
		do {

			try {
				p1 = new Persona();
				System.out.println("Dime el DNI");
				p1.setDni(scanner.nextLine());

				System.out.println("Dime el nombre");
				p1.setNombre(scanner.nextLine());

				System.out.println("Dime los apellidos");
				p1.setApellidos(scanner.nextLine());

				System.out.println("Dime la fecha de nacimiento");
				String fecha = scanner.nextLine();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				try {
				LocalDate vNacimiento = LocalDate.parse(fecha, formato);
				p1.setFechaNacimiento(vNacimiento);
				}catch(DateTimeParseException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(p1);
				p1.validar();
			} catch (DatosImcompletosException e) {
				System.out.println("Los datos no están completo");
				error = true;
			}

		} while (error);
		try {
		service.insertarPersona(p1);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void buscarPersonaFiltro() {
		try {
			System.out.println("Dime un nombre o apellido");
			String palabra = "";

			do {
				palabra = scanner.nextLine();
			} while (palabra.isEmpty());

			List<Persona> personas = service.buscarPersonas(palabra);

			for (Persona persona : personas) {
				System.out.println(persona);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void consultarPersonaPorDni() {
		try {
			System.out.println("Dime el DNI de la persona");
			String dni = scanner.nextLine();

			Persona p = service.consultarPersona(dni);
			if (p == null) {// esto es porque pusimos en la clase que si no habia un dni igual en
				// nuestra bbdd nos devolviera null.
				System.out.println("No existe persona con los datos solicitados");
			} else {
				System.out.println(p);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static Integer mostrarMenu() {

		System.out.println("Opciones:");
		System.out.println("\t 1. Buscar persona por DNI");
		System.out.println("\t 2. Buscar persona por nombre/apellidos");
		System.out.println("\t 3. Insertar persona");
		System.out.println("\t 4. Salir del menú");

		Integer menu = scanner.nextInt();
		return menu;
	}

}
