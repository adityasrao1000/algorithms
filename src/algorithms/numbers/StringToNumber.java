package algorithms.numbers;

public class StringToNumber {

	public static int convert(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = (sum * 10) + Character.getNumericValue(s.charAt(i));
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.print(convert("123456"));
	}
}
