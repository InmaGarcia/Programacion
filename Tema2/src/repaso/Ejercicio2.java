package repaso;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// solicite tres nombres de ciudades al usuario
		System.out.println("Introduzca una ciudad");
		String ciudad1 = scanner.nextLine();
		System.out.println("Introduzca otra ciudad");
		String ciudad2 = scanner.nextLine();
		System.out.println("Introduzca una última ciudad)");
		String ciudad3 = scanner.nextLine();
		
		//imprimir por consola esos nombres ordenados según la longitud de cada nombre
		//menos letras saldrá primero
		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		
		if (longitud1 <= longitud2 && longitud2<= longitud3) {
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			System.out.println(ciudad3);
		}
		else if (longitud1>= longitud2 && longitud2>=longitud3) {
				System.out.println(ciudad3);
				System.out.println(ciudad2);
				System.out.println(ciudad1);
			}
		else if(longitud2 <= longitud1 && longitud1<=longitud3){
				System.out.println(ciudad2);
				System.out.println(ciudad1);
				System.out.println(ciudad3);
			}
		else if(longitud1<=longitud3 && longitud3<=longitud2){
			   System.out.println(ciudad1);
			   System.out.println(ciudad3);
			   System.out.println(ciudad2);
			}
		else if(longitud2<=longitud3 && longitud3<=longitud1){
		       System.out.println(ciudad2);
		       System.out.println(ciudad3);
		       System.out.println(ciudad1);
			}
		else if(longitud3<=longitud1 && longitud1<=longitud2){
			    System.out.println(ciudad3);
			    System.out.println(ciudad1);
			    System.out.println(ciudad2);
				}
		
		scanner.close();
		}


}
