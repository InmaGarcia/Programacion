package ejercicio07.modulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio07.services.DatosIncompletosException;

public class Test {

	private List<Persona> lista;
	private static Scanner scanner;

	public Test(List<Persona> lista) {
		super();
		this.lista = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}

	do

	{
		Persona p = new Persona();

		System.out.println("Indica el DNI de la persona:");
		p.setDni(scanner.nextLine());

		System.out.println("Indica el NOMBRE de la persona:");
		p.setNombre(scanner.nextLine());

		System.out.println("Indica el APELLIDO de la persona:");
		p.setApellidos(scanner.nextLine());

		System.out.println("Indica la FECHA NACIMIENTO (dd/MM/yyyy) de la persona:");

		String fecha = scanner.nextLine();

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
			p.setFechaNacimiento(fechaNacimiento);
		} catch (DateTimeParseException e) {
			System.out.println("La fecha indicada no es correta. Empieza de nuevo");
		}

		lista.add(p);

	}while(lista.size==3);

}
