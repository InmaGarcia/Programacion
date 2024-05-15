package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import servicios.ProyectoNotFoundException;

public class Empresa {

	private String nombreComercial;
	private List<Proyecto> proyectos;
	private List<Programador> programadores;

	
	public Empresa() {
		super();
		this.proyectos = new ArrayList<>();
		this.programadores = new ArrayList<>();
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public List<Programador> getProgramadores() {
		return programadores;
	}

	public void setProgramadores(List<Programador> programadores) {
		this.programadores = programadores;
	}

	public Map<String, List<Programador>> getMapaProgramadores() {
		Map<String, List<Programador>> mapa = new HashMap<>();

		for (Proyecto proyecto : proyectos) {
			mapa.put(proyecto.getCodigoProyecto(), proyecto.getProgAsignados());
		}
		return mapa;
	}

	public Proyecto getProyectoMayorEquipo() throws ProyectoNotFoundException {

		if (proyectos.isEmpty()) {
			throw new ProyectoNotFoundException("No hay proyectos");
		}
		/*Integer num = 0;
		Proyecto p = new Proyecto("0", "0");
		for (Proyecto proyecto : proyectos) {
			if (proyecto.getProgAsignados().size() > num) {
				num = proyecto.getProgAsignados().size();
				p = new Proyecto(proyecto.getCodigoProyecto(), proyecto.getDescripcion());
			}
		}*/
		Proyecto p = proyectos.get(0);
		for (Proyecto proyecto : proyectos) {
			if (proyecto.getProgAsignados().size() > p.getProgAsignados().size()) {
				p = proyecto;
			}
		}
		return p;
	}

	public BigDecimal getSueldosProyecto(String codigoP) throws ProyectoNotFoundException {

		if (proyectos.isEmpty()) {
			throw new ProyectoNotFoundException("No existe proyecto con el código indicado");
		}

		List<Programador> progAsignados = new ArrayList<>();

		for (Proyecto proyecto : proyectos) {
			if (proyecto.getCodigoProyecto().equals(codigoP)) {
				progAsignados = proyecto.getProgAsignados();
			}
		}
		BigDecimal suma = BigDecimal.ZERO;
		for (Programador prog : progAsignados) {
			suma.add(prog.getSueldoFinal());
		}

		return suma.setScale(2, RoundingMode.HALF_DOWN);
	}
	
	public List<Proyecto> getProyectosActualesSinPresupuesto() {
		List<Proyecto> actuales = new ArrayList<>();
		LocalDate hoy = LocalDate.now();
		for(Proyecto proyecto : proyectos) {
			Boolean inicioA = hoy.isAfter(proyecto.getFechaInicio()); //hoy es despues del inicio 
			Boolean entregado = hoy.isBefore(proyecto.getFechaEntrega()); //hoy es antes de la fecha de entrega, aun no se entrego
			
			if(inicioA && entregado && proyecto.getPresupuestoRestante().compareTo(BigDecimal.ZERO) ==0) {//proyecto en vigor y presupuestoR es 0
				actuales.add(proyecto);
			}
		}
		return actuales;
	}

	@Override
	public String toString() {
		String mensaje ="---------------------\n"+nombreComercial+"\n---------------------\nProyecto:\n\t";
		for(Proyecto proyecto : proyectos) {
			
		}
		return mensaje;
	}
	
	

}
