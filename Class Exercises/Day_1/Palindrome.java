package com.exercises;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string:");
	String str = scanner.next();
	int i = 0,j = str.length()-1;
	boolean flag = true;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
		flag = false;	
		}
		i++;
		j--;
	}
	if(flag) {
	System.out.println("Given string is a palindrome");
	}
	else {
		System.out.println("Given string is not a palindrome");
	}
	scanner.close();
	}
}
