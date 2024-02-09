
public class Libro {
	
	    private String titulo;
	    private String autor;
	    private static Integer edicion;
	    
	    public Libro(String titulo, String autor){
	        this.titulo = titulo;
	        this.autor = autor;
	    }
	    
	    public void setTitulo(String titulo){
	        this.titulo = titulo;
	    }
	    
	    public void setAutor(String autor){
	        this.autor = autor;
	    }
	    
	    public static void setEdicion(Integer añoEdicion){
	        edicion = añoEdicion;
	    }
	    
	    public String getTitulo(){
	        return titulo;
	    }
	    
	    public String getAutor(){
	        return autor;
	    }
	    
	    public static Integer getEdicion(){
	        return edicion;
	    }

	}

