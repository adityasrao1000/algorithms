package algoritms.sorting.test;

import static org.junit.Assert.*;  
import algorithms.sorting.BubbleSort;  
import org.junit.Test;  

public class BubbleSortTest {
	@Test
    public void test() throws Exception {
        int[] unsorted = {2,1,9,6,5,4};
        int[] sorted = {1,2,4,5,6,9};
        
        assertArrayEquals(sorted,BubbleSort.bubbleSort(unsorted));

    }
}
