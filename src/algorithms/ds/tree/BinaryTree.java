package algorithms.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() {
		this.root = null;
	}

	void insert(Node n) {

		Node curr = root;

		if (root == null) {
			this.root = n;
			return;
		}

		while (curr != null) {
			if (curr.key == n.key) {
				return;
			}

			if (curr.key < n.key) {

				if (curr.right != null) {
					curr = curr.right;
				} else {
					curr.right = n;
					return;
				}
			} else {

				if (curr.left != null) {
					curr = curr.left;
				} else {
					curr.left = n;
					return;
				}
			}
		}

	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}

	void printLevelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		// add root node to queue
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();

			System.out.print(n.key + " ");

			if (n.left != null) {
				q.add(n.left);
			}

			if (n.right != null) {
				q.add(n.right);
			}
		}

	}

	int findDepth() {
		if (root == null)
			return 0;
		return maxDepth(root);
	}

	int maxDepth(Node node) {
		if (node == null)
			return 0;
		else {
			return Math.max(1 + maxDepth(node.right), 1 + maxDepth(node.left));
		}
	}

	// Driver method
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(new Node(5));
		tree.insert(new Node(2));
		tree.insert(new Node(6));

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();

		System.out.println("\nBFS: ");
		tree.printLevelOrder(tree.root);
		System.out.println("\ndepth: ");
		System.out.println(tree.findDepth());
	}
}
