import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoTest {


	@Test
	public void testGetDepositoNivel() {
        DepositoCombustible tanque = new DepositoCombustible(40.0,10.0);
		assertEquals(10.0,tanque.getDepositoNivel(),0.001);
	}

	@Test
	public void testGetDepositoMax() {
        DepositoCombustible tanque = new DepositoCombustible(40.0,10.0);
		assertEquals(40.0,tanque.getDepositoMax(),0.001);;
	}

	@Test
	public void testEstaVacio() {
        DepositoCombustible tanque = new DepositoCombustible(40.0,0.0);
        assertEquals(true,tanque.estaVacio());
	}

	@Test
	public void testEstaLleno() {
        DepositoCombustible tanque = new DepositoCombustible(40.0,40.0);
        assertEquals(true,tanque.estaLleno());
	}

	@Test
	public void testFill() {
		 DepositoCombustible tanque = new DepositoCombustible(40.0,10.0);
	     tanque.fill(30.0);
		assertEquals(40.0,tanque.getDepositoNivel(),0.001);

		 }

	@Test
	public void testConsumir() {
		 DepositoCombustible tanque = new DepositoCombustible(40.0,40.0);
	     tanque.consumir(30.0);
	     assertEquals(10.0,tanque.getDepositoNivel(),0.001);
	}	


}
