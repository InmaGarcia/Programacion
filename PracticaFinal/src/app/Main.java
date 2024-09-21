package app;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo.Equipo;
import modulo.Jugador;
import services.EquipoServiceException;
import services.EquiposService;
import services.NotFoundException;

public class Main {

	private static Scanner scanner;
	private static EquiposService service;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		service = new EquiposService();

		Integer opcion;
		try {
			do {
				opcion = menu();

				switch (opcion) {
				case 1:
					List<Equipo> equipos=service.consultarEquipos();
					System.out.println("Listado de equipos: ");
					for(Equipo equipo : equipos) {
					System.out.println("\t"+equipo);
					}
					break;

				case 2:
					insertarEquipo();
					break;

				case 3:
					String codigoEq = consultarEquipo();

					Integer subopcion;

					do {
						subopcion = submenu();

						switch (subopcion) {
						case 1:
							imprimirPlantilla(codigoEq);
							break;
						case 2:

							service.borrarEquipoCompleto(codigoEq);
							System.out.println("Equipo eliminado!!");
							break;
						case 3:
							Jugador j = crearJugador();
							j.setCodigoEq(codigoEq);
							System.out.println("Jugador guardado!!");
							break;
						case 4:
							Equipo eq = service.consultarEquipoCompleto(codigoEq);
							DecimalFormat formato = new DecimalFormat("#0.00");
							System.out.println("Edad Media: " + formato.format(eq.getEdadMedia()));
							break;
						case 5:
							System.out.println("Indica Ruta fichero: ");
							String ruta = scanner.nextLine();
							service.exportarJugadores(codigoEq, ruta);
							System.out.println("Fichero generado!!");
							break;
						case 0:
							break;
						default:
							System.out.println("La opción indicada no es válida");
						}

					} while (subopcion != 0);

					break;

				case 0:
					System.out.println("Bye!!");
					break;

				default:
					System.out.println("La opción indicada no es válida");
				}

			} while (opcion != 0);

		} catch (EquipoServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String consultarEquipo() throws EquipoServiceException, NotFoundException {
		System.out.println("Dime el código del equipo");
		String codigoEq = scanner.nextLine();

		Equipo eq = service.consultarEquipoCompleto(codigoEq);
		System.out.println("EQUIPO: " + eq.getCodigo() + " / " + eq.getNombreEq());

		return codigoEq;
	}

	private static void imprimirPlantilla(String codigoEq) throws SQLException {
		System.out.println(">> PLANTILLA:");
		List<Jugador> jugadores = service.consultarJugadoresEquipo(codigoEq);

		for (Jugador j : jugadores) {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println(
					"\t" + j.getNum() + " - " + j.getNombreJug() + " - " + j.getFecha_nacimiento().format(formato));
		}
	}

	private static Integer submenu() {
		Integer subopcion;
		System.out.println("---------------------------------------");
		System.out.println("Elige una de estas opciones para el equipo:");
		System.out.println("\t(1) Ver plantilla del equipo");
		System.out.println("\t(2) Borrar Equipo");
		System.out.println("\t(3) Añadir un jugador");
		System.out.println("\t(4) Calcular edad media de plantilla");
		System.out.println("\t(5) Exportar plantilla del equipo al fichero");
		System.out.println("\t(0) Vol");
		System.out.println("---------------------------------------");
		subopcion = scanner.nextInt();
		scanner.nextLine();
		return subopcion;
	}

	private static void insertarEquipo() throws EquipoServiceException {
		String resp;
		int num = 0;
		Equipo e = new Equipo();
		// pido los datos del equipo
		System.out.println("Indica Código equipo:");
		String codigoEq = scanner.nextLine();
		e.setCodigo(codigoEq);

		System.out.println("Indica Nombre equipo");
		e.setNombreEq(scanner.nextLine());

		List<Jugador> jugadores = new ArrayList<Jugador>();
		e.setJugadores(jugadores);

		do {
			// creo jugador
			Jugador j = crearJugador();
			j.setCodigoEq(codigoEq);
			j.setNum(num);
			// inserto jugador
			jugadores.add(j);

			System.out.println("¿Deseas añadir otro jugador? (S/N)");
			resp = scanner.nextLine();

			num++;
		} while (resp.equalsIgnoreCase("S"));

		service.crearEquipo(e);
		System.out.println("Equipo guardado!!");
	}

	private static Jugador crearJugador() {
		Jugador j = new Jugador();

		System.out.println("Indica nombre jugador");
		j.setNombreJug(scanner.nextLine());

		System.out.println("Indica fecha nacimiento jugador (dd/MM/yyyy)");
		String fNacimientoCad = scanner.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		j.setFecha_nacimiento(LocalDate.parse(fNacimientoCad, formato));
		return j;
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
		scanner.nextLine();

		return opcion;
	}

}
