package algorithms.threads;

public class ThreadSleep extends Thread{
  static int arr[] ={0,1,2,3,4,5,6,7,8,9};
  public void run(){

     for(int i=0; i < arr.length; i++){  
         try {
        	 System.out.println(i);
        	 Thread.sleep(500);
         }
         catch(InterruptedException e) {
        	 System.out.println(e);
         }   
     }
     System.out.println("Done");
 }  
	 
  public static void main(String args[]){  
	ThreadSleep t1=new ThreadSleep();  
	t1.start();
  }  
}
