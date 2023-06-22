package com.dayTwo;

public class SimpleInterestCalculator {
	private double principalAmount;
	private int numberOfYears;

	public String calculateSimpleInterest() {
		double simpleInterest;

		if (principalAmount > 100000) {
			if (numberOfYears > 10) {
				simpleInterest = principalAmount * numberOfYears * 10 / 100;
			} else {
				simpleInterest = principalAmount * numberOfYears * 9.5 / 100;
			}
		} else {
			if (numberOfYears > 10) {
				simpleInterest = principalAmount * numberOfYears * 5 / 100;
			} else {
				simpleInterest = principalAmount * numberOfYears * 4.5 / 100;
			}
		}

		return "The interest amount for a principal of " + principalAmount + " and years " + numberOfYears + " is "
				+ simpleInterest;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator();
		calculator.setPrincipalAmount(100000);
		calculator.setNumberOfYears(12);
		System.out.println(calculator.calculateSimpleInterest());
	}
}
