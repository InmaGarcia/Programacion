package ejercicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> listaCadena = new ArrayList<>();
		String txt = "";

		// añadimos elementos a mi lista
		for (int i = 0; i < 5; i++) {
			System.out.println("Intoduce un texto");
			txt = sc.nextLine();
			listaCadena.add(txt);
		}

		System.out.println(listaCadena);

		// pasamos a mayusculas
		for (int i = 0; i < listaCadena.size(); i++) {
			txt = listaCadena.get(i).toUpperCase();
			listaCadena.set(i, txt);
			// listaCadena.set(i,listaCadena.get(i).toUpperCase());
		}

		System.out.println(listaCadena);

		// lista tiene ""
		// Boolean cadenaVacia= listaCadena.contains("");
		if (listaCadena.contains("")) {
			System.out.println("La lista contiene al menos una cadena vacía");
		} else {
			System.out.println("La lista no contiene cadenas vacías");
		}

		// borra todas las cadenas de la lista que tengan una longitud menor a 6
		// caracteres
		// hay que usar un iterador

		Iterator<String> iterador = listaCadena.iterator();
		while (iterador.hasNext()) {
			txt = iterador.next();
			System.out.println(listaCadena);
		}

		sc.close();

	}

}
