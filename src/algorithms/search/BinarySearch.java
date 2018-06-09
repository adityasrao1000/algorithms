package algorithms.search;

public class BinarySearch {

	// binary search for integer
	static void binary(int[] a, int key, int low, int high) {

		if (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				System.out.println("Element found at index: " + mid);
				return;
			}
			if (a[mid] > key) {
				binary(a, key, low, mid - 1);
				return;
			} else {
				binary(a, key, mid + 1, high);
				return;
			}
		}
		System.out.println("the element does not exist");
	}

	// binary search for string
	static void binary(String[] a, String key, int low, int high) {

		if (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid].compareTo(key) == 0) {
				System.out.println("Element found at index: " + mid);
				return;
			}
			if (a[mid].compareTo(key) > 0) {
				binary(a, key, low, mid - 1);
				return;
			} else {
				binary(a, key, mid + 1, high);
				return;
			}
		}
		System.out.println("the element does not exist");
	}

	public static void main(String args[]) {
		int[] a = { 0, 1, 3, 5, 6, 10, 14, 15, 17, 20 };
		binary(a, 5, 0, a.length - 1);

		String[] b = { "aa", "abb", "acb", "hjk", "icv", "xcds", "xii", "zaz", "zz" };
		binary(b, "xii", 0, a.length - 1);
	}

}
