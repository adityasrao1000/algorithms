package algorithms.sorting.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;
import algorithms.sorting.SelectionSort;

@SuppressWarnings("static-access")
public class SelectionSortTest {
   
   static SelectionSort s;
   
   @BeforeClass
   public static void initialize() {
	  s = new SelectionSort();
   }
  

   @Test
   public void arraysEquals1() {
	  int[] beforesort = {10,34,2,100,56,7,67,88,42};
	  int[] aftersort =  {2,7,10,34,42,56,67,88,100};
	  s.selectionSort(beforesort);
      assertArrayEquals(beforesort,aftersort);
   }
   
   @Test
   public void arraysEquals2() {
	  int[] beforesort = {10,9,8,7,6,5,4,3,2,1};
	  int[] aftersort =  {1,2,3,4,5,6,7,8,9,10};
	  s.selectionSort(beforesort);
      assertArrayEquals(beforesort,aftersort);
   }
   
   @Test
   public void arraysEquals3() {
	  int[] beforesort = {0,4,7,8,3,1,0};
	  int[] aftersort =  {0,0,1,3,4,7,8};
	  s.selectionSort(beforesort);
      assertArrayEquals(beforesort,aftersort);
   }
   
   @Test
   public void arraysNotEqual1() {
	  int[] beforesort = {0,4,7,8,3,1,0};
	  int[] aftersort =  {0,1,0,3,4,7,8};
	  s.selectionSort(beforesort);
      assertFalse(Arrays.equals(beforesort,aftersort));
   }
}
