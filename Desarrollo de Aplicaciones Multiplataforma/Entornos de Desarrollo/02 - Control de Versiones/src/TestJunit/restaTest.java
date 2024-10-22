package Objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class restaTest {

	

	@Test
	void testretareal() {
		Resta miResta = new Resta();
		double ResultadoEsperado = 10;
		double ResultadoReal = miResta.resta(20, 10);
		assertEquals(ResultadoEsperado,ResultadoReal);
		}
	@Test
	 void testrestaint() {
		Resta miResta = new Resta();
		double ResultadoEsperado = 10;
		double ResultadoReal = miResta.resta(20, 10);
		assertEquals(ResultadoEsperado,ResultadoReal);
	}
	@Test
	 void testrestatriple() {
		Resta miResta = new Resta();
		double ResultadoEsperado = 10;
		double ResultadoReal = miResta.resta(20, 10, 10);
		assertEquals(ResultadoEsperado,ResultadoReal);
	}
	@Test
	 void testrestaacum() {
		Resta miResta = new Resta();
		double ResultadoEsperado = 10;
		double ResultadoReal = miResta.resta(20, 10);
		assertEquals(ResultadoEsperado,ResultadoReal);
	}
}
S