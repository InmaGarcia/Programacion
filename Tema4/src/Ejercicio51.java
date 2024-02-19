import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BigDecimal> numeros = new ArrayList<>();

		do {
			System.out.println("Dame un numero");
			BigDecimal x = sc.nextBigDecimal();

			if (numeros.isEmpty()) {
				numeros.add(x);
			} else if (x.compareTo(numeros.get(numeros.size() - 1)) > 0) {
				numeros.add(x);
			}

		} while (numeros.size() < 5);
		
		System.out.println("Lista de números: "+numeros);
		BigDecimal suma = BigDecimal.ZERO;
		
		for(int i=0; i< numeros.size();i++) {
			suma=suma.add(numeros.get(i));
		}
		
		
		System.out.println("La suma de todos mis números es: "
		+suma.setScale(1, RoundingMode.HALF_DOWN));
		
		BigDecimal division = numeros.get(0).divide(numeros.get(1),3, RoundingMode.HALF_UP);
		System.out.println("La división del 1º entre el 2º es: "+division);
		
		sc.close();

	}

}
