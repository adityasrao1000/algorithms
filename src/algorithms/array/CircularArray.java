package algorithms.array;

public class CircularArray {

	public static String circular(char[] a, char ch) {
		String result = "";
		int i = 0;
		int index = -1;

		// check if the element exists
		for (i = 0; i < a.length; i++) {
			if (a[i] == ch) {
				index = i;
			}
		}

		// print if element exists
		if (index > -1) {
			for (i = index; i < a.length; i++) {
				result += a[i];
			}

			for (i = 0; i < index; i++) {
				result += a[i];
			}
			return result;
		}

		System.out.println("The element does not exist");
		return "";
	}

	public static void main(String args[]) {
		char[] a = { 'a', 'b', 'c', 'd', 'e' };
		char ch = 'c';
		System.out.println(circular(a, ch));
	}
}
