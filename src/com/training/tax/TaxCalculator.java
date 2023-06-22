package com.training.tax;

public class TaxCalculator {
	private float basicSalary;
	private boolean citizenship;
	private float tax;
	private int nettSalary;

	public TaxCalculator(float basicSalary, boolean citizenship) {
		this.basicSalary = basicSalary;
		this.citizenship = citizenship;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public boolean isCitizenship() {
		return citizenship;
	}

	public void setCitizenship(boolean citizenship) {
		this.citizenship = citizenship;
	}

	public void calculateTax() {
		tax = (30 * basicSalary) / 100;
		System.out.println("The Tax of the employee for the basic salary " + basicSalary + " is " + tax);
	}

	public void deductTax() {
		nettSalary = (int) (basicSalary - tax);
		System.out.println("The nett salary of the employee is " + nettSalary);
	}

	public void validateSalary() {
		boolean eligibility = (basicSalary > 100000 && citizenship);
		System.out.println("The salary and citizenship eligibility: " + eligibility);
	}

}
