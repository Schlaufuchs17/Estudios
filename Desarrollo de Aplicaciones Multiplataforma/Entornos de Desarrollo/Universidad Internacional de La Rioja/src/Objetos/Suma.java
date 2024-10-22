package Objetos;

/**
 * <h2>Clase que realiza la suma de varios sumandos (2, 3, o m�s)</h2>
 * En el caso de que uno de los n�meros sea 0, la operaci�n no lo tendr� en cuenta
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Suma {
	/**
	 * N�mero de tipo real que ser� el primer sumando de los m�todos correspondientes
	 */
	
	double sum1;
	/**
	 * N�mero de tipo real que ser� el segundo sumando de los m�todos correspondientes
	 */
	
	double sum2;
	/**
	 * N�mero de tipo real que ser� el tercer sumando de los m�todos correspondientes
	 */
	
	double sum3;
	/**
	 * N�mero real. Guardar� el resultado de los m�todos correspondientes
	 */
	
	double result;
	/**
	 * N�mero entero que ser� el primer sumando de los m�todos correspondientes
	 */
	
	int suman1;
	/**
	 * N�mero entero que ser� el segundo sumando de los m�todos correspondientes
	 */
	int suman2;
	/**
	 * N�mero entero que ser� el tercer sumando de los m�todos correspondientes
	 */
	int suman3;
	/**
	 * N�mero entero. Guardar� el resultado de los m�todos correspondientes
	 */
	int resultado;
	
	/**
	 * M�todo que suma los dos m�todos reales introducidos como par�metros
	 * @param sum1 Primer sumando
	 * @param sum2 Segundo sumando
	 * @return Devuelve un n�mero real que es el resultado de los dos m�todos introducidos como par�metros
	 */
	private int va;
	
	public double sumareal(double sum1, double sum2) {
		
		return result;
		
	}
	/**
	 * M�todo que suma dos n�meros enteros introducidos como par�metros
	 * @param suman1 Primer sumando
	 * @param suman2 Segundo sumando
	 * @return Devuelve un n�mero entero que es el resultado de los dos n�meros introducidos como par�metros
	 */
	public double sumaint(int suman1, int suman2) {
		
		return resultado;
		
	}
	/**
	 * M�todo que suma los tres n�meros reales introducidos como par�metros
	 * @param sum1 Primer sumando
	 * @param sum2 Segundo sumando
	 * @param sum3 Tercer sumando
	 * @return Devuelve un n�mero real que es el resultado de los tres n�meros introducidos como par�metros
	 */
	public double sumareal(double sum1, double sum2, double sum3) {
		result = sum1 + sum2 + sum3;
		return result;
		
	}
	/**
	 * M�todo que suma un n�mero dado como par�metro al valor que en ese momento tenga el resultado de una operaci�n anterior
	 * @param suman1 Primer sumando
	 * @return Devuelve un n�mero entero resultado de la suma del n�mero dado como par�metro y el introducido a trav�s de consola
	 */
	public double sumaint(int suman1) {
		result = suman1+=result;
		return result;
		
	}
	
	public int ValorAcumulado(int n1) {
		va = va+n1;
		return va;
	}
}