package ejercicio3;

public class Telefono {
	
	private Integer numero;
	private Boolean enLlamada;
	
	public Telefono(Integer numero) {
		super();
		this.numero = numero;
		this.enLlamada = false;
	}
	
	public Integer consultarNumero() {
		return this.numero;
	}
	
	public void marcar(Integer num) {
		System.out.println("LLAMANDO A "+num);
		if(num.compareTo(this.numero) == 0) {
			System.out.println("COMUNICANDO");
		}
		else {
			System.out.println("EN COMUNICACIÓN");
			this.enLlamada= true;
		}
	}
	
	public void colgar() {
		if (this.enLlamada) {
			System.out.println("COMUNICACIÓN TERMINADA");
			this.enLlamada= false;
		}
		else {
			
		}
	}
	

}
