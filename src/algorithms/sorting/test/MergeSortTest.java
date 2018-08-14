package algorithms.sorting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithms.sorting.MergeSort;

public class MergeSortTest {
	MergeSort ms;

	@Before
	public void init() {
		ms = new MergeSort();
	}

	@Test
	public void test1() {
		Integer arr[] = { 12, 11, 13, 5, 6, 7 };
		ms.sort(arr, 0, arr.length - 1);
		Integer sorted[] = {5, 6, 7 ,11, 12, 13};
		Assert.assertArrayEquals(sorted, arr);
	}
	
	@Test
	public void test2() {
		MergeSort.main(null);
	}
}
