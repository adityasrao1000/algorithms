package algorithms.sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
	  int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
           for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){ 
                       //swap elements  
                       temp = arr[j-1];  
                       arr[j-1] = arr[j];  
                       arr[j] = temp;
                }   
            }
        }  
	    return arr;
    }
	public static void main(String[] args) {
		
		int[] arr = {4,2,1,7,87,56,8,13};
		int[] a = bubbleSort(arr);
		
		//print sorted array
		 for(int k=0; k < a.length; k++){  
             System.out.print(a[k] +" ");  
         }  
         System.out.println(); 
	}
}
