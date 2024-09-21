package examen;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String especialista;
		do {
			System.out.println("Dime el nombre del especialista");
			especialista = sc.nextLine().trim().toUpperCase();
		} while (especialista.length() < 10);

		Agenda agenda1 = new Agenda(especialista);

		Normal cita1 = new Normal(LocalDate.of(2024, 5, 10), 16, "Blas de los Montes", false);

		Revision revision1 = new Revision(LocalDate.of(2024, 10, 18), 17, "Laura Aguilar", true);
		revision1.setNumRevision(3);

		agenda1.addCita(cita1);
		agenda1.addCita(revision1);

		DecimalFormat formato = new DecimalFormat("##,###.00 €");

		System.out.println(formato.format(agenda1.getImportePendienteFacturar()));

		sc.close();
	}

}
