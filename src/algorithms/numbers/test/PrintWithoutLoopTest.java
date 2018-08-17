package algorithms.numbers.test;

import java.io.BufferedReader;
import java.io.IOException;
import org.junit.Test;
import org.mockito.Mockito;
import algorithms.numbers.PrintWithoutLoop;


public class PrintWithoutLoopTest {
	@SuppressWarnings("static-access")
	@Test
	public void test() throws IOException {
		BufferedReader br = org.mockito.Mockito.mock(BufferedReader.class);
		Mockito.when(br.read()).thenReturn(2);
		PrintWithoutLoop s = Mockito.mock(PrintWithoutLoop.class);
		s.main(new String[1]);
	}
}
