package algorithms.graph;

import java.util.Scanner;

public class Prims {

	static int a[][] = null;
	// number of nodes in the matrix
	static int n = 0;

	public static void minimal_spanning_tree() {

		int i, j, u, v, min, source;
		int sum; /* hold cost of minimum spanning tree */
		int k; /* index for storing edges w.r.t minimum spanning tree */
		int t[][] = new int[n][2]; /* holds minimum spanning tree */
		int p[] = new int[n];
		int d[] = new int[n];
		int s[] = new int[n];

		/* find the sourse vertex from which the least edges start */
		min = 999;
		source = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (a[i][j] != 0 && a[i][j] <= min) {

					min = a[i][j];
					source = i;
				}
			}
		}

		for (i = 0; i < n; i++) {
			d[i] = a[source][i];
			s[i] = 0;
			p[i] = source;
		}

		s[source] = 1; /* add source to S */

		sum = 0; /* initial cost of spanning tree */
		k = 0; /* used as an index to store the edges selected */

		for (i = 1; i < n; i++) {

			min = 999;
			u = -1;
			for (j = 0; j < n; j++) {
				if (s[j] == 0 && d[j] < min) {
					min = d[j];
					u = j;
				}
			}

			if (u == -1)
				return;
			t[k][0] = u;
			t[k][1] = p[u];
			k++;

			sum += a[u][p[u]];

			s[u] = 1;

			for (v = 0; v < n; v++) {

				if (s[v] == 0 && a[u][v] < d[v]) {
					d[v] = a[u][v];
					p[v] = u;
				}
			}
		}

		if (sum >= 999) {
			System.out.println("Spanning tree does not exist");
		} else {
			System.out.println("Spanning tree exists");
			for (i = 0; i < n - 1; i++) {
				System.out.println(t[i][0] + ": " + t[i][1]);
			}
			System.out.println("cost of the spanning tree is: " + sum);
		}
	}

	public static void read_data() {

		int i, j;

		System.out.println("enter number of nodes");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		a = new int[n][n];

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				System.out.println("a[" + i + "]" + "[" + j + "]");
				if (i == j) {
					a[i][j] = 0;
					continue;
				}
				a[i][j] = sc.nextInt();

			}
		}
		sc.close();
	}

	public static void main(String args[]) {
		read_data();
		minimal_spanning_tree();
	}
}
