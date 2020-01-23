import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class DepositoTestParamLlenar {
	private double cantidadInicial;
	private double capacidadMax;
	private double cambio;
	private double resultado;
	
	public DepositoTestParamLlenar(double ci,double cm,double c,double res) {
	cantidadInicial=ci;
	capacidadMax=cm;
	cambio=c;
	resultado=res;
}
	
@Parameters 
	public static Collection<Object[]> valores(){
		return Arrays.asList(new Object[][] {
			{30.0,50.0,15.0,45.0},{40.0,50.0,11.0,50.0},{15.0,50.0,-20.0,0.0}
			});
		}
@Test
public void testLlenar() {
    DepositoCombustible tanque = new DepositoCombustible(capacidadMax,cantidadInicial);
   tanque.fill(cambio);
    assertEquals(resultado,tanque.getDepositoNivel(),0.01);
}

}
	