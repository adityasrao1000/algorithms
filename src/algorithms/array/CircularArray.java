package algorithms.array;

import java.util.Scanner;

public class CircularArray{

	static void circular(char[] a,char ch){
		int i=0;
		int index =-1;
		
		//check if the element exists
		for(i=0;i<a.length;i++){
		  if(a[i]==ch){
		    index= i;
		  }
		}
		
		//print if element exists
		if(index>-1){
			 for(i=index;i<a.length;i++){
			    System.out.print(a[i]);
			  }
			
			  for(i=0;i<index;i++){
			    System.out.print(a[i]);
			  }
			return;
		}
		
		System.out.println("The element does not exist");
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a string greater than 0");
		String inp = sc.nextLine();
		
		System.out.println("Enter a character ");
		char[] a = inp.toCharArray();
		String s = sc.next();
		
		while(s.length()!=1) {
			System.out.println("Please enter only one character");
			s = sc.next();
		}
		
		char search = s.charAt(0);
		sc.close();	
		circular(a,search);
	}
}
