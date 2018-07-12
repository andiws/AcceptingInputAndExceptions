package youtube;

import static org.junit.Assert.*;

import org.junit.Test;


public class SumTest {

	@Test
	public void testSum() {
		Sum object = new Sum(); 
		int x = 10; 
		int y = 5; 
		int sum = (x/y);
		
		assertEquals(2, sum); 
	}

}
