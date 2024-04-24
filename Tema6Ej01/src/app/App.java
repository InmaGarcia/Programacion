package app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import modelo.DatosImcompletosException;
import modelo.Persona;
import servicios.PersonasService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonasService service = new PersonasService();
		// Ejercicio 1

		System.out.println("Dime el DNI de la persona");
		String dni = sc.nextLine();

		try {
			Persona p = service.consultarPersona(dni);
			if (p == null) {// esto es porque pusimos en la clase que si no habia un dni igual en
				// nuestra bbdd nos devolviera null.
				System.out.println("No existe persona con los datos solicitados");
			} else {
				System.out.println(p);
			}
			// Ejercicio 2
			System.out.println("Dime un nombre o apellido");
			String palabra = "";

			do {
				palabra = sc.nextLine();
			} while (palabra.isEmpty());

			List<Persona> personas = service.buscarPersonas(palabra);

			for (Persona persona : personas) {
				System.out.println(persona);
			}

			Boolean error = false;
			Persona p1 = null;
			do {

				try {
					p1 = new Persona();
					System.out.println("Dime el DNI");
					String vDni = sc.nextLine();

					System.out.println("Dime el nombre");
					String vNombre = sc.nextLine();

					System.out.println("Dime los apellidos");
					String vApellidos = sc.nextLine();

					System.out.println("Dime la fecha de nacimiento");
					String fecha = sc.nextLine();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern(fecha);
					LocalDate vNacimiento = LocalDate.parse(fecha, formato);

					p1.validar();
				} catch (DatosImcompletosException e) {
					System.out.println("Los datos no están completo");
					error = true;
				}

			} while (error);

			service.insertarPersona(p);

		} catch (SQLException e) {
			System.out.println("Excepción :" + e.getMessage());
		}

		sc.close();
	}

}
