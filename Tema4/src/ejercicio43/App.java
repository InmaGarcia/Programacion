package ejercicio43;


public class App {

	public static void main(String[] args) {
		
		//Crea 4 actores:
		Actor actor1 = new Actor();
		actor1.setNombre("Blas Blau");
		actor1.setAñoNacimiento(1983);
		actor1.setNacionalidad("Española");
		
		Actor actor2 = new Actor();
		actor2.setNombre("Laura Pozo");
		actor2.setAñoNacimiento(1981);
		actor2.setNacionalidad("Italiana");
		
		Actor actor3 = new Actor();
		actor3.setNombre("Marcel Cade");
		actor3.setAñoNacimiento(2001);
		actor3.setNacionalidad("Suiza");
		
		Actor actor4 = new Actor();
		actor4.setNombre("Violeta Volo");
		actor4.setAñoNacimiento(1999);
		actor4.setNacionalidad("Rusa");
		
		//Crea 1 directora: 
		Director director = new Director();
		director.setNombre("Sara Marea");
		director.setAñoNacimiento(1994);
		director.setNacionalidad("Portuguesa");
		
		//Crea 2 guionistas:
		Guionista guionista1 = new Guionista();
		guionista1.setNombre("Marco Smith");
		guionista1.setAñoNacimiento(1988);
		guionista1.setNacionalidad("Inglesa");
		
		Guionista guionista2 = new Guionista();
		guionista2.setNombre("Cheng Shu");
		guionista2.setAñoNacimiento(1977);
		guionista2.setNacionalidad("China");
		
		/*Crea una película que se estrena en 2027 dirigida por Sara y con Marco como
        guionista. Actuarán Blas y Laura. Su título es “Do you know Joe Blas?”*/
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setAñoEstreno(2027);
		pelicula1.setDirector(director);
		pelicula1.setGuionista(guionista1);		
		pelicula1.getActores().add(actor1);
		pelicula1.getActores().add(actor2);
		pelicula1.setTitulo("Do you know Joe Blas?");
		
		/*Crea otra película con el mismo año de estreno y directora. 
		 * El guionista es el chino, y participan todos los actores. 
		 * Su título es “Muerte en la sombra”*/
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setAñoEstreno(2027);
		pelicula2.setDirector(director);
		pelicula2.setGuionista(guionista2);		
		pelicula2.getActores().add(actor1);
		pelicula2.getActores().add(actor2);
		pelicula2.getActores().add(actor3);
		pelicula2.getActores().add(actor4);
		pelicula2.setTitulo("Muerte en la sombra");
		
		//Imprime la lista de actores de la primera película
		System.out.println("Actores de la pelicula: "+pelicula1.getTitulo());
		System.out.println(pelicula1.getActores());
		
		//Imprime el sueldo del guionista de la primera película y su nacionalidad 
        System.out.println("Pelicula 1. Guionista: ");
        System.out.println("\t Sueldo:"+pelicula1.getGuionista().getSueldo());
		System.out.println("\t Nacionalidad:"+pelicula1.getGuionista().getNacionalidad());
		
		//Borra al actor suizo de la segunda película y añádelo a la primera 
		pelicula2.getActores().remove(actor3);
		pelicula1.getActores().add(actor3);
		
		//Imprime los actores de las dos películas 
		System.out.println("Actores de la pelicula: "+pelicula1.getTitulo());
		System.out.println(pelicula1.getActores());
		
		System.out.println("Actores de la pelicula: "+pelicula2.getTitulo());
		System.out.println(pelicula2.getActores());


	}

}
