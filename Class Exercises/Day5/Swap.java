assignment1:write a java program to caluculate using command line arguments to perform 
and print the addition ,subtraction,multipication,division
package com;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.valueOf(args[0]);
		int num2=Integer.valueOf(args[1]);
		
		int sum=find_sum(num1,num2);
		System.out.println(sum);
		int subtraction=find_sub(num1,num2);
		System.out.println(subtraction);
		int multipication=find_mul(num1,num2);
		System.out.println(multipication);
		int division=find_div(num1,num2);
		System.out.println(division);
		}
	public static int find_sum(int num1,int num2) {
		int sum=num1+num2;
		return sum;
		
		
	}
	public static int find_sub(int num1,int num2) {
		int sub=num1-num2;
		return sub;
		
		
	}
	public static int find_mul(int num1,int num2) {
		int mul=num1*num2;
		return mul;
		
		
	}
	public static int find_div(int num1,int num2) {
		int div=num1/num2;
		return div;
		
	}

}
