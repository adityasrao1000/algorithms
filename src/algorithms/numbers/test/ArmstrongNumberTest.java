package algorithms.numbers.test;

import static org.junit.Assert.*;
import org.junit.Test;

import algorithms.numbers.ArmstrongNumber;

import static algorithms.numbers.ArmstrongNumber.armstrong;

public class ArmstrongNumberTest {
	@Test
	public void bubbleSort() throws Exception {
		assertEquals(36, armstrong(123));
	}

	@Test
	public void testMain() {
		String[] args = null;
		ArmstrongNumber.main(args);
	}
}
