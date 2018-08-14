package algorithms.numbers.test;

import algorithms.numbers.ArmstrongNumber;
import static algorithms.numbers.ArmstrongNumber.armstrong;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArmstrongNumberTest {
	@Test
	public void test1() throws Exception {
		assertEquals(36, armstrong(123));
	}

	@Test
	public void test11() {
		assertEquals(ArmstrongNumber.armstrong(0), 0);
	}
}
