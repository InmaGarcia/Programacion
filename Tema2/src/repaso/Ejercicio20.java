package repaso;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Integer x,y;
		//programa que muestre por pantalla un cuadrado de 5x5 con su diagonal *
		for(x=0; x<5; x++) {
			for(y=0; y<5; y++) {
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

}
