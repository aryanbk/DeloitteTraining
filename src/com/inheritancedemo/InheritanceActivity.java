package com.inheritancedemo;

public class InheritanceActivity {
	public static void main(String[] args) {
		// Test case #1: Create an instance of Manager class
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		manager.calculateSalary();
		manager.calculateTransportAllowance();

		// Test case #2: Create an instance of Trainee class
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();
	}
}