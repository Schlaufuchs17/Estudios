/**
 * <h2>Clase para realizar la resta de los n�meros dados a trav�s de sus m�todos o consola</h2>
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * En el caso de que uno de los n�meros sea 0, la operaci�n no lo tendr� en cuenta
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Resta {
	/**
	 * N�meros de tipo real que ser�n utilizados cuando el m�todo lo requiera
	 */
	
	double num1, num2, num3;
	/**
	 * N�mero de tipo real que almacenar� el resultado de las operaciones
	 */
	
	double resultado;
	/**
	 * N�meros de tipo entero que ser�n utilizados cuando el m�todo lo requiera
	 */
	
	int numer1, numer2, numer3;
	/**
	 * N�mero de tipo entero que almacenar� el resultado de las operaciones
	 */
	
	int resultadoent;
	/**
	 * 
	 * @param num1 Primer operando
	 * @param num2 Segundo operando
	 * @return Devuelve la diferencia de los n�meros introducidos
	 */
	
	public double resta(double num1, double num2) {
		double resultado = num1 - num2;
		return resultado;
	}
	
	/**
	 * 
	 * @param numer1 Primer operando
	 * @param numer2 Primer operando
	 * @return Devuelve la diferencia de los n�meros introducidos
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
		 * @return Devuelve la diferencia entre el resultado de la �ltima operaci�n almacenada y el operando introducido como par�metro
		 */
		public double resta(double num1) {
			resultado-= num1;
			return resultado;
		
	}
		}