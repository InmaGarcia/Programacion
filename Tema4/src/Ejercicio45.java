import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Boolean correcto= false;
		LocalDate hoy = LocalDate.now();
		LocalDate fechaNacimiento= null;
		do {
		System.out.println("Dime tu fecha de nacimiento");
		String nacimiento = sc.nextLine();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
		fechaNacimiento = LocalDate.parse(nacimiento, formato);
		
		if(fechaNacimiento.getYear() <= hoy.getYear()) {
			correcto=true;
		}
		else {
			correcto=false;
		}
		}
		while(!correcto);
		
		System.out.println("¿Naciste en año bisiesto?"+fechaNacimiento.isLeapYear());
		
		System.out.println("Naciste un: "+fechaNacimiento.getDayOfWeek());
		//until es para saber lo que hay entre dos fechas
		Period periodo = fechaNacimiento.until(hoy);
		System.out.println("Tienes "+periodo.getYears());
		
		LocalDate muerte = fechaNacimiento.plusYears(100);
		periodo = hoy.until(muerte);
		
		System.out.println("Hasta los 100 años te quedan " 
		                                    + periodo.getYears()+" años "
		                                    + periodo.getMonths()+" meses "
		                                    + periodo.getDays()+" días");
		
		//Dile que hora es ahora en formato hora/minuto/segundo con 24 horas.
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora actual: "+ formato1.format(hora));
		
		
		sc.close();

	}

}
