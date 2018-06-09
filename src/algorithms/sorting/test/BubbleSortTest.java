package algorithms.sorting.test;

import static org.junit.Assert.*;
import algorithms.sorting.BubbleSort;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	BubbleSort sort = new BubbleSort();
	int[] arr1 = { 4, 2, 1, 7, 87, 56, 8, 13 };
	int[] arr2 = { 1, 2, 4, 7, 8, 13, 56, 87 };

	@Before
	public void setUp() throws Exception {
		BubbleSort.bubbleSort(arr1);
	}

	@Test
	public void bubbleSort() throws Exception {
		assertArrayEquals(arr1, arr2);
	}
}
