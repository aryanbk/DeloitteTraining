package com.inheritancedemo;

class Manager extends Employee {
	public Manager() {
	}

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;
	}

	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = (15.0 / 100) * basicSalary;
		double salaryWithTransportAllowance = basicSalary + transportAllowance;
		System.out.println("Salary with Transport Allowance: " + salaryWithTransportAllowance);
	}
}