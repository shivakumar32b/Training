package com.assignments;

public class FibonacciSeries {
    static int FibonacciRecursive(int n, int[] array) {
        if (n <= 1) {
            array[n] = n;
            return n;
        }
        array[n] = FibonacciRecursive(n - 1, array) + FibonacciRecursive(n - 2, array);
        return array[n];
    }

    public static void main(String[] args) {
        int num = 9;
        int[] arr = new int[num + 1];
        FibonacciRecursive(num, arr);
        System.out.println("Fibonacci array:");
        for (int fibNum : arr) {
            System.out.print(fibNum + " ");
        }

        int nthNumber = arr[num]; 
        System.out.println("\nThe nth element of Fibonacci series is:" + nthNumber);
    }
}
