package algorithms.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintWithoutLoop {

	public static void recursive(int i) {
		if (1 <= i) {
			System.out.println(i);
			recursive(i - 1);
		}
	}

	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader sc = new BufferedReader(is);
		System.out.println("enter a positive number");
		int i = sc.read();
		while (i < 0) {
			System.out.println("please enter a positive number greater than 0");
			i = sc.read();
		}
		sc.close();
		recursive(i);
	}
}
