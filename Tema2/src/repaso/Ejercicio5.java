package repaso;

public class Ejercicio5 {

	public static void main(String[] args) {
		//  muestre por consola todos los números del 1 al 20 en una única línea
		
		Integer i;
		
		for (i=1; i<=20; i++) {
			if (i == 20) {
				System.out.print(i);
			}
			else {
				System.out.print(i+"_");
			}
		}
	}

}
