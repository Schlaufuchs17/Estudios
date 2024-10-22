/**
 * <h2>Clase que realiza el producto de varios operandos.</h2>
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * Si uno de los operandos es 0, el resultado será siempre 0
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Producto {

	/**
	 * Números de tipo real que serán los operandos de los métodos correspondientes
	 */
	double ope1, ope2,ope3;

	/**
	 * Número real. Guardará el resultado de los métodos correspondientes
	 */
	double result;
	/**
	 * Números de tipo entero que serán los operandos de los métodos correspondientes
	 */
	int oper1, oper2, oper3;
	
	/**
	 * Número entero. Guardará el resultado de los métodos correspondientes
	 */
	int resultado;
	/**
	 * Método que multiplica los dos números reales introducidos como parámetros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @return Devuelve un número real que es el resultado de la multiplicación de los dos números introducidos como parámetros
	 */
	
	public double producto(double ope1, double ope2) {
		result = ope1*ope2;
		return result;
		
	}
	/**
	 * Método que multiplica dos números enteros introducidos como parámetros
	 * @param suman1 Primer operando
	 * @param suman2 Segundo operando
	 * @return Devuelve un número entero que es el resultado de la multiplicación de los dos números introducidos como parámetros
	 */
	public double productoint(int oper1, int oper2) {
		resultado = oper1*oper2;
		return resultado;
		
	}
	/**
	 * Método que multiplica tres números reales introducidos como parámetros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @param ope3 Tercer operando
	 * @return Devuelve un número real, resultado de multiplicar los introducidos por parámetro
	 */
	public double producto(double ope1, double ope2, double ope3) {
		result = ope1*ope2*ope3;
		return result;
		
	}
	/**
	 * Método que realiza la potencia de un número dado (base) elevado a otro (exponente)
	 * @param ope1 Operando introducido como parámetro
	 * @return Devuelve un número real que es el resultado de elevar el primer número (base) al segundo (exponente)
	 * Número demasiado altos arrojarán la exception "OutOfRange"
	 */
	
	public double potencia(double ope1, double ope2) {
		result = Math.pow(ope1, ope2);
		return result;
		
	}
}