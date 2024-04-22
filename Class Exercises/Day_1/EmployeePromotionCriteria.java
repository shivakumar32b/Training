package com.exercises;

import java.util.Scanner;

public class EmployeePromotionCriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        System.out.print("Enter your performance rating (excellent, good, fair, poor): ");
        String performanceRating = scanner.next();

        System.out.print("Have you completed at least one advanced training program? (yes/no): ");
        String trainingStatus = scanner.next();

        boolean eligibleForPromotion = (yearsOfService >= 5) && performanceRating.equalsIgnoreCase("excellent") && trainingStatus.equalsIgnoreCase("yes");

        if (eligibleForPromotion) {
            System.out.println("Congratulations! You are eligible for promotion.");
        } else {
            System.out.println("Sorry, you are not eligible for promotion.");
        }
        scanner.close();
    }
}

