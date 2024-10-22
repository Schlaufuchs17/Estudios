/**
 * <h2>Clase que realiza el producto de varios operandos.</h2>
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * Si uno de los operandos es 0, el resultado ser� siempre 0
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Producto {

	/**
	 * N�meros de tipo real que ser�n los operandos de los m�todos correspondientes
	 */
	double ope1, ope2,ope3;

	/**
	 * N�mero real. Guardar� el resultado de los m�todos correspondientes
	 */
	double result;
	/**
	 * N�meros de tipo entero que ser�n los operandos de los m�todos correspondientes
	 */
	int oper1, oper2, oper3;
	
	/**
	 * N�mero entero. Guardar� el resultado de los m�todos correspondientes
	 */
	int resultado;
	/**
	 * M�todo que multiplica los dos n�meros reales introducidos como par�metros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @return Devuelve un n�mero real que es el resultado de la multiplicaci�n de los dos n�meros introducidos como par�metros
	 */
	
	public double producto(double ope1, double ope2) {
		result = ope1*ope2;
		return result;
		
	}
	/**
	 * M�todo que multiplica dos n�meros enteros introducidos como par�metros
	 * @param suman1 Primer operando
	 * @param suman2 Segundo operando
	 * @return Devuelve un n�mero entero que es el resultado de la multiplicaci�n de los dos n�meros introducidos como par�metros
	 */
	public double productoint(int oper1, int oper2) {
		resultado = oper1*oper2;
		return resultado;
		
	}
	/**
	 * M�todo que multiplica tres n�meros reales introducidos como par�metros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @param ope3 Tercer operando
	 * @return Devuelve un n�mero real, resultado de multiplicar los introducidos por par�metro
	 */
	public double producto(double ope1, double ope2, double ope3) {
		result = ope1*ope2*ope3;
		return result;
		
	}
	/**
	 * M�todo que realiza la potencia de un n�mero dado (base) elevado a otro (exponente)
	 * @param ope1 Operando introducido como par�metro
	 * @return Devuelve un n�mero real que es el resultado de elevar el primer n�mero (base) al segundo (exponente)
	 * N�mero demasiado altos arrojar�n la exception "OutOfRange"
	 */
	
	public double potencia(double ope1, double ope2) {
		result = Math.pow(ope1, ope2);
		return result;
		
	}
}