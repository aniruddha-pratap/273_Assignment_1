import org.junit.Test;

import junit.framework.TestCase;


public class StackTest extends TestCase {

	@Test
	public void testStack() 
	{
	 //Testing push and pop function
	  Magazine newGun = new Magazine(3);
	  assertEquals(-1, newGun.fire());
	  assertEquals(0, newGun.fillMagazine(1));
	  assertEquals(1, newGun.fillMagazine(2));
	  assertEquals(2, newGun.fillMagazine(3));
	  assertEquals(2, newGun.fillMagazine(3));
	}
}


