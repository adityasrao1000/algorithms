package algorithms.ds.stack;

import java.util.Arrays;

class Stack<T> implements Cloneable {
	private Object[] arr;
	private int top = -1;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	Stack() {
		arr = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(T o) {
		if (top >= (arr.length - 1)) {
			arr = Arrays.copyOf(arr, arr.length + 16);
			arr[++top] = o;
		} else {
			arr[++top] = o;
		}
	}

	public Object pop() throws AssertionError {

		if (top == -1) {
			throw new AssertionError();
		}

		Object o = arr[top];
		arr[top] = null;
		top--;
		return o;
	}

	public int size() {
		return top + 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Stack<T> clone() {
		try {
			Stack<T> s = (Stack<T>) super.clone();
			s.arr = this.arr.clone();
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