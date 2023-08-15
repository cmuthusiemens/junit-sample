package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionOperationTest {

	private AdditionOperation calculation = new AdditionOperation();

	@Test
	public void testAdd() {
		assertEquals(calculation.add(1, 2), 3);
	}
	
	
	@Test
	public void testAddNegativeValue() {
		assertEquals(calculation.add(-1, -2), -3);
	}

}
