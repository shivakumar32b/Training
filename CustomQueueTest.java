package com.assignments;

import java.util.LinkedList;

class CustomQueue<T> {
	private LinkedList<T> queue;

	public CustomQueue() {
		queue = new LinkedList<>();
	}

	public void enqueue(T element) {
		queue.addLast(element);
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue.removeFirst();
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue.getFirst();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}

public class CustomQueueTest {
	public static void main(String[] args) {
		CustomQueue<Object> queue = new CustomQueue<>();

		queue.enqueue("One");
		queue.enqueue(1);
		queue.enqueue("Three");
		queue.enqueue(3);

		System.out.println("Dequeueing elements from the queue:");
		while (!queue.isEmpty()) {
			Object element = queue.dequeue();
			System.out.println("Dequeued: " + element);
		}
	}
}
