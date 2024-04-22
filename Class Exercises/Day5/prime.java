assignment 2:program for print the if given number is prime or not

package com;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in); 
    System.out.println("Enter the number");
    int num=s.nextInt();
    int count=0;
    for(int i=1;i<=num;i++)
    {
    	if(num%i==0) {
    	count++;	
    	}
    	
    }
    if(count==2) {
    	System.out.println("is a prime numer");
    }else {
    	System.out.println("is not a prime numer");
    }
  }

}


