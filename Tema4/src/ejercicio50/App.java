package ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		//1. Crea un Set vacío e imprímelo
		Set<Pais> paises = new HashSet<>();
		System.out.println(paises);
		
		//2. Crea tres países: 
		Pais españa = new Pais("ES", "España");
		Pais cook = new Pais("CK","Islas Cook");
		Pais caiman = new Pais("CK","Islas Caiman");
		
		//3. Añade los 3 países e imprímelo. Deberían aparecer 2. ¿Sabes por qué?
		paises.add(españa);
		paises.add(cook);
		paises.add(caiman);
		
		System.out.println(paises);
		// salen dos porque las islas tienen el mismo codigo
		//4. Crea otro país (es / España) y añádelo al conjunto. Imprímelo.
		Pais españa1 = new Pais("es", "España");
		paises.add(españa1);
		System.out.println(paises);
		//5. ¿Qué podrías hacer para que no ocurriera lo del punto 3
		//Si sabes qué… hazlo y repite el punto anterior.
		System.out.println(paises);
		
		//6. Borra todos los países que no sean “ES” del conjunto. Luego imprímelo
		Iterator<Pais> iterador = paises.iterator();
		while(iterador.hasNext()) {
			if(!iterador.next().getCodigo().equals("ES")) {
				iterador.remove();
			}
		}
		System.out.println(paises);
		//7. Vacía el conjunto.
		paises.clear();
		System.out.println(paises);

	}

}
