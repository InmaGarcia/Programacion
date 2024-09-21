package modulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jugador {
	
	private Integer num;
	private String codigoEq;
	private String nombreJug;
	private LocalDate fechaNacimiento;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getCodigoEq() {
		return codigoEq;
	}
	public void setCodigoEq(String codigoEq) {
		this.codigoEq = codigoEq;
	}
	public String getNombreJug() {
		return nombreJug;
	}
	public void setNombreJug(String nombreJug) {
		this.nombreJug = nombreJug;
	}
	public LocalDate getFecha_nacimiento() {
		return fechaNacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fechaNacimiento = fecha_nacimiento;
	}
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaN = this.fechaNacimiento.format(formato);
		
		return "Jugador [num=" + num + ", codigoEq=" + codigoEq + ", nombreJug=" + nombreJug + ", fecha_nacimiento="
				+ fechaN + "]";
	}
	
	
	

}
