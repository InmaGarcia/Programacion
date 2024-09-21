package repaso;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer opcion = 0;
		
		// muestre por consola un menú de opciones al usuario
		//nos quedaremos esperando la opción indicada mediante un número
		do {
			
			System.out.println("***MENÚ***\n1. Abrir \n2. Guardar \n3. Modificar \n4. Salir");
		    opcion = scanner.nextInt();
		 //entre el 1 y el 3 Escribiremos que ha elegido la opción que sea (Abrir, Guardar, Modificar) y volveremos a mostrar de nuevo el menú.
	     // n 4  Escribiremos “Bye Bye” y el programa terminará.
	     //opción cualquiera  Escribiremos que esa opción de menú no es correcta. Volveremos a mostrar el menú.
			
		    
		    if (opcion ==1) {
				System.out.println("Ha elegido Abrir");
			}
			else if (opcion ==2) {
				System.out.println("Ha elegido Guardar");
			}
			else if (opcion ==3) {
				System.out.println("Ha elegido Modificar");
			}
			else if (opcion ==4) {
				System.out.println("Bye bye");
			}
			else {
				System.out.println("Esa opción del menú no es correcta");
			}
		    
		}while ( opcion != 4);
		
		
		scanner.close();
	}

}

