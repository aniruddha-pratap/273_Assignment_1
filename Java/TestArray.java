import org.junit.Test;

import junit.framework.TestCase;

public class TestArray extends TestCase {
	
	@Test
	public void testArray() 
	{
		ArrayDemo newArray = new ArrayDemo();
		assertEquals(45555.75,newArray.calculateFee());
	}

}
