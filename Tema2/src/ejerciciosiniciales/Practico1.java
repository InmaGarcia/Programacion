package ejerciciosiniciales;

public class Practico1 {

	public static void main(String[] args) {
		String frase= "123456789 123456789";
		Integer index1 = frase.indexOf("5");
		Integer index2 = frase.lastIndexOf("5");
		String palabra = frase.substring(index1, index2);
		System.out.println(palabra.length());

	}

}
