package com.assignments.day1_day2_and_day3;

public class Task_4_Arrays{
	public static void main(String[] args) {
		int [] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		System.out.println("Array after initialization:");
		for(int num: arr) {
		System.out.println(num);
		}
		
		System.out.println("Array reversed:");
		for(int i=arr.length-1;i>-1;i--) {
			System.out.println(arr[i]);
		}
	}
}
