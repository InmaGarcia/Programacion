import java.util.Scanner;

public class Depuracion1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce tu fecha de nacimiento en formato DD-MM-AAAA: ");
	        String fechaNacimiento = scanner.nextLine();

	        // Dividir la fecha de nacimiento en año, mes y día
	        String[] partes = fechaNacimiento.split("-");
	        Integer diaNacimiento = Integer.parseInt(partes[0]);
	        Integer mesNacimiento = Integer.parseInt(partes[1]);
	        Integer yearNacimiento = Integer.parseInt(partes[2]);
	       
	        System.out.print("Introduce la fecha de hoy en formato DD-MM-AAAA: ");
	        String fecha = scanner.nextLine();

	        // Dividir la fecha de hoy en año, mes y día
	        String[] partes2 = fecha.split("-");
	        Integer diaHoy = Integer.parseInt(partes2[0]);
	        Integer mesHoy = Integer.parseInt(partes2[1]);
	        Integer yearHoy = Integer.parseInt(partes2[2]);

	        // Calcular la edad
	        Integer edad = yearHoy - yearNacimiento;

	        // Verificar si es mayor de edad
	        if (edad > 18 || (edad == 18 && (mesHoy > mesNacimiento || (mesHoy == mesNacimiento && diaHoy >= diaNacimiento)))) {
	            System.out.println("Eres mayor de edad.");
	        } else {
	            System.out.println("Eres menor de edad.");
	        }
	        scanner.close();
	    }
	}