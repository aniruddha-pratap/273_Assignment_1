import org.junit.Test;

import junit.framework.TestCase;


public class CollectionsTest extends TestCase{
	
	@Test
	public void testCollection(){
		StudentData student = new StudentData();
		assertTrue(student.map.isEmpty());
		assertEquals(0,student.map.size());
		student.map.put("011432317", new Student("Aniruddha","Singh","4"));
		student.map.remove("011432317");
		
	}

}
