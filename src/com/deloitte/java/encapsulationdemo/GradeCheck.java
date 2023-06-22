package com.deloitte.java.encapsulationdemo;

public class GradeCheck {

	public static Grade checkResult(Student student) {

		Grade grade = new Grade();
		grade.setId(student.getId());
		grade.setName(student.getName());

		int total = student.getMark1() + student.getMark2() + student.getMark3();
		float avg = total / 3;

		if (avg < 60) {
			grade.setResult("Fail");
		} else if (avg >= 60 && avg < 70) {
			grade.setResult("A");
		} else if (avg >= 70 && avg < 80) {
			grade.setResult("A+");
		} else if (avg >= 80 && avg < 90) {
			grade.setResult("A++");
		} else {
			grade.setResult("Distinction");
		}

		return grade;

	}
}