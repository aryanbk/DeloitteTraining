package com.deloitte.java.encapsulationdemo;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(10101, "Rakshit", 95, 90, 91);

		Grade grade = GradeCheck.checkResult(student);

		System.out.println(grade.getId() + " passed in the Exams with the Grade - " + grade.getResult());

	}

}