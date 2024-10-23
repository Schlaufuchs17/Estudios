package Objetos;

import AE3.Cociente; //ACF: Importamos el paquete con la clase principal

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCociente {
Cociente c_1 ; //ACF: Creamos el tipo cociente con el que haremos las pruebas
	
	@BeforeEach 
	public  void clean () {
		c_1 = new Cociente(); 
	}

	@Test
	public void testDivisionReales() {
		
		
		double ResultadoEsperado = 7.62;
		double ResultadoObtenido = c_1.divisionReales(70.1, 9.2);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		
		
		ResultadoEsperado =9.223372036854776E16;
		ResultadoObtenido = c_1.divisionReales(70.2, 0);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		ResultadoEsperado =0.0;
		ResultadoObtenido = c_1.divisionReales(0, -9870.5);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
	}
	
	@Test
	public void testDivisionEnteros() {
	
		
		int ResultadoEsperado = 20;
		double ResultadoObtenido = c_1.divisionEnteros(80, 4);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		ResultadoEsperado= 0;
		ResultadoObtenido = c_1.divisionEnteros(0, 140);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
	}
	
	@Test
	public void testInverso() {
		
		double ResultadoEsperado = 0.02;
		double ResultadoObtenido = c_1.inverso(50.4);
		double inverso = Math.pow(c_1.inverso(50.4), -1); //Devuelve la base elevada al exponente
		
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (c_1.inverso(50.4)*inverso == 1) {
			assertTrue(true);
		}
		
		
		ResultadoEsperado = 9.223372036854776E16;
		ResultadoObtenido = c_1.inverso(0);
		inverso = Math.pow(c_1.inverso(0), -1); //Devuelve la base elevada al exponente
		
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (c_1.inverso(0)*inverso == 1) {
			assertTrue(true);
		}
		
	}
	@Test
	public void testRaiz() {
		
		
		double ResultadoEsperado = 8.37;
		double ResultadoObtenido = c_1.raiz(70);
				
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (ResultadoObtenido*ResultadoObtenido == c_1.raiz(70)) {
			assertTrue(true);
		}
		
		
		ResultadoEsperado = 0.0;
		ResultadoObtenido = Math.round(Math.sqrt(c_1.raiz(0.0))*100.0)/100.0; //Devuelve el redondeo mas cercano, si esta mal devolvera 0
				
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (ResultadoObtenido*ResultadoObtenido == c_1.raiz(0.0)) {
			assertTrue(true);
		}
		
		ResultadoEsperado = 0.0;
		ResultadoObtenido = Math.round(Math.sqrt(c_1.raiz(-7))*100.0)/100.0; //Devuelve el redondeo mas cercano, si esta mal devolvera 0
				
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (ResultadoObtenido*ResultadoObtenido == c_1.raiz(-7)) {
			assertTrue(true);
		}

	}

}
