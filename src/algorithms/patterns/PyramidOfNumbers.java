package algorithms.patterns;

import java.util.Scanner;

public class PyramidOfNumbers implements Triangle{
	
 public void pyramid(int rows) {
	 
	for (int i = 0; i < rows; i++){
		
		for (int j = 0; j < rows - i; j++){			
			System.out.print(" "); 			
		} 
		for (int k = 0; k <= i; k++){
			System.out.print(k + " ");
		} 
		System.out.println(); 
	} 	
 }
 
 public static void main(String args[]) {
	 
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();
    sc.close();
    PyramidOfNumbers tri = new PyramidOfNumbers();
    tri.pyramid(rows);
 }
 
 
}
