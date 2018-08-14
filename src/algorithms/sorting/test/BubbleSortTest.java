package algorithms.sorting.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

import algorithms.sorting.BubbleSort;

public class BubbleSortTest {

	BubbleSort sort = new BubbleSort();
	int[] arr1 = { 4, 2, 1, 7, 87, 56, 8, 13 };
	int[] arr2 = { 1, 2, 4, 7, 8, 13, 56, 87 };

	@Before
	public void setUp() {
		BubbleSort.bubbleSort(arr1);
	}

	@Test
	public void bubbleSort() {
		assertArrayEquals(arr1, arr2);
	}
	
	@Test
	public void bubbleSort1() {
		BubbleSort.main(new String[2]);
		assertArrayEquals(arr1, arr2);
	}
}
