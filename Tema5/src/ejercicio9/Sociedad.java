package ejercicio9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {

	private Set<Persona> personas;

	public Sociedad() {
		super();
		this.personas = new HashSet<>();
	}

	public Set<Persona> getPersonas() {
		return personas;
	}

	public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException {
		Persona persona = new Persona();
		try {
			persona.setAltura(altura);
			persona.setGenero(genero);
			this.personas.add(persona);
		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
			throw new ParametroIncorrectoException();
		}
	}

	public BigDecimal calcularAlturaMedia(String genero) throws ListaVaciaException {
		BigDecimal suma = BigDecimal.ZERO;
		Integer contador =0;
		for (Persona persona : personas) {
			if (genero == null || persona.getGenero().equalsIgnoreCase(genero)) {
				suma = suma.add(persona.getAltura());
				contador ++;	
			}
		}
		if(contador == 0) {
			throw new ListaVaciaException("No hay ninguna persona con ese genero");
			
		}
		return suma.divide(new BigDecimal(contador), 2, RoundingMode.HALF_UP);
	}

}
