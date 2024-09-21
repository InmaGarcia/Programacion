package ejercicio44;

public class Asesino extends Personaje{
	
	public static final Integer PUNTOS_VIDA = 100;
	public static final Integer DAÑO= 10;
	public static final Integer DAÑO_TIEMPO = 5;
	
	
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
