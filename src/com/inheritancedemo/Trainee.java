package com.inheritancedemo;

class Trainee extends Employee {
	public Trainee() {
	}

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;
	}
}