package algorithms.string.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import algorithms.string.StringReverseInplace;

public class StringReverseInplaceTest {
	StringReverseInplace s = null;

	@Before
	public void init() {
		s = new StringReverseInplace();
	}

	@Test
	public void mainTest() {
		StringReverseInplace.main(new String[1]);
	}

	@Test
	public void test() {
		assertEquals(s.reverse("123456789"), "987654321");
	}
}
