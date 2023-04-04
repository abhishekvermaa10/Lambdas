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

		Collections.sort(employeeList, CustomComparator::compareByName);
		System.out.println("Sort by name:");
		employeeList.forEach(System.out::println);

		Collections.sort(employeeList, CustomComparator::compareByMarks);
		System.out.println("Sort by age:");
		employeeList.forEach(System.out::println);
	}
}