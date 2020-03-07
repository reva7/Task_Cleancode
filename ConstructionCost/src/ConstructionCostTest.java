import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest {

	@Test
	
	public void testCost() {
		ContructionCost cc = new ConstructionCost();
		assertEquals(cc,cc.getCost("standard",6,false));
		assertEquals(cc,cc.getCost("highStandard",3,true));
		assertEquals(cc,cc.getCost("aboveStandard",2,true));
		assertEquals(cc,cc.getCost("highStandard",5,false));
	}

}
