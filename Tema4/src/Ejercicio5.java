import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		Integer num1 = sc.nextInt();

		System.out.println("Introduce otro número");
		Integer num2 = sc.nextInt();

		System.out.println("La suma es: " + suma(num1, num2));

		sc.close();
	}

	public static Integer suma(Integer num1, Integer num2) {
		Integer suma = num1 + num2;
		return suma;
	}

}
