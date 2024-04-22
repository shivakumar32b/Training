package com.assignments.day4_and_day5;

public class Task_4_DivideByZeroException {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("Result:" + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e.getMessage());
		}
	}
}
