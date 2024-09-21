package repaso;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
			System.out.println("Introduce una dirección web");
			String web = scanner.nextLine();
			
			Integer primerCorte = web.indexOf("://");
			String primeraLinea = web.substring(0,primerCorte+3);
			
			Integer primerPunto = web.indexOf(".");
			String segundaLinea = web.substring(primerCorte+3,primerPunto);
			
			Integer ultimoPunto = web.lastIndexOf(".");
			String terceraLinea = web.substring(primerPunto+1, ultimoPunto);
			
			String cuartaLinea = web.substring(ultimoPunto+1);
			
			if(primerCorte != -1 && primerPunto != -1 && ultimoPunto != -1) {
			System.out.println(primeraLinea);
			System.out.println(segundaLinea);
			System.out.println(terceraLinea);
			System.out.println(cuartaLinea);
			}
			else {
				System.out.println("Formato de la dirección web incorrecto");
			}
		
		
		
		
scanner.close();

	}

}
