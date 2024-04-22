package com.assignments;

import com.math.operations.Addition;
import com.math.operations.Division;
import com.math.operations.Multiplication;
import com.math.operations.Subtraction;

public class PackageTask {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int sum = Addition.add(a, b);
		System.out.println("Sum:" + sum);
		int difference = Subtraction.subtract(a, b);
		System.out.println("Difference:" + difference);
		int product = Multiplication.multiply(a, b);
		System.out.println("Product:"+product);
		double quotient = Division.divide(a, b);
		System.out.println("Quotient:"+quotient);
	}
}
