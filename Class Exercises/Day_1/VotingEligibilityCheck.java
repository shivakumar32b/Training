package com.exercises;

import java.util.Scanner;

public class VotingEligibilityCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		System.out.println("Are you a citizen of this country?");
		boolean citizen = scanner.nextBoolean();
		System.out.println("Did you commit a crime or involved in a criminal activity in the past?");
		boolean con = scanner.nextBoolean();

		if (age >= 18 && citizen && !con) {
			System.out.println("You are eligible to vote");
		} else if (age < 18) {
			System.out.println("You are not eligible to vote because of being underage");
		} else if (!citizen) {
			System.out.println("You are not eligible to vote because of not being a citizen of this country");
		} else {
			System.out.println("You are not eligible to vote because of your criminal records");
		}
		scanner.close();
	}
}
