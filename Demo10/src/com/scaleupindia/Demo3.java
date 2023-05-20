package com.scaleupindia;

import java.util.Collections;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.CustomComparator;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		CustomComparator customComparator = new CustomComparator();

		System.out.println("Sort by name:");
		Collections.sort(employeeList, customComparator::compareByName);
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("Sort by marks:");
		Collections.sort(employeeList, customComparator::compareByMarks);
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}