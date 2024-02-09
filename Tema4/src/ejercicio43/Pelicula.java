package ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	private Integer añoEstreno;
	private String titulo;
	private Guionista guionista;
	private Director director;
	private List<Actor> actores;
	
	public Pelicula() {
		super();
		this.actores = new ArrayList<>();
	}

	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
	
	
	
}
