package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Empresa;
import modelo.Proyecto;
import servicios.ProyectoErrorException;
import servicios.ProyectoNotFoundException;
import servicios.ProyectosService;

public class App {

	private static Scanner scanner;
	private static ProyectosService service;

	public static void main(String[] args) {

		try {
			service = new ProyectosService();
			scanner = new Scanner(System.in);

			Boolean mal = false;
			List<Proyecto> listaP = new ArrayList<Proyecto>();

			do {
				mal= false;
				
				LocalDate fechaInicio = inicio();
				LocalDate fechaFin = fin(fechaInicio);
				
				try {
					listaP = service.buscarProyectos(fechaInicio, fechaFin);
				} catch (ProyectoNotFoundException e) {
					mal = true;
					System.out.println("No hay proyectos con las fechas indicadas");
				}
			} while (mal);

			Empresa e = new Empresa();
			e.setNombreComercial("BlaSSoft");
			e.setProyectos(listaP);
			System.out.println(e);

		} catch (ProyectoErrorException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

	private static LocalDate inicio() {
		Boolean mal;
		LocalDate fechaInicio = LocalDate.now();

		do {
			mal = false;
			System.out.println("Indica la fecha INICIAL desde la que quieres buscar (dd/MM/yyyy)");
			String inicio = scanner.nextLine();

			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			try {
				fechaInicio = LocalDate.parse(inicio, formato);
			} catch (DateTimeParseException e) {
				mal = true;
				System.out.println("La fecha indicada no es correcta");
			}

		} while (mal);

		return fechaInicio;

	}

	private static LocalDate fin(LocalDate fecha) {
		Boolean mal;
		LocalDate fechaFin = LocalDate.now();

		do {
			mal = false;
			System.out.println("Indica la fecha FINAL hasta la que quieres buscar (dd/MM/yyyy)");
			String fin = scanner.nextLine();

			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			try {
				fechaFin = LocalDate.parse(fin, formato);
			} catch (DateTimeParseException e) {
				mal = true;
				System.out.println("La fecha indicada no es correcta");
			}
			if (fechaFin.isBefore(fecha)) {
				mal = true;
				System.out.println("La fecha FINAL debe ser posterior a la fecha INICIAL indicada previamente");
			}
		} while (mal);

		return fechaFin;

	}

}
