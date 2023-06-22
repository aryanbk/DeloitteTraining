package com.training.tax;

public class EmployeeTax {
	public static void main(String[] args) {
		// Test Case 1
		System.out.println("Test Case 1:");
		float basicSalary1 = 25000;
		boolean citizenship1 = true;

		TaxCalculator taxCalculator1 = new TaxCalculator(basicSalary1, citizenship1);
		taxCalculator1.calculateTax();
		taxCalculator1.deductTax();
		taxCalculator1.validateSalary();
		System.out.println();

		// Test Case 2
		System.out.println("Test Case 2:");
		float basicSalary2 = 125000;
		boolean citizenship2 = true;

		TaxCalculator taxCalculator2 = new TaxCalculator(basicSalary2, citizenship2);
		taxCalculator2.calculateTax();
		taxCalculator2.deductTax();
		taxCalculator2.validateSalary();
	}
}
