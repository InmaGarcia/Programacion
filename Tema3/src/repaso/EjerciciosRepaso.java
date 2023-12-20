package repaso;

import java.util.Scanner;

public class EjerciciosRepaso {

	public static final Double PRECIO =0.24;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
	
	
	Integer suspensos =0;
	Integer aprobados =0;
	Integer suma =0;
	for(Integer nota : listaNotas) { 
		if(nota<5) {
			suspensos++;
		}
		else {
			suma+=nota;
			aprobados++;
		}
	}
	//Haz un programa que cuente cuántos alumnos han suspendido (tienen menos de un 5).
	System.out.println("Total alumnos suspensos: "+suspensos);
	
	//Haz un programa que calcule la media de los alumnos que han aprobado
	Integer mediaAprobados= suma/aprobados;
	System.out.println("Nota media de aprobados: "+mediaAprobados);
	
	suspensos =0;
	aprobados =0;
	suma =0;
	// hazlo con for
	for(int i= 0; i < listaNotas.length; i++) { 
		if(listaNotas[i]<5) {
			suspensos++;
		}
		else {
			suma+=listaNotas[i];
			aprobados++;
		}
	}
	System.out.println("Total alumnos suspensos: "+suspensos);
	mediaAprobados= suma/aprobados;
	System.out.println("Nota media de aprobados: "+mediaAprobados);
	
	//pregunte al usuario qué nota está buscando
	//buscar en la lista de notas si existe alguna igual a la que el usuario ha indicado
	//e imprimir si se ha encontrado y en qué posición	
	System.out.println("¿Qué nota buscas?");
	Integer buscador = scanner.nextInt();
	Integer contador =0;
	for(int i =0; i<listaNotas.length; i++) {
		if(listaNotas[i]==buscador) {
			System.out.println("La nota buscada existe y está en la posición "+i);
		}
		else {
			contador++;
			if(contador==listaNotas.length) {
				System.out.println("Tu nota no existe");
			}
		}		
	}
	
	//pregunte qué nota está buscando. Buscar en la lista todas las que sean mayores 
	//y contarlas
	System.out.println("¿Qué nota buscas?");
	Integer menor = scanner.nextInt();
	contador=0;
	for(int i =0; i<listaNotas.length; i++) {
		Boolean mayor = listaNotas[i] > menor;
		if(mayor == true) {
			contador++;
		}
		
	}
	System.out.println("Hay "+contador+" notas mayores a la indicada");
	
	//Haz un programa que cambie las notas de la lista del siguiente modo
	//todas las notas que sean menores a 5, pasarán a ser un 5
	System.out.println("Todos aprobados");
	for(Integer nota : listaNotas) { 
		if(nota<5) {
			nota = 5;
		}
		System.out.print(" "+nota);//con esto no cambiamos el array solo imprimimos un valor diferente
		//pero el array sigue siendo el mismo
	}
	
	//posiciones pares del array tendrá que multiplicarse por 2
	System.out.println();
	System.out.println("Las posiciones pares * 2");
	for(int i=0; i< listaNotas.length; i++) {
		Integer resto = i % 2;
		if(resto == 0) {
			listaNotas[i] = listaNotas[i]*2;
		}
		System.out.print("  "+listaNotas[i]);
	}
	
	scanner.close();
	}

}
