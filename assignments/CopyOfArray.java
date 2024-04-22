package com.assignments;

public class CopyOfArray {
	public static int[] SliceArray(int[] arr, int start, int end) {
		int[] slice = new int[end + 1];
		for (int i = start; i < slice.length; i++) {
			slice[i] = arr[i];
		}
		return slice;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 7, 8, 4 };
		int[] newArray = SliceArray(arr, 0, arr.length - 1);
		System.out.println("Slice array:");
		for(int num: newArray) {
		System.out.print(num+" ");
		}
	}
}
