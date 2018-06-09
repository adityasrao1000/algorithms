package algorithms.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static int armstrong(int n) {
		int r, num = 0;
		while (n > 0) {

			r = n % 10;
			num = num + r * r * r;
			n = n / 10;

		}
		return num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		try {
			System.out.println("Enter a number");
			n = sc.nextInt();
			int arm = armstrong(n);
			System.out.println("Armstrong number is: " + arm);
		} catch (Exception e) {
			System.out.println("you have not entered a valid number");

		}
		sc.close();

	}

}
