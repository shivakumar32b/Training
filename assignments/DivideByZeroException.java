package com.exercises;

public class DivideByZeroException {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("Result:" + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e.getMessage());
		}
	}
}
