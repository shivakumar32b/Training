package com.exercises;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 7 representing a day of the week: ");
		int dayNumber = scanner.nextInt();

		String dayName = null;
		switch (dayNumber) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default:
			System.out.println("Error: Please enter a number between 1 and 7.");
		}

		System.out.println("The day corresponding to the number " + dayNumber + " is " + dayName + ".");

		scanner.close();
	}
}
