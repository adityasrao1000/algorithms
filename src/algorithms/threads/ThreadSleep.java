package algorithms.threads;

public class ThreadSleep extends Thread{
	static int arr[] ={3,60,35,2,45,320,5};
	
	synchronized void sort(){//synchronized method  
		   		  
		 }  
	      public void run(){
    	    
    		  int n = arr.length;  
    	        int temp = 0;  
    	         for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){ 
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;
                                 try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
                                 for(int k=0; k < arr.length; k++){  
                                     System.out.print(arr[k] +" ");  
                                 }  
                                 System.out.println(); 
                         }   
	    	      }
	      }  
		   
		  try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		      
		  
	 }  
	 
	 public static void main(String args[]){  
	  ThreadSleep t1=new ThreadSleep();  
	  t1.start();
	 }  
	
	
}
