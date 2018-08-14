package algorithms.array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String args[]) {
		int[][] a1 = new int[2][3];

		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print("enter value for a1[" + i + "]" + "[" + j + "]");
					a1[i][j] = sc.nextInt();
				}
			}

			int[][] a2 = new int[3][2];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print("enter value for a2[" + i + "]" + "[" + j + "]");
					a2[i][j] = sc.nextInt();
				}
			}

			int sum = 0;
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					for (int k = 0; k < 3; k++) {
						sum += a1[i][k] * a2[k][j];
					}
				}
			}

			System.out.println(sum);
		} finally {

		}

	}
}
