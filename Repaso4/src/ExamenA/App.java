package ExamenA;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String medico = "";
		do {
			System.out.println("Dame el nombre del medico");
			medico = scanner.nextLine();
			medico = medico.trim().toUpperCase();
		}
		while(medico.length()<10);
		System.out.println(medico);
		Agenda agenda = new Agenda(medico);
		
		CitaNormal cita = new CitaNormal(LocalDate.of(2024, 5, 10), 16, "Blas", false);
		CitaRevision citR = new CitaRevision(LocalDate.of(2024, 10, 18), 17, "Laura", true);
		citR.setNumRevision(3);
		
		agenda.addCita(cita);
		agenda.addCita(citR);
		
		DecimalFormat formato = new DecimalFormat("##,###.00 €");
		System.out.println(formato.format(agenda.getImportePendienteFacturar()));	
		
		
		scanner.close();
				
		
	}

}

