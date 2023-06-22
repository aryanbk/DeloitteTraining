package com.deloitte;

import java.util.Scanner;

class Circle {
	public static double calculateArea(int radius) {
		return 3.14 * radius * radius;
	}
}

class Triangle {
	public static double calculateArea(int sides) {
		return 0.433 * sides * sides;
	}
}

class Square {
	public static double calculateArea(int sides) {
		return sides * sides;
	}
}

public class Shapes {
	private int numberOfSides;

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public String calculateShapeArea(int sideLength) {
		String res;
		if (numberOfSides == 1) {
			double area = Circle.calculateArea(sideLength);
			res = "The Area of the Circle is " + area;
		} else if (numberOfSides == 3) {
			double area = Triangle.calculateArea(sideLength);
			res = "The Area of the Triangle is " + area;
		} else if (numberOfSides == 4) {
			double area = Square.calculateArea(sideLength);
			res = "The Area of the Square is " + area;
		} else {
			res = "No Shapes Present";
		}
		return res;
	}

	public static void main(String[] args) {
		Shapes shapes = new Shapes();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		int numberOfSides = scanner.nextInt();
		shapes.setNumberOfSides(numberOfSides);

		System.out.print("Enter the side length: ");
		int sideLength = scanner.nextInt();

		System.out.println(shapes.calculateShapeArea(sideLength));

		scanner.close();

	}

}
