package products;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AppleTest {

	@Test
	public void hasPrice() {
		Apple apple = new Apple();

		assertNotNull(apple.getPrice());
	}
	
	
}
