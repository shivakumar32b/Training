package com.assignments.day1_day2_and_day3;
import java.util.Arrays;
public class Task_5_TwoSumProblem {
	
	public static boolean checkTwoSum(int[] arr, int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int sum = arr[start]+arr[end];
			if(sum == target) {
				return true;
			} else if (sum <target) {
				start++;
			}
			else {
				end--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,3,4,9};
		int target = 5;
		
		boolean result = checkTwoSum(arr, target);
		
		if(result) {
			System.out.println("Found two numbers that add up to the target");
		}
		else {
			System.out.println("There are no numbers that add up to the target");
		}
	}


}
