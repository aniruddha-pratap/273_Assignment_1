import org.junit.Test;

import junit.framework.TestCase;

public class InterfaceTest extends TestCase{

	@Test
	public void testInterface(){
		Interface newInter = new Interface(9, 342.50, 142.75, 450, "Software Engineering");
		assertEquals("Software Engineering",newInter.getDepartment());
		assertEquals(3123.9625,newInter.calculateFees(15));
	}
}
