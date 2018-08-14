package algorithms.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String args[]) {
		int[][][] a = new int[3][3][3];

		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						System.out.print("enter value for a[" + i + "]" + "[" + j + "]" + "[" + k + "]");
						a[i][j][k] = sc.nextInt();
					}
				}
			}

			// print values of the array
			System.out.println(Arrays.deepToString(a));

		} finally {

		}
	}
}
