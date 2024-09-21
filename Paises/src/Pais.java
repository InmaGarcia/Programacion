
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pais {
	
	private Map<String, String> datosPais;
	
	public Pais() {
	    this.datosPais = new HashMap<>();
	}
	
	public Boolean agregarPais(String nombrePais, String capital) {
	    // Aseguramos que el nombre del pas est en maysculas y la capital comience con mayscula
	    nombrePais = nombrePais.toUpperCase();
	    capital = capital.substring(0, 1).toUpperCase() + capital.substring(1).toLowerCase();
	    Boolean esta = datosPais.containsKey(nombrePais);
	    
	    datosPais.put(nombrePais, capital);
	    return esta;
	}
	
	public String obtenerCapital(String nombrePais) {
	    // Devuelve la capital asociada al nombre del pas dado, si existe
		 return datosPais.getOrDefault(nombrePais.toUpperCase(), "");
	}
	
	public void eliminarPais(String nombrePais) {
	    // Elimina la entrada del pas del mapa, si existe
	    datosPais.remove(nombrePais.toUpperCase());
	}
	
	public boolean paisExistente(String nombrePais) {
	    // Verifica si el pas dado est presente en el mapa
	    return datosPais.containsKey(nombrePais.toUpperCase());
	}
	
	
	 public void imprimirPaises() {
	        // Imprime los nombres de los pases junto con sus capitales
	        System.out.println("Lista de pases y sus capitales:");
	        Set<Entry<String, String>> pares = datosPais.entrySet();
	        
	        for (Entry<String,String> par : pares) {
	            System.out.println("PAS: " + par.getKey() + " - CAPITAL: " + par.getValue());
	        }
	  }
	 
	 public double calcularLongitudMediaPaises() {
	        
		 	if (datosPais.size() == 0) {
	            return 0; // Evitar divisin por cero
	        }
		 	
		 	int totalCaracteres = 0;
	        
	        for (String nombrePais : datosPais.keySet()) {
	            totalCaracteres += nombrePais.length();
	        }
	        
	        return (double) totalCaracteres / datosPais.size();
	    }
	 
	 public void eliminarPaisConCapitalLetra(String letra) {
		 	Set<Entry<String, String>> pares = datosPais.entrySet();
	        Iterator<Entry<String, String>> iterator = pares.iterator();
	        
	        while (iterator.hasNext()) {
	            Entry<String, String> entry = iterator.next();
	            if (entry.getValue().startsWith(letra.toUpperCase())) {
	                iterator.remove();
	                break; // Detener el ciclo despus de eliminar la primera ocurrencia
	            }
	        }
	 }
	 
	 
	 public int numeroPaisesConCapitalLetra(String letra) {
	        int count = 0;
	        for (String cap : datosPais.values()) {
	            if (cap.startsWith(letra.toUpperCase())) {
	                count++;
	            }
	        }
	        return count;
	    }
	 
	 public void imprimirPaisesPorLetra(String letra) {	        
		    
	        boolean encontrado = false;
	        System.out.println("Pases cuya capital comienza con la letra '" + letra + "':");
	        Set<Entry<String, String>> pares = datosPais.entrySet();
	        for (Entry<String, String> par : pares) {
	            String capital = par.getValue();
	            if (capital.startsWith(letra.toUpperCase())) {
	                encontrado = true;
	                System.out.println("Pas: " + par.getKey() + ", Capital: " + capital);
	            }
	        }
	        if (!encontrado) {
	            System.out.println("Ninguna capital del mapa comienza por '" + letra + "'.");
	        }
	    }
	 
	 public void mismaLetra() {
	        boolean encontrado = false;
	        Set<Entry<String, String>> pares = datosPais.entrySet();
	        for (Entry<String, String> par : pares) {
	            String primeraLetraPais = par.getKey().substring(0,1);
	            String primeraLetraCapital = par.getValue().substring(0,1);
	            if (primeraLetraPais.equals(primeraLetraCapital)) {
	                System.out.println("PAIS: " + par.getKey() + " - CAPITAL: " + par.getValue());
	                encontrado = true;
	            }
	        }
	        if (!encontrado) {
	            System.out.println("No hay ningn pas y capital que comiencen por la misma letra.");
	        }
	 }
	 
}

