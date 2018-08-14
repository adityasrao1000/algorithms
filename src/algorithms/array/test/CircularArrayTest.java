package algorithms.array.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import algorithms.array.CircularArray;

public class CircularArrayTest {
	@Test
	public void test1() {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		assertEquals(CircularArray.circular(arr, 'c'), "cdeab");
	}

	@Test
	public void test2() {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		assertEquals(CircularArray.circular(arr, 'a'), "abcde");
	}

	@Test
	public void test3() {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		assertEquals(CircularArray.circular(arr, 'e'), "eabcd");
	}
	
	@Test
	public void test4() {
		char[] arr = { };
		assertEquals(CircularArray.circular(arr, 'e'), "");
	}
	
	@Test
	public void test5() {
		CircularArray.main(new String[1]);
	}
}
