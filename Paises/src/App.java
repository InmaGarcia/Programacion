

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Pais paises = new Pais();
        
        int paisesAgregados = 0;

        // Pidiendo 5 países y capitales al usuario
        while (paisesAgregados < 5) {
            System.out.println("Dime el nombre del país:");
            String pais = scanner.nextLine();

            System.out.println("Dime la capital del país:");
            String capital = scanner.nextLine();

            if (!paises.agregarPais(pais, capital)) {
                paisesAgregados++;
            } else {
                System.out.println("El país ya está en el mapa, actualizando la capital...");
            }
        }
        // Imprimir el mapa
        paises.imprimirPaises();

        // Calcular la longitud media de los nombres de los países
        System.out.println("Longitud media de los nombres de los países: " + paises.calcularLongitudMediaPaises());

        // Solicitar una letra y mostrar los países cuya capital empiezan por dicha letra
        System.out.println("Ingrese una letra para ver los países cuyas capitales comienzan con esa letra:");
        String letra = scanner.nextLine();
        System.out.println("Capitales que empiezan por : " + letra.toUpperCase());
        paises.imprimirPaisesPorLetra(letra);

        System.out.println("Paises y capitales que empiezan por la misma letra");
        // Mostrar los países cuyo nombre y capital comienzan por la misma letra
        paises.mismaLetra();

        int numPaises = paises.numeroPaisesConCapitalLetra(letra);
        System.out.println("Número de países cuya capital comienza por '" + letra + "': " + numPaises);

        // Eliminar el primer país cuya capital coincida con la solicitada
        paises.eliminarPaisConCapitalLetra(letra);

        // Volver a preguntar por el número de países con dicha capital
        numPaises = paises.numeroPaisesConCapitalLetra(letra);
        System.out.println("Después de eliminar, el número de países cuya capital comienza por " + letra + ":" + numPaises);

        scanner.close();
	}
	
}

