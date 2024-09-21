package repaso;

import java.util.Scanner;

public class Ejercicio4 {
	
    public static final double CUARENTA = 0.4;
    public static final double VEINTE = 0.2;
    public static final double DIEZ = 0.1;
    public static final double SIN = 0;
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// calcule los descuentos a aplicar a una compra según
		//Si la compra es superior a 100 unidades, aplicar un 40% de descuento. 
		//Si la compara está entre 25 y 100 unidades, 20% de descuento
		//Si la compra está entre 10 y 24 unidades, realizar un 10% de descuento.
		//Si la compra es inferior a 10 unidades, no se aplica descuento.
		//Se nos pedirá por teclado Precio y Unidades. Se obtendrá como resultado el Subtotal a pagar,
		//el Descuento aplicado y el Total a pagar. 
		System.out.println("Introduce el precio del artículo");
		double precio = scanner.nextDouble();
		System.out.println("Introduce las unidades del artículo");
		Integer unidades = scanner.nextInt();
		double subtotal = unidades * precio;
		double descuento;
		
		
		if (unidades>100) {
			descuento = CUARENTA*subtotal;
			//System.out.println("El descuento para "+unidades+" unidades es de "+CUARENTA+"%");
		}
		else if( unidades>=25) {
			descuento = VEINTE *subtotal;
			//System.out.println("El descuento para "+unidades+" unidades es de "+VEINTE+"%");
		}
		else if (unidades >= 10) {
			descuento = DIEZ*subtotal;
			//System.out.println("El descuento para "+unidades+" unidades es de "+DIEZ+"%");
		}
		else {
			descuento = SIN * subtotal;
			//System.out.println("El descuento para "+unidades+" unidades es de "+SIN+"%");
			}
			
		double total = subtotal - descuento;
		
		
		System.out.println("El subtotal es de: "+subtotal);
		System.out.println("El descuento es de: "+descuento);
		System.out.println("El total es de: "+total);
		
			
		scanner.close();
	}

}
