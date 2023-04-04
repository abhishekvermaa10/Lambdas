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
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		CustomComparator customComparator = new CustomComparator();

		Collections.sort(employeeList, customComparator::compareByName);
		System.out.println("Sort by name:");
		employeeList.forEach(System.out::println);

		Collections.sort(employeeList, customComparator::compareByMarks);
		System.out.println("Sort by age:");
		employeeList.forEach(System.out::println);
	}
}