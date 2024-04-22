package com.assignments;

public class DataTypes_Variables {
	public static void main(String[] args) {
		int a = 2, b = 3;
		System.out.println("Values before swapping - a:" + a + "b: " + b);
		a = a+ b;
		b = a - b;
		a = a - b;
		System.out.println("Values after swapping - a:"+a+"b: "+b);
	}
}
