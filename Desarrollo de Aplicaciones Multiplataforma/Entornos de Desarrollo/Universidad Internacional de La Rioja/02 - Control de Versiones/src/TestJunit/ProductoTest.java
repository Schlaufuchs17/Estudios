package Objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
		void testproducto() {
			Producto miProducto = new Producto();
			double resultadoEsperado = 15;
			double resultadoReal = miProducto.producto(3, 5);
			assertEquals(resultadoEsperado,resultadoReal);
		}
	@Test
	void testproductoint() {
		Producto miProducto = new Producto();
		int resultadoEsperado = 15;
		int resultadoReal = (int) miProducto.productoint(3, 5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testproducto3() {
		Producto miProducto = new Producto();
		int resultadoEsperado = 90;
		int resultadoReal = (int) miProducto.producto(3, 5, 6);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testpotencia() {
		Producto miProducto = new Producto();
		double resultadoEsperado = 25;
		double resultadoReal = (int) miProducto.potencia(5, 2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	}


