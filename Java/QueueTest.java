import org.junit.Test;

import junit.framework.TestCase;


public class QueueTest extends TestCase {

	@Test
	public void testQueue(){
		Queue newQueue = new Queue();
		assertEquals(0,newQueue.servingCustomer());
		assertEquals(1,newQueue.pushCustomer(1));
		assertEquals(2,newQueue.pushCustomer(2));
		assertEquals(3,newQueue.pushCustomer(3));
		assertEquals(4,newQueue.pushCustomer(4));
		assertEquals(5,newQueue.pushCustomer(5));
		assertEquals(5,newQueue.pushCustomer(6));
		
	}
}
