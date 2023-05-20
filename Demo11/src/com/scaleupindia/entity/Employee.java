package com.scaleupindia.entity;

/**
 * @author abhishekvermaa10
 *
 */
public class Employee {
	private int id;
	private String name;
	private int marks;

	public Employee(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}