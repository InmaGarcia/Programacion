package avanzados;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1dados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// simular las tiradas de dos dados
	
				
		// pedir usuario que indique qué cantidad de tiradas
		System.out.println("¿Cuántas veces tiramos los dados?");
		Integer tiradas = scanner.nextInt();
		// simulación generando aleatorios del 1 al 6 para cada dado
	
		Integer [] estadisticas = new Integer [11];
		
		for(int i = 0; i<estadisticas.length; i++) {
			estadisticas[i] =0;
		}
		
		do {
		Integer dado1= random.nextInt(1,7);
		Integer dado2= random.nextInt(1,7);
   
		Integer resultado= dado1 + dado2;
		System.out.print(resultado+"\t");
		// mostrar resultado estadístico del porcentaje obtenido 
		// para cada posible resultado del 2 al 12
		
		for(int i = 0; i<estadisticas.length; i++) {
			if(resultado == i+2 ) {
			estadisticas[i]+=1;
			}
		}
		tiradas--;
		}
		while(tiradas>0);
		
		System.out.println();
		for(int i = 0; i<estadisticas.length; i++) {
			if(estadisticas[i]>0) {
			System.out.println(i+2+" sale "+estadisticas[i]+" veces");
			}
		}
	
  scanner.close();
	}

}
