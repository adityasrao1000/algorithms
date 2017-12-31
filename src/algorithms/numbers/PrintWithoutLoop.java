package algorithms.numbers;

import java.util.Scanner;

public class PrintWithoutLoop {
	static int i;
	public static void recursive(int n) 
	{ 
	 
	  if(n <= i){
	 
	       System.out.println(n); 
	         recursive(n+1);  
	  }
	}
	 
	public static void main(String args[]) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a positive number");
	  i = sc.nextInt();
	  while(i<0) {
		  System.out.println("please enter a positive number greater than 0");
		  i = sc.nextInt();
	  }
	  sc.close();
	  recursive(1); 
	 
	}
}
