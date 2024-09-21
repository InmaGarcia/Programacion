package ejercicio44;

public class App {

	public static void main(String[] args) {
		
		//1. Crea un jugador que tenga un equipo de combate compuesto por 3 asesinos. 
        // para crear el jugador primero debo hacerle el equipo y para hacer 
		//el equipo antes tengo que elaboral la lista de asesinos
		
		Asesino asesino1 = new Asesino();
		asesino1.setCodigo("A001");
		asesino1.setNombre("Alpha");
		Asesino asesino2 = new Asesino();
		asesino2.setCodigo("A002");
		asesino2.setNombre("Beta");
		Asesino asesino3 = new Asesino();
		asesino3.setCodigo("A003");
		asesino3.setNombre("Gamma");
		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Inmyta");
		
		EquipoCombate equipoAzul = new EquipoCombate();
		jugador1.setEquipo(equipoAzul);
		equipoAzul.añadirPersonaje(asesino1);
		equipoAzul.añadirPersonaje(asesino2);
		equipoAzul.añadirPersonaje(asesino3);
		
		//2. Crea un parásito.Muestra cuántos puntos quita al rival y cada cuánto tiempo. 
		Parasito parasito1= new Parasito();
		parasito1.setNombre("Blas");
		parasito1.setCodigo("B69");
		
        //3. Añade el parásito Blas al jugador. y al e
		jugador1.getEquipo().añadirPersonaje(parasito1);
		
		//4. Imprime los puntos de vida del equipo de combate del jugador
		System.out.println("Puntos totales del equipo: "+
		jugador1.getEquipo().getTotalPuntosVida());
		//5. Intenta añadir de nuevo el parásito Blas al equipo del jugador
		jugador1.getEquipo().añadirPersonaje(parasito1);
		//6. Imprime todos los personajes del equipo de combate del jugador (Deberían ser sólo 4)
		System.out.println(equipoAzul);
		//7. Crea otros dos parásitos nuevos. Intenta añadirlos al equipo de combate del jugador.
		Parasito parasito2= new Parasito();
		parasito2.setNombre("Garrapata");
		parasito2.setCodigo("B68");
		jugador1.getEquipo().añadirPersonaje(parasito2);
		Parasito parasito3= new Parasito();
		parasito3.setNombre("Chinche");
		parasito3.setCodigo("B67");
		equipoAzul.añadirPersonaje(parasito3);
		//8. Imprime todos los personajes del equipo de combate del jugador (Deberían ser sólo 5)
		System.out.println(equipoAzul);
		//9. Imprime los puntos del equipo de combate del jugador. (Deberían ser 700) 
		System.out.println("Puntos totales del equipo: "+
				equipoAzul.getTotalPuntosVida());


	}

}
