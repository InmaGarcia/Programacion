package repaso;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//solicitar al usuario un número mayor a 0, si no lo es, volver a solicitarlo
       //y dibujar el cuadrado con se numero de filas y columnas
		Integer num;
		
		do {
			System.out.println("Introduce un número de filas y columnas");
			num = scanner.nextInt();
			if(num>0) {
				for(Integer x=1; x<=num; x++) {
					for(Integer y=1; y<=num; y++) {
						if(x==y) {
							System.out.print("* ");
						}
						else {
							System.out.print("- ");
						}
					}
					System.out.println();
				}
			}
			else {
				System.out.println("Valor no válido");
			}	
		}
		while(num<=0);
		
		scanner.close();
	}

}
