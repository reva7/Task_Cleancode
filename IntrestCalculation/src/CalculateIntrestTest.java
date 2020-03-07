import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateIntrestTest {

	@Test
	
	public void testSimpleInterest() {
		CalculateIntrest c = new CalculateIntrest();
		assertEquals(c,c.simpleInterest(12500, 3, 5));
		assertEquals(c,c.simpleInterest(12400, 2.6, 1.5));
		assertEquals(c,c.simpleInterest(13600, 6.2, 3.75));
	}
	
	@Test
	
	public void testCompoundInterest() {
		CalculateIntrest c = new CalculateIntrest();
		assertEquals(c,c.compoundInterest(14290, 4, 6));
		assertEquals(c,c.compoundInterest(57600, 1.65, 2));
		assertEquals(c,c.compoundInterest(10350, 1.75, 1.35));
	}
}
