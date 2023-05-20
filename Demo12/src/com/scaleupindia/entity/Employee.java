package com.scaleupindia.entity;

/**
 * @author abhishekvermaa10
 *
 */
public class Employee {
	private int id;
	private String name;
	private int marks;

	public Employee() {
		super();
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