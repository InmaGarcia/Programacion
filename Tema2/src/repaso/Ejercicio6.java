package repaso;

public class Ejercicio6 {

	public static void main(String[] args) {
		// muestre esta serie de números y la sume
		
		Integer i = 3;
		Integer acumulado = 0;
		Integer suma=0;
		
		while(acumulado <30) {
			suma = suma + acumulado;
			acumulado = acumulado + i; 
			
			if (acumulado <30) {
			System.out.print(acumulado + "+");
			}
			else {
				System.out.print(acumulado);
			}
				
	}
		System.out.print("=" + suma);
  }
}
