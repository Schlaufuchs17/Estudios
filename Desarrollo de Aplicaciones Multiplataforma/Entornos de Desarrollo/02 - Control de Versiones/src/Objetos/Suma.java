package Objetos;

/**
 * <h2>Clase que realiza la suma de varios sumandos (2, 3, o más)</h2>
 * En el caso de que uno de los números sea 0, la operación no lo tendrá en cuenta
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Suma {
	/**
	 * Número de tipo real que será el primer sumando de los métodos correspondientes
	 */
	
	double sum1;
	/**
	 * Número de tipo real que será el segundo sumando de los métodos correspondientes
	 */
	
	double sum2;
	/**
	 * Número de tipo real que será el tercer sumando de los métodos correspondientes
	 */
	
	double sum3;
	/**
	 * Número real. Guardará el resultado de los métodos correspondientes
	 */
	
	double result;
	/**
	 * Número entero que será el primer sumando de los métodos correspondientes
	 */
	
	int suman1;
	/**
	 * Número entero que será el segundo sumando de los métodos correspondientes
	 */
	int suman2;
	/**
	 * Número entero que será el tercer sumando de los métodos correspondientes
	 */
	int suman3;
	/**
	 * Número entero. Guardará el resultado de los métodos correspondientes
	 */
	int resultado;
	
	/**
	 * Método que suma los dos métodos reales introducidos como parámetros
	 * @param sum1 Primer sumando
	 * @param sum2 Segundo sumando
	 * @return Devuelve un número real que es el resultado de los dos métodos introducidos como parámetros
	 */
	private int va;
	
	public double sumareal(double sum1, double sum2) {
		
		return result;
		
	}
	/**
	 * Método que suma dos números enteros introducidos como parámetros
	 * @param suman1 Primer sumando
	 * @param suman2 Segundo sumando
	 * @return Devuelve un número entero que es el resultado de los dos números introducidos como parámetros
	 */
	public double sumaint(int suman1, int suman2) {
		
		return resultado;
		
	}
	/**
	 * Método que suma los tres números reales introducidos como parámetros
	 * @param sum1 Primer sumando
	 * @param sum2 Segundo sumando
	 * @param sum3 Tercer sumando
	 * @return Devuelve un número real que es el resultado de los tres números introducidos como parámetros
	 */
	public double sumareal(double sum1, double sum2, double sum3) {
		result = sum1 + sum2 + sum3;
		return result;
		
	}
	/**
	 * Método que suma un número dado como parámetro al valor que en ese momento tenga el resultado de una operación anterior
	 * @param suman1 Primer sumando
	 * @return Devuelve un número entero resultado de la suma del número dado como parámetro y el introducido a través de consola
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