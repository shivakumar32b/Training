package com.exercises;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Are you a premium member? (yes/no): ");
        String premiumMemberStatus = scanner.next();

        double discountAmount = 0.0;
        if (productPrice > 100) {
            if (premiumMemberStatus.equalsIgnoreCase("yes")) {
                discountAmount = productPrice * 0.20; 
            } else {
                discountAmount = productPrice * 0.10; 
            }
        }

        if (discountAmount > 0) {
            System.out.println("Congratulations! You get a discount of $" + discountAmount);
        } else {
            System.out.println("Sorry, no discount available for this purchase.");
        }

        scanner.close();
    }
}
