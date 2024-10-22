/**
 * <h2>Clase para realizar la resta de los números dados a través de sus métodos o consola</h2>
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * En el caso de que uno de los números sea 0, la operación no lo tendrá en cuenta
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Resta {
	/**
	 * Números de tipo real que serán utilizados cuando el método lo requiera
	 */
	
	double num1, num2, num3;
	/**
	 * Número de tipo real que almacenará el resultado de las operaciones
	 */
	
	double resultado;
	/**
	 * Números de tipo entero que serán utilizados cuando el método lo requiera
	 */
	
	int numer1, numer2, numer3;
	/**
	 * Número de tipo entero que almacenará el resultado de las operaciones
	 */
	
	int resultadoent;
	/**
	 * 
	 * @param num1 Primer operando
	 * @param num2 Segundo operando
	 * @return Devuelve la diferencia de los números introducidos
	 */
	
	public double resta(double num1, double num2) {
		double resultado = num1 - num2;
		return resultado;
	}
	
	/**
	 * 
	 * @param numer1 Primer operando
	 * @param numer2 Primer operando
	 * @return Devuelve la diferencia de los números introducidos
	 */
		public int resta (int numer1, int numer2) {
			int resultadoent = numer1 - numer2;
			return resultadoent;
		}
		
		/**
		 * 
		 * @param num1 Primer operando
		 * @param num2 Segundo operando
		 * @param num3 Tercer operando
		 * @return Devuelve la diferencia de los dos primeros operandos, y de este resultado con el tercer operando
		 */
		public double resta(double num1, double num2, double num3) {
			double resultado = (num1 - num2) - num3;
			return resultado;
		
	}
		
		/**
		 * 
		 * @param num1 Primer Operando
		 * @return Devuelve la diferencia entre el resultado de la última operación almacenada y el operando introducido como parámetro
		 */
		public double resta(double num1) {
			resultado-= num1;
			return resultado;
		
	}
		}