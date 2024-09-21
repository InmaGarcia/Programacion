import java.util.Scanner;

public class EjercicioAvanzado1 {
	
    public static final double PI = 3.14;
    
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
		//Realizar un programa que solicite el radio de un círculo 
		System.out.println("Introduce el radio del círculo");
		double radio = scanner.nextDouble();
		//nos indique a continuación cuál es la circunferencia (perímetro)
		double circunferencia = 2*PI*radio;
		System.out.println("La circunferencia seria de "+circunferencia+" cm");
        // área de dicho círculo como resultado.
		double areaCirculo = PI*(radio*radio);
		System.out.println("El área del círculo es de "+areaCirculo+" cm2");
		//Utiliza las constantes de Java cuando consideres oportuno.
		
		scanner.close();

	}

}
