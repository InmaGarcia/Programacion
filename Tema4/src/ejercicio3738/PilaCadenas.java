package ejercicio3738;


public class PilaCadenas extends Estructura{
		
	
	public PilaCadenas() {
		super();
	}

	@Override
	public String sacarCadena() {
		if(datos.isEmpty()) {
			return null;
		}
		return datos.remove(datos.size()-1);
	}
	
}
