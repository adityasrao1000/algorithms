package algorithms.patterns;

import java.util.Scanner;

public class RightAngleTriangle {
	
  static void printTriangle(int rows) {
	int count=0;
    for(int i=0;i<rows;i++) {
    	
    	count++;
    	for(int j=0;j<count;j++) {
    		System.out.print("* ");
    	}
    	
    	System.out.println();    	
    }
  }
  public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();
    sc.close();
    printTriangle(rows);
  }

}
