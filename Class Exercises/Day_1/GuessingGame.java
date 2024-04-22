package com.exercises;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();
            
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break; 
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try guessing a higher number.");
            } else {
                System.out.println("Too high! Try guessing a lower number.");
            }
        }
        
        scanner.close();
    }
}
