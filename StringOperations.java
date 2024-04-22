package com.assignments;

import java.util.Scanner;

public class StringOperations {
	public static void performStringOperations(String firstString, String secondString, int length) {
		if (firstString.length() == 0 || secondString.length() == 0) {
			System.out.println("Strings cannot be empty");
		} else {
			String concatenatedString = firstString + secondString;
			System.out.println("Concatenated string:" + concatenatedString);
			String reversedString = "";
			for (int i = concatenatedString.length() - 1; i >= 0; i--) {
				reversedString += concatenatedString.charAt(i);
			}
			System.out.println("Reversed String:" + reversedString);

			if (length >= concatenatedString.length()) {
				System.out.println("Length of substring is larger than or equal to concatenated string");
			} else {
				int startIndex;
				if (concatenatedString.length() % 2 == 0) {
					startIndex = concatenatedString.length() / 2 - 1;
				} else {
					// String length is odd
					startIndex = concatenatedString.length() / 2;
				}
				int endIndex = Math.min(startIndex + length, concatenatedString.length());
				System.out.println("The substring is:" + concatenatedString.substring(startIndex, endIndex));
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string:");
		String firstString = scanner.next();
		System.out.println("Enter second string:");
		String secondString = scanner.next();
		System.out.println("Enter length of substring:");
		int length = scanner.nextInt();

		performStringOperations(firstString, secondString, length);

		scanner.close();
	}
}
