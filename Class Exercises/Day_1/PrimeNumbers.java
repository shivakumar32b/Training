package com.exercises;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int start = scanner.nextInt();

		System.out.print("Enter the last number: ");
		int end = scanner.nextInt();

		System.out.println("Prime numbers between " + start + " and " + end + ":");

		for (int i = start; i <= end; i++) {
			boolean isPrime = true;

			if (i <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j <= i/2; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				System.out.print(i + " ");
			}
		}

		scanner.close();
	}
}
