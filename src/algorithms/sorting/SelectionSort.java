package algorithms.sorting;

public class SelectionSort {
	
	public static void selectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
     
    public static void main(String a[]){
        
        int[] arr = {10,34,2,100,56,7,67,88,42};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+ " ");

        }
    }
}
