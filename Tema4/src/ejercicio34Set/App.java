package ejercicio34Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> listaCadenas = new HashSet<>();
		String txt = "";

		// añadimos elementos a mi lista
		for (int i = 0; i < 5; i++) {
			System.out.println("Intoduce un texto");
			txt = sc.nextLine();
			listaCadenas.add(txt);
		}

		System.out.println(listaCadenas);

		// pasamos a mayusculas

		Set<String> auxiliar=new HashSet<>();
		for(String cadena : listaCadenas) {
			String cadenaMay = cadena.toUpperCase();
			auxiliar.add(cadenaMay);			
		}
		listaCadenas = auxiliar;
		System.out.println(listaCadenas);

		// lista tiene ""
		// Boolean cadenaVacia= listaCadena.contains("");
		if (listaCadenas.contains("")) {
			System.out.println("La lista contiene al menos una cadena vacía");
		} else {
			System.out.println("La lista no contiene cadenas vacías");
		}

		// borra todas las cadenas de la lista que tengan una longitud menor a 6
		// caracteres
		// hay que usar un iterador

		Iterator<String> iterador = listaCadenas.iterator();
		while (iterador.hasNext()) {
			txt = iterador.next();
			System.out.println(listaCadenas);
		}
		sc.close();
	}

}
