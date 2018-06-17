package algorithms.numbers.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import algorithms.numbers.StringToNumber;

public class StringToNumberTest {
	@Test
	public void tonumber1() {
		assertEquals(12345, StringToNumber.convert("12345"));
	}

	@Test
	public void tonumber2() {
		assertEquals(12345, StringToNumber.convert("12345"));
	}

	@Test
	public void tonumber3() {
		assertEquals(1, StringToNumber.convert("1"));
	}

	@Test
	public void tonumber4() {
		assertEquals(987654321, StringToNumber.convert("987654321"));
	}
}
