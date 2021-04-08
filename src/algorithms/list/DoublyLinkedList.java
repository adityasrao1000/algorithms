package algorithms.list;

public class DoublyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	private static class Node<T> {
		Node<T> next;
		Node<T> prev;
		T value;

		Node(T value) {
			this.value = value;
		}

	}

	private void add(Node<T> node) {
		if (head == null) {
			head = node;
			return;
		}

		Node<T> curr = head;

		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = node;
		node.prev = curr;
		tail = node;
	}

	private void print() {
		Node<T> curr = head;
		while (curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	private void printReverse() {
		Node<T> curr = tail;
		while (curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.prev;
		}
		System.out.println();
	}

	private void delete(T value) {
		if (head == null) {
			return;
		}

		if (head == tail) {
			if (head.value.equals(value)) {
				head = tail = null;
			}
			return;
		}

		Node<T> curr = head.next;

		while (curr != null) {
			if (curr.value.equals(value)) {
				if (curr == tail) {
					Node<T> prev = curr.prev;
					prev.next = null;
					tail = prev;
				} else {
					Node<T> prev = curr.prev;
					Node<T> next = curr.next;
					prev.next = next;
					next.prev = prev;
				}
			}
			curr = curr.next;
		}

	}

	public static void main(String args[]) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.add(new Node<>(1));
		list.add(new Node<>(2));
		list.add(new Node<>(3));
		list.print();
		list.printReverse();
		list.delete(2);
		list.delete(3);
		list.delete(1);
		list.print();
	}
}
