package com.exercises;

import java.util.*;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight in KG:");
		int weight = scanner.nextInt();
		System.out.println("Enter your height in meters:");
		int height = scanner.nextInt();
		int bmi = weight / (height * height);

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal weight");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweight");
			;
		} else {
			System.out.println("Obese");
		}
		scanner.close();
	}
}
