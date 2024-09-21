import java.util.Scanner;

public class Ejercicio1 {
	
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Realizar un programa que pregunte por el año de nacimiento del usuario. 
		System.out.println("Introduce tu año de nacimiento");
		int nacimiento = scanner.nextInt();
		
		//Según lo que nos indique, mostrarle por consola a qué generación pertenece
        // 1883-1900 perdida
		if (nacimiento >=1883 && nacimiento <=1900) {
			System.out.println("Eres de la Generación Perdida");
		}
		//1901-1927 grandiosa
		else if(nacimiento >=1901 && nacimiento <=1927) {
			System.out.println("Eres de la Generación Grandiosa");
		}
		//1928-1945 silencionsa
		else if(nacimiento >=1928 && nacimiento <=1945) {
			System.out.println("Eres de la Generación Silenciosa");
		}
		//1946-64 babyboomers
		else if(nacimiento >=1946 && nacimiento <=1964) {
			System.out.println("Eres de la Generación Baby Boomers");
		}
		//1965-1980 X
		else if(nacimiento >=1965 && nacimiento <=1980) {
			System.out.println("Eres de la Generación X");
		}
		//1981-1996 millenials
		else if(nacimiento >=1981 && nacimiento <=1996) {
			System.out.println("Eres de la Generación Millenials o Y");
		}
		//1997-2012 Zoomers
		else if(nacimiento >=1997 && nacimiento <=2012) {
			System.out.println("Eres de la Generación Zoomers o Z");
		}
		//2010-2020 alfa
		else if(nacimiento >=2013 && nacimiento<=2023) {
			System.out.println("Eres de la Generación Alfa");
		}
		
		
		scanner.close();
		
	}

}
