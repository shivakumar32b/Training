package com.exercises;

import java.util.Scanner;

public class CreditCardApproval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your credit score: ");
		int creditScore = scanner.nextInt();

		System.out.print("Enter your total debt amount: ");
		double debtAmount = scanner.nextDouble();

		System.out.print("Enter your annual income: ");
		double incomeAmount = scanner.nextDouble();

		System.out.print("Have you filed for bankruptcy in the last 5 years? (yes/no): ");
		String bankruptcyStatus = scanner.next();

		boolean approved = (creditScore >= 700) && ((debtAmount / incomeAmount) <= 0.3)
				&& (!bankruptcyStatus.equalsIgnoreCase("yes"));

		if (approved) {
			System.out.println("Congratulations! You are approved for the credit card.");
		} else {
			System.out.println("Sorry, you are not approved for the credit card.");
		}

		scanner.close();
	}
}
