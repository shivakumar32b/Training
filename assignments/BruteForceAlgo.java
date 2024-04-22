package com.assignments;

public class BruteForceAlgo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 6, 8, 4, 9, 23, 2, 9 };
		bruteForceSort(a, a.length);
		System.out.println("sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void bruteForceSort(int[] a, int length) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
