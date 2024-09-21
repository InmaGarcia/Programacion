
import java.util.Scanner;

public class Depuracion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 <= numero2 || numero2 <= numero3) {// En vez de || debe ser && asi sera cierto el mensaje del syso
            System.out.println("El primer n�mero no puede ser menor que los otros.");
        } else {
            if (numero1 % numero2 == 1) { //los números que probe 8 y 4 deben entrar para que puedan decirme que son multiplo
            	//pero no entran ya que los números multiplos dan de modulo 0 numero1 % numero2 == 0
            	System.out.println(numero1 +" es multiplo de: " +numero2);
            }
            if (numero1 % numero3 == 1) {//los números que probe 8 y 2 deben entrar para que puedan decirme que son multiplo
            	//pero no entran ya que los números multiplos dan de modulo 0 numero1 % numero2 == 0
            	System.out.println(numero1 +" es multiplo de: " +numero2); //Aqui en ves de numero2 debe imprimir el numero3 que es el que comprobamos
            }
        }

        scanner.close();
    }
}