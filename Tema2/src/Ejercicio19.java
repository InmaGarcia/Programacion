import java.util.Scanner;

public class Ejercicio19 {

	public static final double NORMAL = 0.21;
	public static final double REDUCIDO = 0.10;
	public static final double SUPERREDUCIDO = 0.04;
	public static final double EXENTO = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// CALCULE EL IVA DEL PRODUCTO
		// SOLICITAMOS EL PRECIO SIN IVA
		// SOLICITAMOS EL TIPO DE IVA
		
		System.out.println("Introduce el precio sin IVA del artículo");
		double precioSin = scanner.nextDouble();
		
		scanner.nextLine();

		System.out.println("Dime si el IVA es Normal, Reducido, Superreducido, Exento");
		String tipoIva = scanner.nextLine();
		String minusculas = tipoIva.toLowerCase();
		double iva;
		double precioCon;

		switch (minusculas) {
		case "normal":
			iva = precioSin * NORMAL;
			precioCon = precioSin + iva;
			System.out.println("El precio del articulo con IVA es: " + precioCon);
			break;
		case "reducido":
			iva = precioSin * REDUCIDO;
			precioCon = precioSin + iva;
			System.out.println("El precio del articulo con IVA es: " + precioCon);
			break;
		case "superreducido":
			iva = precioSin * SUPERREDUCIDO;
			precioCon = precioSin + iva;
			System.out.println("El precio del articulo con IVA es: " + precioCon);
			break;
		case "exento":
			iva = precioSin * EXENTO;
			precioCon = precioSin + iva;
			System.out.println("El precio del articulo con IVA es: " + precioCon);
			break;
		default:
			System.out.println("Tipo de IVA incorrecto");

		}

		scanner.close();
	}

}
