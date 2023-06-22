package com.deloitte.java.encapsulationdemo;

public class Grade {

	private int id;
	private String name;
	private String result;

	public Grade() {
		// TODO Auto-generated constructor stub
	}

	public Grade(int id, String name, String result) {
		super();
		this.id = id;
		this.name = name;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}