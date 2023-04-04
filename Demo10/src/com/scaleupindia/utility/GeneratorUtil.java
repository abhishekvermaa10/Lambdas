package com.scaleupindia.utility;

import java.util.ArrayList;
import java.util.List;

import com.scaleupindia.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public class GeneratorUtil {
	public static List<Employee> populateEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", 60));
		employeeList.add(new Employee(177, "Sneh", 55));
		employeeList.add(new Employee(129, "John", 20));
		employeeList.add(new Employee(101, "Abhishek", 50));
		employeeList.add(new Employee(153, "Robert", 44));
		employeeList.add(new Employee(102, "Elisa", 90));
		return employeeList;
	}

	public static List<String> populateNames(List<Employee> employeeList) {
		List<String> nameList = new ArrayList<>();
		for (Employee employee : employeeList) {
			nameList.add(employee.getName());
		}
		return nameList;
	}
}