package Objetos;
/**
 * <h2>Clase que permite calcular el cociente entre números introducidos como parámetros</h2>
 * Para mas informacion por favor pincha en el <a href= "https://www.w3schools.com/java/java_operators.asp">enlace</a>
 * En el caso de que el divisor sea 0, el resultado será siempre 0.
 * Si el dividendo es 0, lanzará la excepción "DivByZeroException"
 * El resultado, aunque los operandos sean números enteros será siempre de tipo double, con el fin de reflejar las divisiones no exactas.
 * @author Grupo 4
 * @version 1.0
 * Instrucciones para el usuario: Siga las indicaciones mostradas por pantalla
 */
public class Cociente {
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
	 * Método que divide los dos números reales introducidos como parámetros
	 * @param ope1 Primer operando
	 * @param ope2 Segundo operando
	 * @return Devuelve un número real que es el resultado de la multiplicación de los dos números introducidos como parámetros
	 */
	
	public double cociente(double ope1, double ope2) {
		result = (double)ope1/ope2;
		return result;
		
	}
	/**
	 * Método que divide dos números enteros introducidos como parámetros
	 * @param suman1 Primer operando
	 * @param suman2 Segundo operando
	 * @return Devuelve un número real que es el resultado de la división de los dos números introducidos como parámetros
	 */
	public double cocienteint(int oper1, int oper2) {
		result = (double)oper1*oper2;
		return result;
		
	}
	/**
	 * Método que divide la unidad por otro número introducido como parámetro
	 * @param ope1 Primer operando
	 * @return Devuelve un número real, inverso del introducido por parámetro
	 */
	public double inverso(double ope1) {
		result = (double)1/ope1;
		return result;
		
	}
	/**
	 * Método que devuelve la raiz cuadrada del número introducido como parámetro
	 * @param ope1 Operando introducido como parámetro
	 * @return Devuelve un número real es la raiz cuadrada del parámetro introducido
	 */
	
	public double raiz(double ope1) {
		result = (double)result/ope1;
		return result;
		
	}
}