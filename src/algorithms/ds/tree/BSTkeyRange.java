package algorithms.ds.tree;

public class BSTkeyRange {

	Node root;

	/*
	 * The functions prints all the keys which in the given range [k1..k2]. The
	 * function assumes that k1 < k2
	 */
	void print(Node node, int k1, int k2) {

		if (node == null) {
			return;
		}

		if (node.key > k1) {
			print(node.left, k1, k2);
		}

		if (node.key >= k1 && node.key <= k2) {
			System.out.print(node.key + " ");
		}

		if (node.key < k2) {
			print(node.right, k1, k2);
		}
	}

	public static void main(String[] args) {
		BSTkeyRange tree = new BSTkeyRange();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);

		tree.print(tree.root, 10, 24);
	}
}
