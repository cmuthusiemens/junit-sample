package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubractOperationTest {

	private SubractOperation calculation = new SubractOperation();

	@Test
	public void testSub() {
		assertEquals(calculation.sub(2, 1), 1);
	}
	
	
	@Test
	public void testSubNegativeValue() {
		assertEquals(calculation.sub(-2, -1), -1);
	}

}
