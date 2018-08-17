package algorithms.string;

public class StringReverseInplace {

	String reverse(String sb) {
		StringBuffer s = new StringBuffer(sb);
		int length = s.length();
		int i;
		for (i = 0; i < length / 2; i++) {
			final char current = s.charAt(i);
			final int otherEnd = length - i - 1;
			s.setCharAt(i, s.charAt(otherEnd));
			s.setCharAt(otherEnd, current);
		}

		return s.toString();
	}

	public static void main(String args[]) {
		System.out.println(new StringReverseInplace().reverse("123456789"));
	}
}
