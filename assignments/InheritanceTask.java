package com.assignments;

class Shape{
	public double area() {
		return 0;
	}
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		this.length = length; 
		this.width = width;
	}
	public double area() {
		return 2 * length * width;
	}
}

public class InheritanceTask {
	
	public static void main(String[] args) {
	Circle circle = new Circle(4);
	Rectangle rectangle = new Rectangle(4,6);
	
	System.out.println("Area of Circle:"+circle.area());
	System.out.println("Area of Rectangle:"+rectangle.area());

	}
}
