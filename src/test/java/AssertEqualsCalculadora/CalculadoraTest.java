package AssertEqualsCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVeses() {
		
		Calculadora calc = new Calculadora();
		
		int soma = calc.veses("2+2");
		assertEquals(4,soma);
		
		
	}

}
