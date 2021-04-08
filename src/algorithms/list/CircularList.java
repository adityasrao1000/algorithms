package algorithms.list;

public class CircularList<T> {
	private static class Node<T> {
		T key;
		Node<T> next;

		Node(T key) {
			this.key = key;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;

	void insert(Node<T> node) {
		if (head == null) {
			head = tail = node;
			return;
		}

		tail.next = node;
		tail = node;
		tail.next = head;
	}

	void print() {
		printImpl(head);
	}

	void printImpl(Node<T> node) {
		if (node == null) {
			return;
		} else {
			if (node == tail) {
				System.out.println(node.key);
			} else {
				System.out.println(node.key);
				printImpl(node.next);
			}
		}
	}

	void delete(T valueToDelete) {
		Node<T> currentNode = head;
		if (head == null) {
			return;
		}

		do {
			Node<T> nextNode = currentNode.next;
			if (nextNode.key == valueToDelete) {
				if (tail == head) { // the list has only one single element
					head = null;
					tail = null;
				} else {
					currentNode.next = nextNode.next;
					if (head == nextNode) { // we're deleting the head
						head = head.next;
					}
					if (tail == nextNode) { // we're deleting the tail
						tail = currentNode;
					}
				}
				break;
			}
			currentNode = nextNode;
		} while (currentNode != head);
	}

	public static void main(String args[]) {
		CircularList<Integer> list = new CircularList<>();
		list.insert(new Node<Integer>(1));
		list.insert(new Node<Integer>(2));
		list.insert(new Node<Integer>(3));
		list.insert(new Node<Integer>(4));
		list.print();
		list.delete(3);
		list.delete(1);
		list.print();
	}
}
