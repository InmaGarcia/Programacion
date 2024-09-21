package ejercicio3;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		Fijo casa = new Fijo(954954954,"calle unicornio 47");
		BigDecimal gps;
		LocalizacionGps loc = new LocalizacionGps(new BigDecimal(12.34), new BigDecimal(41.58));
		Movil mama = new Movil (654654654, loc);
		
		System.out.println(casa.consultarNumero());
		System.out.println(mama.consultarNumero());
		
		mama.marcar(654654654);
		mama.marcar(610610610);
		
		mama.colgar();
		mama.colgar();

	}

}
