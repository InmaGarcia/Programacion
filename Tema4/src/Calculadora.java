
public class Calculadora {

	public static void main(String[] args) {
	}
	
		public static Integer suma(Integer num1, Integer num2) {
			return num1 + num2;
		}
		
		public static Integer resta(Integer num1, Integer num2) {
			return num1 - num2;
		}
		
		public static Integer division(Integer num1, Integer num2) {
			if(num2==0) {
				return 0;
			}
			else {
				return num1/num2;
			}
		}
		
		public static Integer multiplicacion(Integer num1, Integer num2) {
			return num1 * num2;
		}
		
		public static Integer calcular(Integer num1, Integer num2, String cadena) {
			Integer operacion =0;
			
			if(cadena.equalsIgnoreCase("add")) {
				operacion = suma(num1, num2);	
			}
			else if(cadena.equalsIgnoreCase("sub")) {
				operacion = resta(num1, num2);	
			}
			else if(cadena.equalsIgnoreCase("mul")) {
				operacion = multiplicacion(num1, num2);	
			}
			else if(cadena.equalsIgnoreCase("div")) {
				operacion = division(num1, num2);	
			}
			return operacion;
		}

	}

