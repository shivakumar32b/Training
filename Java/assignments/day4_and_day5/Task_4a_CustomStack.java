package com.assignments.day4_and_day5;

import java.util.ArrayList;

class CustomStack {
	private ArrayList<Integer> stack;

	public CustomStack() {
		stack = new ArrayList<>();
	}

	public void push(int element) {
		stack.add(element);
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return stack.remove(stack.size() - 1);
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return stack.get(stack.size() - 1);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}
}

public class Task_4a_CustomStack {
	public static void main(String[] args) {
		CustomStack stack = new CustomStack();

		// Push integers onto the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// Pop and display elements until the stack is empty
		System.out.println("Popping elements from the stack:");
		while (!stack.isEmpty()) {
			int element = stack.pop();
			System.out.println("Popped: " + element);
		}
	}
}
