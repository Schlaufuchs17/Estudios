package Objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {
	
	//Suma miSuma = new Suma();

	@Test
	void testsumaint() {
		Suma miSuma = new Suma();
		int resultadoEsperado = 15;
		int resultadoReal = (int) miSuma.sumaint(10, 5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testsumareal() {
		Suma miSuma = new Suma();
		double resultadoEsperado = 15;
		double resultadoReal = miSuma.sumaint(10, 5);
		assertEquals(resultadoEsperado,resultadoReal);
	}@Test
	void testsumarealtriple() {
		Suma miSuma = new Suma();
		double resultadoEsperado = 15;
		double resultadoReal = miSuma.sumareal(5, 5, 5);
		assertEquals(resultadoEsperado,resultadoReal);
	}@Test
	void testsumaintacum() {
		Suma miSuma = new Suma();
		double va=10;
		double resultadoEsperado = 15;
		double resultadoReal = miSuma.sumaint(5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
}
