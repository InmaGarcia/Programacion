import java.math.BigDecimal;
import java.text.DecimalFormat;

public class App {
	public static void main(String[] args) {
		Evaluacion ev = new Evaluacion();
		ev.addNota("00000000T", new BigDecimal(8.9));
		ev.addNota("40061025Q", new BigDecimal(4.1));
		ev.addNota("51140024F", new BigDecimal(6.1));
		ev.addNota("91282910G", new BigDecimal(3.9));
		ev.addNota("22392293E", new BigDecimal(7.4));
		System.out.println(ev);
		
		ev.addNota("22392293E", new BigDecimal(8.8));
		System.out.println(ev);
		
		ev.corregirNota("22392293E", new BigDecimal(4.5));
		ev.corregirNota("50891336H", new BigDecimal(8.5));
		System.out.println(ev);
		
		DecimalFormat formato = new DecimalFormat("#0.0");
		System.out.println(formato.format(ev.obtenerNotaAlumno("22392293E")));
		
		System.out.println("Media: " + formato.format(ev.obtenerNotaMedia()));
	
		System.out.println("Aprobados: " + ev.obtenerCantidadAprobados());
		System.out.println("Suspensos: " + ev.obtenerSuspensos());
		ev.borrarAprobados();
		System.out.println(ev);
				
	}
}

