package ejercicio3;

public class Movil extends Telefono {
	
	private LocalizacionGps gps;

	public Movil(Integer numero, LocalizacionGps gps) {
		super(numero);
		this.gps = gps;
	}
	
	

}
