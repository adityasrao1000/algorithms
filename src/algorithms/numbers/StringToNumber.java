package algorithms.numbers;

public class StringToNumber {

	public static void main(String[] args) {
		String s = "123456";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {

			sum = (sum * 10) + (int) s.charAt(i);
		}

		System.out.print(sum);
	}
}
