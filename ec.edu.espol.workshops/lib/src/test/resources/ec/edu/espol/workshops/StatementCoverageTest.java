package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatementCoverageTest {

	@Test
	public void test() {
		CarInsurance c1 = new CarInsurance();
		int resultado = c1.calcular_Car_Insurance("s", 48, 'F', "s");
		assertEquals(200, resultado);
		
		CarInsurance c2 = new CarInsurance();
		int resultado2 = c2.calcular_Car_Insurance("s", 25, 'M', "s");
		assertEquals(500, resultado2);
		
		CarInsurance c3 = new CarInsurance();
		int resultado3 = c3.calcular_Car_Insurance("n", 48, 'F', "s");
		assertEquals(-1, resultado3);
		
		CarInsurance c4 = new CarInsurance();
		int resultado4 = c4.calcular_Car_Insurance("s", -17, 'M', "m");
		assertEquals(-1, resultado4);
		
		CarInsurance c5 = new CarInsurance();
		int resultado5 = c5.calcular_Car_Insurance("s", 80, 'F', "m");
		assertEquals(300, resultado5);
		
		CarInsurance c6 = new CarInsurance();
		int resultado6 = c6.calcular_Car_Insurance("s", 45, 'M', "s");
		assertEquals(400, resultado6);
	}

}
