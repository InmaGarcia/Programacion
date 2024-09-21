package ejercicio44;

public class Parasito extends Personaje{
	
	public static final Integer PUNTOS_VIDA = 200;
	public static final Integer DAÑO= 2;
	public static final Integer DAÑO_TIEMPO = 1;
	
	
	@Override
	public Integer getPuntosVida() {
		return PUNTOS_VIDA;
	}
	@Override
	public Integer getDaño(){
		return DAÑO;
	}
	@Override
	public Integer getDañoTiempo() {
		return DAÑO_TIEMPO;
	}
	
	
}
