package algorithms.ds.stack;

import java.util.Arrays;

class Stack<E> implements Cloneable {
	private Object[] arr;
	private int top = -1;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	Stack() {
		
		arr = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E o) {
		if (top >= (arr.length - 1)) {
			arr = Arrays.copyOf(arr, arr.length + 16);
			arr[++top] = o;
		} else {
			arr[++top] = o;
		}
	}

	@SuppressWarnings("unchecked")
	public E pop() throws AssertionError {

		if (top == -1) {
			throw new AssertionError();
		}

		Object o = arr[top];
		arr[top] = null;
		top--;
		return (E)o;
	}

	public int size() {
		return top + 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Stack<E> clone() {
		try {
			Stack<E> s = (Stack<E>) super.clone();
			return s;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

public class StackDemo {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < 16; i++) {
			s.push(i);
		}
		System.out.println("initial size: " + s.size());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("final size: " + s.size());
	}
}