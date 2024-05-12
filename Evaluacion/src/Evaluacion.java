import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Evaluacion {

	private static final BigDecimal NOTA_APROBADO = new BigDecimal(5);
	// DNI (String) --> Notas (BigDecimal)
	private Map<String, BigDecimal> notas;

	public Evaluacion() {
		notas = new HashMap<>();
	}

	public Boolean addNota(String dni, BigDecimal nota) {
		if (dni == null || nota == null) {
			return false;
		}
		if (notas.containsKey(dni)) {
			return false;
		}
		notas.put(dni, nota);
		return true;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (dni == null || nota == null) {
			return false;
		}
		if (notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}
		return false;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
//		if (notas.containsKey(dni)) {
//			return notas.get(dni);
//		}
//		return BigDecimal.ZERO;
		return notas.getOrDefault(dni, BigDecimal.ZERO);
	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal sumaTotal = BigDecimal.ZERO;

		Collection<BigDecimal> listaNotas = notas.values();
		for (BigDecimal nota : listaNotas) {
			sumaTotal = sumaTotal.add(nota);
		}

//		Set<String> dnis = notas.keySet();
//		for (String dni : dnis) {
//			sumaTotal = sumaTotal.add(notas.get(dni));
//		}
//		
//		Set<Entry<String, BigDecimal>> pares = notas.entrySet();
//		for (Entry<String, BigDecimal> par : pares) {
//			sumaTotal = sumaTotal.add(par.getValue());
//		}

		BigDecimal cantidadNotas = new BigDecimal(notas.size());
		BigDecimal media = sumaTotal.divide(cantidadNotas, 2, RoundingMode.HALF_DOWN);
		return media;
	}

	public Integer obtenerCantidadAprobados() {
		// return notas.size()-obtenerSuspensos().size(); (usando el mtodo siguiente)
		Integer cantidad = 0;
		Collection<BigDecimal> listaNotas = notas.values();
		for (BigDecimal nota : listaNotas) {
			// if (nota.intValue() >= 5) { // otra opcin
			if (nota.compareTo(NOTA_APROBADO) >= 0) {
				cantidad ++;
			}
		}
		return cantidad;
	}

	public List<String> obtenerSuspensos(){
		List<String> suspensos = new ArrayList<>();
		Set<String> dnis = notas.keySet();
		for (String dni : dnis) {
			if (notas.get(dni).compareTo(NOTA_APROBADO) < 0) {
				suspensos.add(dni);
			}
		}

//		Set<Entry<String, BigDecimal>> entradas = notas.entrySet();
//		for (Entry<String, BigDecimal> entrada : entradas) {
//			if (entrada.getValue().compareTo(new BigDecimal(5)) < 0) {
//				suspensos.add(entrada.getKey());
//			}
//		}

		return suspensos;
		
	}
	
	public void borrarAprobados() {
		Set<String> dnis = notas.keySet();
		Iterator<String> it = dnis.iterator();
		while (it.hasNext()) {
			String dni = (String) it.next();
			if (notas.get(dni).compareTo(NOTA_APROBADO) >= 0) {
				it.remove();
			}
		}
	}
	
	@Override
	public String toString() {
		
		
		DecimalFormat ft = new DecimalFormat("#.0");
		String aprobados = "Aprobados:\n";
		String suspensos = "Suspensos:\n";
		
		Set<String> dnis = notas.keySet();
		for (String dni : dnis) {
			String linea = "\t" + dni + " (" + ft.format(notas.get(dni)) + ")\n";
			if (notas.get(dni).compareTo(NOTA_APROBADO) >= 0) {
				aprobados += linea;
			}
			else {
				suspensos += linea;
			}
		}
		
		return aprobados + "\n" + suspensos;	
	}
	
	
}
