package ejercicio3738;


public class ColaCadena extends Estructura{
		

	public ColaCadena() {
		super();
	}
	
	@Override
	public String sacarCadena() {
		if(datos.isEmpty()) {
			return null;
		}
		String devuelve = datos.get(0);
		datos.remove(0);
		return devuelve; //return cola.remove(0); esto es lo mismo 
	}
	
	
}
