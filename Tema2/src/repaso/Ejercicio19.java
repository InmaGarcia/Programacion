package repaso;

import java.util.Scanner;

public class Ejercicio19 {
	
    public static final double VALOR_EURO = 166.386;
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		Integer num;
		
		// programa que sea un conversor de euros a peseta y viceversa
		do {//Mostrará este menú
			System.out.println("1 - Pasar de Pesetas a Euros\n2 - Pasar de Euros a Pesetas\n3 - Salir");
			num = scanner.nextInt();
			
			if (num == 1 || num ==2) {
				System.out.println("Introduce la cantidad");
			    double cantidad = scanner.nextDouble();
			    if(num==1) {
			    	double euros = cantidad/VALOR_EURO;
			    	System.out.println(cantidad+" pesetas son "+euros+" euros");
			    }
			    else {
			    	double pesetas = cantidad * VALOR_EURO;
			    	System.out.println(cantidad+" euros son "+pesetas+" pesetas");
			    }
			   
			}
			else {
				System.out.println("Bye bye");
			}	
			
		}//la opción 3, el programa termina. 
		while(num!=3);

		
		scanner.close();
	}

}
