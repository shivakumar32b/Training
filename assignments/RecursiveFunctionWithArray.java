package com.assignments;

public class RecursiveFunctionWithArray {
	public static int SumArray(int[] arr,int index) {
		if(index < 0) {
			return 0;
		}
		
		return arr[index]+ SumArray(arr, index-1);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
		
		sum = SumArray(arr,arr.length-1);
		System.out.println("Sum of elements is:"+sum);
	}
}
