package com.exercises;
import java.util.Scanner;

public class FibonacciSequence {
	  public static void main(String[] args) {
	        Scanner scanner= new Scanner(System.in);

	        System.out.print("Enter the no of terms in the Fibonacci sequence: ");
	        int num = scanner.nextInt();

	        int  a= 0, b= 1;

	        System.out.println("Fibonacci sequence:");
	        System.out.print(a + ", " + b);

	        for (int i = 2; i < num; i++) {
	            int c= a + b;
	            System.out.print(", " + c);
	            a = b;
	            b= c;
	        }

	        System.out.println();
	        scanner.close();
	    }
}
