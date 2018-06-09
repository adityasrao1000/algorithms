package algorithms.greedy;

public class Knapsack {

	static boolean max(Integer w1, int w2) {
		return w1 <= w2 ? true : false;
	}

	static int sack(int arr[][], int wt, int cost, int index) {

		if (index > (arr.length - 1)) {
			return cost;
		}

		if (max(arr[index][0], wt)) {
			wt -= arr[index][0];
			cost += arr[index][1];

			return sack(arr, wt, cost, ++index);
		} else {
			return sack(arr, wt, cost, ++index);
		}

	}

	public static void main(String args[]) {

		int arr[][] = { { 10, 60 }, { 15, 45 }, { 10, 20 }, { 5, 5 } };
		int wt = 20;
		int cost = 0;
		int index = 0;
		System.out.println(sack(arr, wt, cost, index));

	}
}