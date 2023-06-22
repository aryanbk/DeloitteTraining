package com.inheritancedemo;

class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double hra = 1000.50;

	public Employee() {
	}

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println("Calculated Salary: " + salary);
	}

	public void calculateTransportAllowance() {
		double transportAllowance = (10.0 / 100) * basicSalary;
		double salaryWithTransportAllowance = basicSalary + transportAllowance;
		System.out.println("Salary with Transport Allowance: " + salaryWithTransportAllowance);
	}
}