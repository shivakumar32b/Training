package com.assignments;

import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Given number is not a prime number");
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Given number is a prime number");
		}
		scanner.close();
	}
}
