package ExamenA;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaNormal extends Cita {

	public CitaNormal(LocalDate fecha, Integer hora, String nombrePaciente, Boolean seguro) {
		super(fecha, hora, nombrePaciente, seguro);

	}

	@Override
	public BigDecimal getImporteFactura() {
		
		 
		if(getSeguro() == true){
			return new BigDecimal(100);
		}else {
		return new BigDecimal(150);	
		}
		
	}

}

